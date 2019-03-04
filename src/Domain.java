import java.util.HashSet;

public class Domain {
    HashSet<Contype> domain;

    public static Domain rgbDomain(){
        Domain result =new Domain();
        result.domain =new HashSet<Contype>();
        result.domain.add(Contype.iniWith("Red"));
        result.domain.add(Contype.iniWith("Green"));
        result.domain.add(Contype.iniWith("Blue"));
        return result;
    }

    public static Domain JobDomain(){
        Domain result =new Domain();
        result.domain =new HashSet<Contype>();
        for(int i=1; i<=27;i++){
            result.domain.add(Contype.iniWith(Integer.toString(i)));
        }
        return result;
    }
}

