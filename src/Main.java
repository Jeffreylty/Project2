import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("CSP by Tianyi Liu & Canruo Zou");
        int i = 1;
        Scanner s = new Scanner(System.in);
        while (i!= 0) {
            System.out.println("Choose your test by entering the corresponding :\n 1. Australia CSP \n 2. Job Shop Scheduling CSP \n 3. N-Queen CSP \n 0. Quit ");
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
        s.close();
        System.out.println("The program ended!");
    }

    //The method to construct whole australia maping problem
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

    //The method to construct whole Job shop scheduling problem
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

    //The method to construct whole N queen problem
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
        if(result != null){
            printBoard(result,n);
        }

    }

    //method to print assignment
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


    //Method to print the final N queen board
    public static void printBoard(Assignment as, int n) {
        boolean[][] board =new boolean[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=false;
            }
        }
        Iterator it = as.asign.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            String a = pair.getValue().toString();
            String[] s1 = a.split(",");
            int row = Integer.parseInt(s1[0]);
            int col = Integer.parseInt(s1[1]);
            board[row][col]=true;
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(board[i][j]==true) {
                    System.out.print("|X");
                }else {
                    System.out.print("| ");
                }
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println();
    }

}
