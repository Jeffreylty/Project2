import java.util.HashSet;

public class PrecedenceConstraints extends Constraint {
    Variable va;
    Variable vb;
    int val;

    public PrecedenceConstraints(Variable Va, int i, Variable Vb){
        this.va = Va;
        this.vb = Vb;
        this.val = i;
    }

    @Override
    public boolean isConsistent(Assignment as) {
        Contype a = as.getValue(this.va);
        Contype b = as.getValue(this.vb);
        if(a != null && b != null){
            return ((Integer.parseInt(a.getValue()) + this.val) <= Integer.parseInt(b.getValue()));
        }
        return true;
    }

    @Override
    public String toString() {
        return va.name + " + " + val + " <= "+vb.name;
    }
}