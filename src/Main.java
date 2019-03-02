import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Constraint> constraints = new HashSet<Constraint>();
        constraints.add(new NotEqualConstraint(null, null));
        for (Constraint v : constraints) {
            System.out.println(v.getClass());
        }
    }
}
