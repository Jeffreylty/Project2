import java.util.HashSet;

public abstract class Constraint {

//ALl kinds of constraints are extends this class.
    public boolean isConsistent(Assignment as){
        System.out.println("You've called an abstract method");
        return false;
    }
}


