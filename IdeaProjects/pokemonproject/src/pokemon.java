import java.io.Serializable;
import java.util.Random;
public class pokemon implements Serializable{
    public int hp, atk, def, spatk, spdef, spd, level, base;
    public String name, type;
    public double stab;
    Random rand = new Random();

    pokemon(int hp, int atk, int def, int spatk, int spdef, int spd, int level, double stab, int base, String name, String type){
        this.level = level;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spatk = spatk;
        this.spdef = spdef;
        this.spd = spd;
        this.stab = stab;
        this.base = base;
        this.name = name;
        this.type = type;

    }
    public int damage(pokemon otherPokemon, int attackpower, int defpower){
        double randMultiplier = (0.15 * rand.nextDouble()) + 0.85;
        double dmg = (((2*this.level+10)/250) + ((double)attackpower/defpower)*this.base+2)*this.stab*randMultiplier;
        int newdmg = (int)dmg;
        otherPokemon.hp -= newdmg;
        return newdmg;
    }
    public void increaseLevel(int level){
        this.hp += (int)((this.hp/50.0)* level);
        this.atk += (int)((this.atk/50.0)* level);
        this.def += (int)((this.def/50.0)* level);
        this.spatk += (int)((this.spatk/50.0)* level);
        this.spdef += (int)((this.spdef/50.0)* level);
        this.spd += (int)((this.spd/50.0)* level);

    }
    public void statsTable(){
        System.out.println("------POKEMON STATS------");
        System.out.println("Name     " + this.name);
        System.out.println("Level    " + this.level);
        System.out.println("Type     " + this.type);
        System.out.println("-------------------------");
        System.out.println("HP       " + this.hp);
        System.out.println("ATTACK   " + this.atk);
        System.out.println("DEFENSE  " + this.def);
        System.out.println("SP. ATK  " + this.spatk);
        System.out.println("SP. DEF  " + this.spdef);
        System.out.println("SPEED    " + this.spd);
        System.out.println("-------------------------");

    }
}
