import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("CSP by Tianyi Liu & Canruo Zou");
        int i = 1;
        while (i!= 0) {
            System.out.println("Choose your test by entering the corresponding :\n 1. Australia CSP \n 2. Job Shop Scheduling CSP \n 3. N-Queen CSP \n 0. Quit ");
            Scanner s = new Scanner(System.in);
            i = s.nextInt();
            if (i == 1) {
                Australia();
            } else if (i == 2) {
                Job();
            } else if (i == 3) {
                System.out.println("Enter how many queen you want to test:");
                i = s.nextInt();
                NQueen(i);
            }
        }
        System.out.println("The program ended!");
    }

    //The method to construct whole problem and
    public static void Australia(){
        System.out.println("\nAustralia Map Coloring Problem (AIMA 6.1.1)");
        CSP csp = new AustraliaCSP();
        System.out.println(csp);
        System.out.println("Backtracking search solver");
        Solver solve =new Solver();
        long start = new Date().getTime();
        Assignment result = solve.BacktrackingSearchSolve(csp, new Assignment());
        long end = new Date().getTime();
        System.out.format("time: %.3f secs\n", (end-start)/1000.0);
        PrintAssignment(csp, result);
    }

    public static void Job(){
        System.out.println("\nJob Shop Scheduling Problem (AIMA 6.1.2)");
        CSP csp = new JobCSP();
        System.out.println(csp);
        System.out.println("Backtracking search solver");
        Solver solve =new Solver();
        long start = new Date().getTime();
        Assignment result = solve.BacktrackingSearchSolve(csp, new Assignment());
        long end = new Date().getTime();
        System.out.format("time: %.3f secs\n", (end-start)/1000.0);
        PrintAssignment(csp, result);
    }

    public static void NQueen(int n){
        System.out.println("\n" +Integer.toString(n) +"-Queen Problem (Project Description)");
        CSP csp = new NQueenCSP(n);
        System.out.println(csp);
        System.out.println("Backtracking search solver");
        Solver solve =new Solver();
        long start = new Date().getTime();
        Assignment result = solve.BacktrackingSearchSolve(csp, new Assignment());
        long end = new Date().getTime();
        System.out.format("time: %.3f secs\n", (end-start)/1000.0);
        System.out.print("\nThe first element of assignment is the row of Queen, the second element is the column of Queen (range from 0 to n-1)");
        PrintAssignment(csp, result);
    }

    public static void PrintAssignment(CSP csp, Assignment as){
        System.out.println("\nThe Assignment is:");
        if(as == null){
            System.out.println("Cannot find a valid assignment!");
        }
        for( Variable v : csp.variables){
            try{
                System.out.println(v.name + " = "+ as.getValue(v).getValue());
            } catch (NullPointerException e){
                System.out.println(v.name + " = "+ null);
            }
        }
        System.out.println();
    }

}
