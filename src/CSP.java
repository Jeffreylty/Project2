import java.util.HashSet;

public class CSP {
    HashSet<Variable> variables;
    HashSet<Constraint> constraints;

    public boolean isComplete(Assignment as){
        for(Variable v : variables){
            if(!as.contains(v)){
                return false;
            }
        }
        return true;
    }

}
