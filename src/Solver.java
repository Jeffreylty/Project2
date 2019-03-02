import java.util.HashSet;

public class Solver {


    public Assignment BacktrackingSearchSolve(CSP csp ,Assignment as){
        if(csp.isComplete(as)){
            return as;
        }else{
            Variable v = Select_Unassigned(csp, as);
            for(Contype c : Choose(v)){
//                if(isConsis(v, c, as, csp ))
            }

        }

        return null;
    }

    public Variable Select_Unassigned(CSP csp , Assignment as){
        for(Variable v : csp.variables ){
            if(!as.contains(v)){
                return v;
            }
        }
        return null;
    }


    public HashSet<Contype> Choose(Variable v){
        HashSet<Contype> result= new HashSet<Contype>();
        for(Contype c :v.dom.domain){
            result.add(c);
        }
        return result;
    }

//    public boolean isConsis(Variable v, Contype c, Assignment as, CSP csp){
//        for(Constraint cons : csp.constraints){
//            if(cons instanceof NotEqualConstraint){
//                cons.
//            }
//            switch (cons.getConsType()){
//                case 1:
//                    if(cons.NotEqual.contains(v)){
//                        for(Variable temp : cons.NotEqual){
//                            if(temp.name.equals(v.name)){
//
//                            }
//                        }
//                    }
//                    break;
//
//                default:
//                    System.out.println("defalut constraint type");
//                    break;
//            }
//        }
//    }

}
