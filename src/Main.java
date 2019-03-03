import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Australia();
    }

    public static void Australia(){
        System.out.println("Australia Map Coloring Problem (AIMA 6.1.1)");
        CSP csp = new AustraliaCSP();
        System.out.println(csp);
        System.out.println("Backtracking search solver");
        Solver solve =new Solver();
        long start = new Date().getTime();
        Assignment result = solve.BacktrackingSearchSolve(csp, new Assignment());
        long end = new Date().getTime();
        System.out.format("time: %.3f secs\n", (end-start)/1000.0);
        System.out.println("result=" + result.toString());
    }
}
