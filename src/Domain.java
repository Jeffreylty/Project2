import java.util.HashSet;

public class Domain {
    HashSet<Contype> domain;

    public static Domain rgbDomain(){
        Domain result =new Domain();
        result.domain =new HashSet<Contype>();
        result.domain.add(Contype.Red);
        result.domain.add(Contype.Blue);
        result.domain.add(Contype.Green);
        return result;
    }
}

