import java.util.ArrayList;
// super class of each CSP, contains a list of Variable and a list of Constraint
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
    // print each problem before solving it.
    public String toString() {
        String result ="CSP: \nVariables: "; //print each variable's name
        for(Variable v: variables){
            result+=v.name +" ";
        }
        result+= "\nConstraints: \n ";
        for(Constraint c :constraints){ //print each constraint by using individual toString methods.
            result += c.toString();
            result += "\n ";
        }
        result+="\n";
        return result;
    }
}
