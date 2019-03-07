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

    @Override
    public String toString() {
        String result ="CSP: \nVariables: ";
        for(Variable v: variables){
            result+=v.name +" ";
        }
        result+= "\nConstraints: \n ";
        for(Constraint c :constraints){
            result += c.toString();
            result += "\n ";
        }
        result+="\n";
        return result;
    }
}
