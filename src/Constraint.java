import java.util.HashSet;

public abstract class Constraint {
    HashSet<Variable> NotEqual;

    public boolean isConsistent(Assignment as){
        System.out.println("You've called an abstract method");
        return false;
    }
}


