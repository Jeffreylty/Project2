import java.util.HashSet;

public class NotEqualConstraint extends Constraint {
    HashSet<Variable> NotEqual;

    public NotEqualConstraint(Variable Va, Variable Vb){
        this.NotEqual = new HashSet<Variable>();
        this.NotEqual.add(Va);
        this.NotEqual.add(Vb);
    }

    @Override
    public boolean isConsistent(Assignment as) {
        HashSet<Contype> test =new HashSet<Contype>();
        for(Variable temp : this.NotEqual){
            Contype temp1 =as.getValue(temp);
            if(temp1 !=null) {
                if (test.contains(temp1)) {
                    return false;
                } else {
                    test.add(temp1);
                }
            }
        }
        return true;
    }
}
