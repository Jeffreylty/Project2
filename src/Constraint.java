import java.util.HashSet;

public class Constraint {
    HashSet<Variable> NotEqual;

    public static Constraint NotEqualConstraint(Variable Va, Variable Vb){
        Constraint cons = new Constraint();
        cons.NotEqual =new HashSet<Variable>();
        cons.NotEqual.add(Va);
        cons.NotEqual.add(Vb);
        return cons;
    }
}
