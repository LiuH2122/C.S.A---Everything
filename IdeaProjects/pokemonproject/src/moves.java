import java.io.Serializable;

public class moves implements Serializable{
    public String type, name, cate;
    public int base;
    public int accuracy;
    moves(String type, String name, int base, int accuracy, String cate){
        this.type = type;
        this.base = base;
        this.name = name;
        this.accuracy = accuracy;
        this.cate = cate;
    }


}
