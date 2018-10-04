import java.util.Scanner;
public class pokemonBattle {

    public void getMovesPool(){
        moves Psychic = new moves("Psychic", "attack", "Psychic", 90, 100);
    }
    public static void main(String args[]) {
        moves[] yourMoves = new moves[4];

        pokemon Alakazam = new pokemon(96, 52, 51, 121, 81, 107, 40, 1.5, 10, "Alakazam", "Psychic");
        Scanner reader = new Scanner(System.in);
        int hp, atk, def, spatk, spdef, spd, level, stab, base, acc, numofMoves;
        String name, type, func;
        String choice;
        System.out.println("Create pokemon? If you select no, a random pokemon will be assigned to you.(y/n)");
        choice = reader.next();
        if(choice == "y"){
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
        }
        else if(choice == "n"){
            Alakazam.statsTable();
        }
        for(numofMoves = 0; numofMoves<4; numofMoves++) {
            System.out.println("Add pokemon move? If you select no, random moves will be assigned until you have 4 moves. Currently, you have (y/n)");
            choice = reader.next();
            if (choice == "y") {
                System.out.println("Name: ");
                name = reader.next();
                System.out.println("Function(attack/heal/raise stat");
                func = reader.next();
                System.out.println("Base power");
                base = reader.nextInt();
                System.out.println("Type");
                type = reader.next();
                System.out.println("Accuracy");
                acc = reader.nextInt();

                moves customMove = new moves(type, func, name, base, acc);

                yourMoves[numofMoves] = customMove;


            } else if (choice == "n") {
            }
        }

    }
    public void pokemonBattle(pokemon yourPokemon, pokemon theirPokemon, moves[] yrmv){
        Scanner reader = new Scanner(System.in);
        boolean yourTurn, theirTurn;
        int c;
        if(yourPokemon.spd>theirPokemon.spd) {
            yourTurn = true;
            theirTurn = false;
        }
        else{
            theirTurn = true;
            yourTurn = false;
        }
        while(yourPokemon.hp>=0 && theirPokemon.hp>=0){
            if(yourTurn){
                System.out.println("Which move will you use? Your options are(1/2/3/4): ");
                for(var m = 0; m<4; m++){
                    System.out.println(m + ". " + yrmv[m].name);
                }
                c = reader.nextInt();

                if(yrmv[c].type == yourPokemon.type){
                    yourPokemon.stab = 1.5;
                }
                else{
                    yourPokemon.stab = 1;
                }
                System.out.println(yourPokemon.name + "used " + yrmv[0].name + "!");
                Math.floor(Math.random()+yrmv[c].accuracy);
                System.out.println("It did " + yourPokemon.damage(theirPokemon) + " damage. " + theirPokemon.name + " is now at " + theirPokemon.hp + "hp");

                }
            }
        }
    }

}
