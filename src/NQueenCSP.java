import java.util.ArrayList;

public class NQueenCSP extends CSP {

    public NQueenCSP(int n){
        this.variables = new ArrayList<Variable>();

        for(int i = 0; i< n; i++){
            Variable Queen = new Variable("Queen"+Integer.toString(i+1), Domain.NQueenDomain(Integer.toString(i),n));
            this.variables.add(Queen);
        }


        this.constraints =new ArrayList<Constraint>();
        for(Variable v1 : this.variables){
            for(Variable v2 : this.variables){
                if(!v1.equals(v2)){
                    this.constraints.add(new NotAttackingConstraint(v1,v2));
                }
            }
        }

    }
}
