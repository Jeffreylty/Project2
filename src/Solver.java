import java.util.ArrayList;

public class Solver {


    //main backtraking method
    public Assignment BacktrackingSearchSolve(CSP csp ,Assignment as){
        if(csp.isComplete(as)){ //if complete then return
            return as;
        }else{
            Variable v = Select_Unassigned(csp, as); //else select unassigned aviriable
            for(Contype c : Choose(v)){ //choose a value from domain
                as.put(v,c);
                if(isConsis(as, csp)){ // if it is consistent, continue
                    Assignment result= BacktrackingSearchSolve(csp, as); //if continue has a complete solution, then return else delete from the current assignment.
                    if(result!= null){
                        return result;
                    }
                    as.delete(v);
                }else{ //else delete from assignment and try with another possible value
                    as.delete(v);
                }
            }
        }
        return null;
    }

    //select unasigned variable
    public Variable Select_Unassigned(CSP csp , Assignment as){
        for(Variable v : csp.variables ){
            if(!as.contains(v)){
                return v;
            }
        }
        return null;
    }


    //select possible assignment from domain
    public ArrayList<Contype> Choose(Variable v){
        ArrayList<Contype> result= new ArrayList<Contype>();
        for(Contype c :v.dom.domain){
            result.add(c);
        }
        return result;
    }

    //the main method that call individual isconsistent method for each constraint
    public boolean isConsis(Assignment as, CSP csp){
        for(Constraint cons : csp.constraints){
            if(!cons.isConsistent(as)){
                return false;
            }
        }
        return true;
    }

}
