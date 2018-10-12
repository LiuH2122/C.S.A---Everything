import java.io.Serializable;

public class moves implements Serializable{
    public String type, name, func, cate;
    public int base;
    public int accuracy;
    moves(String type, String func, String name, int base, int accuracy, String cate){
        this.type = type;
        this.func = func;
        this.base = base;
        this.name = name;
        this.accuracy = accuracy;
        this.cate = cate;
    }


}
