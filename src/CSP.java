import java.util.ArrayList;

public class CSP {
    ArrayList<Variable> variables;
    ArrayList<Constraint> constraints;

    public boolean isComplete(Assignment as){
        for(Variable v : variables){
            if(!as.contains(v)){
                return false;
            }
        }
        return true;
    }

}
