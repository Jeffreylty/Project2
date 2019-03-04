import java.util.HashMap;

public class Assignment {
    HashMap<Variable,Contype> asign;

    public Assignment(){
        this.asign = new HashMap<Variable, Contype>();
    }

    public void put(Variable v, Contype c){
        this.asign.put(v,c);
    }

    public boolean contains(Variable v){
        return this.asign.containsKey(v);
    }

    public Contype getValue(Variable v){
        return this.asign.get(v);
    }

    public void delete(Variable v){
        this.asign.remove(v);
    }

}
