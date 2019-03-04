import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Australia();
        Job();
    }

    //The method to construct whole problem and
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
        PrintAssignment(result);
    }

    public static void Job(){
        System.out.println("Job Shop Scheduling Problem (AIMA 6.1.2)");
        CSP csp = new JobCSP();
        System.out.println(csp);
        System.out.println("Backtracking search solver");
        Solver solve =new Solver();
        long start = new Date().getTime();
        Assignment result = solve.BacktrackingSearchSolve(csp, new Assignment());
        long end = new Date().getTime();
        System.out.format("time: %.3f secs\n", (end-start)/1000.0);
        //result.put(new Variable("Inspect", Domain.JobDomain()),Contype.iniWith("28"));
        PrintAssignment(result);
    }

    public static void PrintAssignment(Assignment as){
        System.out.println("\nThe Assignment is:");
        Iterator i = as.asign.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry temp = (Map.Entry) i.next();
            System.out.println(((Variable)temp.getKey()).name+ "=" +((Contype)temp.getValue()).value);
        }
        System.out.println();
    }
}
