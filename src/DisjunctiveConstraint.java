
// Constraint 1 or constraint 2 is true
public class DisjunctiveConstraint extends Constraint {
    PrecedenceConstraints pa;
    PrecedenceConstraints pb;

    public DisjunctiveConstraint(PrecedenceConstraints pa, PrecedenceConstraints pb){
        this.pa=pa;
        this.pb=pb;
    }

    @Override
    public boolean isConsistent(Assignment as) {
        return ((this.pa.isConsistent(as) || this.pb.isConsistent(as)));
    }

    @Override
    public String toString() {
        return pa.toString() + " || "+pb.toString();
    }
}
