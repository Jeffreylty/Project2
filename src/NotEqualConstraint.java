import java.util.HashSet;

public class NotEqualConstraint extends Constraint {

    public NotEqualConstraint(Variable Va, Variable Vb){
        this.NotEqual = new HashSet<Variable>();
        this.NotEqual.add(Va);
        this.NotEqual.add(Vb);
    }


}
