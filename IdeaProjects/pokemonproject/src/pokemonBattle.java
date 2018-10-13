import java.util.Scanner;

import java.io.IOException;

import java.io.Serializable;


public class pokemonBattle {
    public static void main(String args[]) {
        
        //GETS ALL POKEMON AND MOVES
        pokemon[] pokemonPool = new pokemon[909];
        moves[] movePool = new moves[415];
        ohdear od = new ohdear();
        od.setMovePool(movePool);
        od.getPokemonPool(pokemonPool);        
        
        //Variable initialization
        moves[] yourMoves = new moves[4];
        moves[] thrMoves=  new moves[4];
        Scanner reader = new Scanner(System.in);
        int hp, atk, def, spatk, spdef, spd, level, base, acc, numofMoves, index;
        hp = atk = def = spatk = spdef = spd = level  = base = acc = numofMoves = index = 0;
        int stab = 0;
        String name, type, cate;
        name = type = cate = "";
        String choice;
        boolean foundMove = false;
        boolean foundPokemon = false;
        boolean validate1 = false;
        boolean validate2 = false;
        pokemon usrPokemon = new pokemon(hp, atk, def, spatk, spdef, spd, level, stab, base, name, type);
        System.out.println("Create pokemon? If you select no, a random pokemon will be assigned to you.(y/n)");
        choice = reader.next();
        validate1 = choice.equalsIgnoreCase("y");
        validate2 = choice.equalsIgnoreCase("n");
        while(validate1 == false && validate2 == false){
            System.out.println("Input not recognized! Try again!");
            System.out.println("Add custom pokemon move? If you select no, a random move will be assigned. Currently, you have "+ numofMoves +" moves(y/n)");
            choice = reader.next();
            validate1 = choice.equalsIgnoreCase("y");
            validate2 = choice.equalsIgnoreCase("n");
        }
        if ("y".equalsIgnoreCase(choice)) {
            System.out.println("Name: ");
            name = reader.next();
            for(pokemon a : pokemonPool){
                try{
                    if((a.name).equalsIgnoreCase(name)){
                        System.out.println("Pokemon found in pokemon pool!");
                        usrPokemon = a;
                        System.out.println(a.name + " selected!");
                        System.out.println("Enter the level for " + usrPokemon.name);
                        level = reader.nextInt();
                        usrPokemon.level = level;
                        usrPokemon.increaseLevel(level-1);
                        usrPokemon.statsTable();
                        foundPokemon = true;
                        break;
                    }

                }
                catch(Exception e){

                }
            }
            if(foundPokemon == false){
                System.out.println("Level: ");
                level = reader.nextInt();
                System.out.println("Base HP: ");
                hp = reader.nextInt();
                System.out.println("Base Attack: ");
                atk = reader.nextInt();
                System.out.println("Base Defense: ");
                def = reader.nextInt();
                System.out.println("Base Special Attack: ");
                spatk = reader.nextInt();
                System.out.println("Base Special Defense: ");
                spdef = reader.nextInt();
                System.out.println("Base Speed: ");
                spd = reader.nextInt();
                System.out.println("Type: ");
                type = reader.next();
                usrPokemon = new pokemon(hp, atk, def, spatk, spdef, spd, level, 1.5, 0, name, type);
                System.out.println(usrPokemon.name + " selected!");
                usrPokemon.level = level;

                usrPokemon.increaseLevel(level-1);
                usrPokemon.statsTable();
            }

        } else if ("n".equalsIgnoreCase(choice)) {
            usrPokemon = pokemonPool[(int)Math.floor(Math.random()*pokemonPool.length)];
            System.out.println(usrPokemon.name + " selected!");
            System.out.println("Enter the level for " + usrPokemon.name);
            level = reader.nextInt();
            usrPokemon.level = level;
            usrPokemon.increaseLevel(level-1);
            usrPokemon.statsTable();
        }
        
        for (numofMoves = 0; numofMoves < 4; numofMoves++) {
            System.out.println("Add custom pokemon move? If you select no, a random move will be assigned. Currently, you have "+ numofMoves +" moves(y/n)");
            choice = reader.next();
            validate1 = choice.equalsIgnoreCase("y");
            validate2 = choice.equalsIgnoreCase("n");
            while(validate1 == false && validate2 == false){
                System.out.println("Input not recognized! Try again!");
                System.out.println("Add custom pokemon move? If you select no, a random move will be assigned. Currently, you have "+ numofMoves +" moves(y/n)");
                choice = reader.next();
                validate1 = choice.equalsIgnoreCase("y");
                validate2 = choice.equalsIgnoreCase("n");
            }


            if ("y".equalsIgnoreCase(choice)) {
                System.out.println("Name: ");
                name = reader.next();
                for(moves a : movePool){
                    try{
                        if((a.name).equalsIgnoreCase(name)){
                            System.out.println("Move found in move pool!");
                            yourMoves[numofMoves] = a;
                            System.out.println(a.name + " added!");
                            foundMove = true;
                            break;
                        }

                    }
                    catch(Exception e){

                    }
                }
                if(foundMove == false){
                    System.out.println("Base power:");
                    base = reader.nextInt();
                    System.out.println("Type:");
                    type = reader.next();
                    System.out.println("Accuracy:");
                    acc = reader.nextInt();
                    System.out.println("Category(special/physical):");
                    cate = reader.next();
                    while(cate.equalsIgnoreCase("physical") == false && cate.equalsIgnoreCase("special") == false){
                        System.out.println("Input not recognized! Try again!");
                        System.out.println("Category(special/physical)");
                        cate = reader.next();
                    }
                    moves customMove = new moves(type, name, base, acc, cate);
                    System.out.println(customMove.name + " added!");
                    yourMoves[numofMoves] = customMove;
                }

            } else if ("n".equalsIgnoreCase(choice)) {
                index = (int)Math.floor(Math.random()*movePool.length);
                moves randomMove = movePool[index];
                yourMoves[numofMoves] = randomMove;
                System.out.println(randomMove.name + " added!");
            }
        }

        pokemonBattle pb = new pokemonBattle();
        pokemon oppPokemon = pokemonPool[(int)Math.floor(Math.random()*pokemonPool.length)];
        System.out.println("Your opponent is: " + oppPokemon.name);
        oppPokemon.level = level;
        oppPokemon.increaseLevel(usrPokemon.level-1);
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            
        } 
        oppPokemon.statsTable();
        for(int z = 0; z< thrMoves.length;z++){
             thrMoves[z] = movePool[(int)Math.floor(Math.random()*movePool.length)];
        }
        pb.initBattle(usrPokemon, oppPokemon, yourMoves, thrMoves);

    }


    public void initBattle(pokemon yourPokemon, pokemon theirPokemon, moves[] yrmv, moves[] thrmv) {
        Scanner reader = new Scanner(System.in);
        boolean yourTurn;
        int c, curatk, curdef;
        double prb;
        System.out.println("It's a battle between " + yourPokemon.name + " and " + theirPokemon.name + "! Go!");
        if (yourPokemon.spd > theirPokemon.spd) {
            yourTurn = true;
        } else {
            yourTurn = false;
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            
        }          while (yourPokemon.hp >= 0 && theirPokemon.hp >= 0) {
            if (yourTurn) {
                System.out.println("Which move will you use? Your options are(1/2/3/4): ");
                for (var m = 0; m < 4; m++) {
                    System.out.println(m+1 + ". " + yrmv[m].name);
                    try{
                        Thread.sleep(500);
                    }
                    catch(Exception e){
                        
                    }                  }

                c = reader.nextInt();
                while(c!=1 && c!= 2 && c!=3 && c!= 4){
                    System.out.println("Input not recognized! Try again!(1/2/3/4)");
                    for (var m = 0; m < 4; m++) {
                        System.out.println(m+1 + ". " + yrmv[m].name);
                    }
                    c = reader.nextInt();
                }

                c = c - 1;
                if (yourPokemon.type.indexOf(yrmv[c].type) != -1) {
                    yourPokemon.stab = 1.5;
                } else {
                    yourPokemon.stab = 1;
                }
                yourPokemon.base = yrmv[c].base;
                System.out.println(yourPokemon.name + " used " + yrmv[c].name + "!");
                prb = Math.floor(Math.random() * 100 - yrmv[c].accuracy) + yrmv[c].accuracy;
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    
                }  
                if (prb != 1) {

                    curatk = yrmv[c].cate.equalsIgnoreCase("physical") ? yourPokemon.atk:yourPokemon.spatk;
                    curdef = yrmv[c].cate.equalsIgnoreCase("physical") ? theirPokemon.def:theirPokemon.spdef;
                    System.out.println("It did " + yourPokemon.damage(theirPokemon, curatk, curdef) + " damage. " + theirPokemon.name + " is now at " + theirPokemon.hp + "hp");
                
                } else {
                    System.out.println("It missed!");
                }
                if (theirPokemon.hp <= 0) {
                    System.out.println(yourPokemon.name + " has won the battle! Congratulations!");

                }
                yourTurn = false;

            } else {
                try{
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    
                }                
                
                c = (int) Math.floor(Math.random() * 3.0);
                
                if (theirPokemon.type.indexOf(thrmv[c].type) != -1) {
                    theirPokemon.stab = 1.5;
                } else {
                    theirPokemon.stab = 1;
                }
                theirPokemon.base = thrmv[c].base;
                System.out.println(theirPokemon.name + " used " + thrmv[c].name + "!");
                prb = Math.floor(Math.random() * 100 - thrmv[c].accuracy) + thrmv[c].accuracy;
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){

                }
                if (prb != 1) {
                
                    curatk = thrmv[c].cate.equalsIgnoreCase("physical") ? theirPokemon.atk:theirPokemon.spatk;
                    curdef = thrmv[c].cate.equalsIgnoreCase("physical") ? yourPokemon.def:yourPokemon.spdef;
                    System.out.println("It did " + theirPokemon.damage(yourPokemon, curatk, curdef) + " damage. " + yourPokemon.name + " is now at " + yourPokemon.hp + "hp");
                
                } else {
                    System.out.println("It missed!");
                }

                if (yourPokemon.hp <= 0) {
                    System.out.println(theirPokemon.name + " has won the battle! You lost!");

                }
                yourTurn = true;

            }
        }
    }
}