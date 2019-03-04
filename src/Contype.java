public class Contype  {
    String value;

    public static Contype iniWith(String i){
        Contype c= new Contype();
        c.value =i;
        return c;
    }

    public String getValue(){
        return this.value;
    }



}
