import java.util.Scanner;
public class pokemonBattle {


    public static void main(String args[]) {
        pokemon Alakazam = new pokemon(96, 52, 51, 121, 81, 107, 40, 1.5, 10, "Alakazam", "Psychic");
        moves
        Scanner reader = new Scanner(System.in);
        int hp, atk, def, spatk, spdef, spd, level, stab, base;
        String name, type;
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

    }
    public void pokemonBattle(pokemon yourPokemon, pokemon theirPokemon){
        while(yourPokemon.hp>=0 && theirPokemon.hp>=0){


        }
    }

}
