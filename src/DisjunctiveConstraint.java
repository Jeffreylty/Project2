import java.util.HashSet;

public class DisjunctiveConstraint extends Constraint {
    PrecedenceConstraints pa;
    PrecedenceConstraints pb;

    public DisjunctiveConstraint(PrecedenceConstraints pa, PrecedenceConstraints pb){
        this.pa=pa;
        this.pb=pb;
    }

    @Override
    public boolean isConsistent(Assignment as) {
        return ((this.pa.isConsistent(as) || this.pa.isConsistent(as)));
    }
}
