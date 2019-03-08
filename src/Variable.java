public class Variable {
    String name;
    Domain dom;

    public Variable(String name, Domain dom){
        this.name = name;
        this.dom =dom;
    }

    @Override
    public String toString() {
        return name;
    }
}


