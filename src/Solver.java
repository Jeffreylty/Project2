import java.util.ArrayList;

public class Solver {


    //main backtraking method
    public Assignment BacktrackingSearchSolve(CSP csp ,Assignment as){
        if(csp.isComplete(as)){
            return as;
        }else{
            Variable v = Select_Unassigned(csp, as);
            for(Contype c : Choose(v)){
                as.put(v,c);
                if(isConsis(as, csp)){
                    Assignment result= BacktrackingSearchSolve(csp, as);
                    if(result!= null){
                        return result;
                    }
                    as.delete(v);
                }else{
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
