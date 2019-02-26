import java.util.HashSet;

public class Domain {
    HashSet<Contype> color;


    public static Domain rgbDomain(){
        Domain result =new Domain();
        result.color =new HashSet<Contype>();
        result.color.add(Contype.Red);
        result.color.add(Contype.Blue);
        result.color.add(Contype.Green);
        return result;
    }
}

