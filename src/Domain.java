import java.util.ArrayList;

public class Domain {
    ArrayList<Contype> domain;

    public static Domain rgbDomain(){
        Domain result =new Domain();
        result.domain =new ArrayList<Contype>();
        result.domain.add(Contype.iniWith("Red"));
        result.domain.add(Contype.iniWith("Green"));
        result.domain.add(Contype.iniWith("Blue"));
        return result;
    }

    public static Domain JobDomain(){
        Domain result =new Domain();
        result.domain =new ArrayList<Contype>();
        for(int i=1; i<=27;i++){
            result.domain.add(Contype.iniWith(Integer.toString(i)));
        }
        return result;
    }

    public static Domain NQueenDomain(String col, int n){
        Domain result =new Domain();
        result.domain =new ArrayList<Contype>();
        for(int i=0; i< n;i++){
            result.domain.add(Contype.iniWith(Integer.toString(i) +","+col));
        }
        return result;
    }
}

