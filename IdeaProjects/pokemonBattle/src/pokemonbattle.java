import java.util.Scanner;
public class pokemonbattle {

    pokemon Alakazam = new pokemon(96, 52, 51, 121, 81, 107, 40, 1.5, 10, "Alakazam", "Psychic");
    
    public static void main(String args) {
        Scanner reader = new Scanner(System.in);
        int hp, atk, def, spatk, spdef, spd, level, stab, base;
        String name, type;
        System.out.println("Create your pokemon!");
        System.out.println("Name: ");
        name = reader.nextLine();
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
        System.out.println("Type: ");
        type = reader.nextLine();
      
        pokemon usrPokemon = new pokemon(hp, atk, def, spatk, spdef, spd, level, 1.5, 10, name, type);

    }
    
}
