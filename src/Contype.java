public class Contype  { //the class store the possible value for vairiable. which is represented by a string
    String value;

    public static Contype iniWith(String i){
        Contype c= new Contype();
        c.value =i;
        return c;
    }

    public String getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return value;
    }
}
