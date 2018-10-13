import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class pokemonBattle {
        public static void main(String args[]) {
        moves[] movePool = new moves[415];
        ohdear od = new ohdear();
        od.setMovePool(movePool);
        // try{
        //     FileOutputStream fout = new FileOutputStream("moves.ser");
        //     ObjectOutputStream oos = new ObjectOutputStream(fout);
        //     oos.writeObject(Psychic);
        // } catch (IOException i) {
        //     i.printStackTrace();
        // }
        moves[] yourMoves = new moves[4];
        moves[] thrMoves = new moves[4];

        pokemon Alakazam = new pokemon(96, 52, 51, 121, 81, 107, 40, 1.5, 10, "Alakazam", "Psychic");
        for(int z= 0; z <4; z++){
            thrMoves[z] = movePool[(int)Math.floor(Math.random()*movePool.length)];
        }
        Scanner reader = new Scanner(System.in);
        int hp, atk, def, spatk, spdef, spd, level, base, acc, numofMoves, index;
        String name, type, cate = "";
        String choice;
        boolean foundMove = false;
        System.out.println("Create pokemon? If you select no, a random pokemon will be assigned to you.(y/n)");
        choice = reader.next();
        if ("y".equalsIgnoreCase(choice)) {
            System.out.println("Name: ");
            name = reader.next();
            System.out.println("Level: ");
            level = reader.nextInt();
            System.out.println("HP: ");
            hp = reader.nextInt();
            System.out.println("Attack: ");
            atk = reader.nextInt();
            System.out.println("Defense: ");
            def = reader.nextInt();
            System.out.println("Special Attack: ");
            spatk = reader.nextInt();
            System.out.println("Special Defense: ");
            spdef = reader.nextInt();
            System.out.println("Speed: ");
            spd = reader.nextInt();
            System.out.println("Type: ");
            type = reader.next();
            pokemon usrPokemon = new pokemon(hp, atk, def, spatk, spdef, spd, level, 1.5, 0, name, type);
            usrPokemon.statsTable();

        } else if ("n".equalsIgnoreCase(choice)) {
        }

        for (numofMoves = 0; numofMoves < 4; numofMoves++) {
            System.out.println("Add custom pokemon move? If you select no, a random move will be assigned. Currently, you have "+ numofMoves +" moves(y/n)");
            choice = reader.next();
            if ("y".equalsIgnoreCase(choice)) {
                System.out.println("Name: ");
                name = reader.next();
                for(moves a : movePool){
                    if((a.name).equalsIgnoreCase(name)){
                        System.out.println("Move found in database!");
                        yourMoves[numofMoves] = a;
                        System.out.println(a.name + " added!");
                        foundMove = true;
                        break;
                    }
                }
                if(foundMove == false){
                    System.out.println("Base power");
                    base = reader.nextInt();
                    System.out.println("Type");
                    type = reader.next();
                    System.out.println("Accuracy");
                    acc = reader.nextInt();
                    System.out.println("Category(special/physical)");
                    cate = reader.next();

                    moves customMove = new moves(type, name, base, acc, cate);
                    System.out.println(customMove.name + " added!");
                    yourMoves[numofMoves] = customMove;
                }

            } else if ("n".equalsIgnoreCase(choice)) {
                index = (int)Math.floor(Math.random()*movePool.length);
                System.out.println(index);
                moves randomMove = movePool[index];
                yourMoves[numofMoves] = randomMove;
                System.out.println(randomMove.name + " added!");
            }
        }
    }
    public void initBattle(pokemon yourPokemon, pokemon theirPokemon, moves[] yrmv, moves[] thrmv) {
        Scanner reader = new Scanner(System.in);
        boolean yourTurn;
        int c, curatk, curdef;
        double prb;
        
        if (yourPokemon.spd > theirPokemon.spd) {
            yourTurn = true;
        } else {
            yourTurn = false;
        }
        while (yourPokemon.hp >= 0 && theirPokemon.hp >= 0) {
            if (yourTurn) {
                System.out.println("Which move will you use? Your options are(1/2/3/4): ");
                for (var m = 0; m < 4; m++) {
                    System.out.println(m + ". " + yrmv[m].name);
                }
                c = reader.nextInt();
                c = c - 1;
                if (yrmv[c].type == yourPokemon.type) {
                    yourPokemon.stab = 1.5;
                } else {
                    yourPokemon.stab = 1;
                }
                yourPokemon.base = yrmv[c].base;
                System.out.println(yourPokemon.name + "used " + yrmv[0].name + "!");
                prb = Math.floor(Math.random() * 100 - yrmv[c].accuracy) + yrmv[c].accuracy;
                
                if (prb != 1) {

                    curatk = yrmv[c].cate == "physical" ? yourPokemon.atk:yourPokemon.spatk;
                    curdef = yrmv[c].cate == "physical" ? theirPokemon.def:theirPokemon.spdef;
                    System.out.println("It did " + yourPokemon.damage(theirPokemon, curatk, curdef) + " damage. " + theirPokemon.name + " is now at " + theirPokemon.hp + "hp");
                } else {
                    System.out.println("It missed!");
                }
                if (theirPokemon.hp <= 0) {
                    System.out.println(yourPokemon.name + " has won the battle! Congratulations!");

                }
                yourTurn = false;

            } else {
                c = (int) Math.floor(Math.random() * 3.0);
                if (thrmv[c].type == theirPokemon.type) {
                    theirPokemon.stab = 1.5;
                } else {
                    theirPokemon.stab = 1;
                }
                theirPokemon.base = thrmv[c].base;
                System.out.println(theirPokemon.name + "used " + yrmv[0].name + "!");
                prb = Math.floor(Math.random() * 100 - thrmv[c].accuracy) + thrmv[c].accuracy;

                if (prb != 1) {
                    curatk = thrmv[c].cate == "physical" ? theirPokemon.atk:theirPokemon.spatk;
                    curdef = thrmv[c].cate == "physical" ? yourPokemon.def:yourPokemon.spdef;
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