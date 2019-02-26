import java.util.Date;
import java.util.HashSet;

/**
 * Constraint satisfaction problem for coloring the map of Australia,
 * from AIMA Section 6.1 and Fig 6.1.
 */
public class AustraliaCSP extends CSP {
	
	/**
	 * Construct a new instance of the CSP for coloring the map of
	 * Australia.
	 */
	public AustraliaCSP() {
		this.variables = new HashSet<Variable>();
		Variable WA = new Variable("WA", Domain.rgbDomain());
		this.variables.add(WA);
		Variable NT = new Variable("NT", Domain.rgbDomain());
		this.variables.add(NT);
		Variable Q = new Variable("Q", Domain.rgbDomain());
		this.variables.add(Q);
		Variable NSW = new Variable("NSW", Domain.rgbDomain());
		this.variables.add(NSW);
		Variable V = new Variable("V", Domain.rgbDomain());
		this.variables.add(V);
		Variable SA = new Variable("SA", Domain.rgbDomain());
		this.variables.add(SA);
		Variable T = new Variable("T", Domain.rgbDomain());
		this.variables.add(T);
		this.constraints = new HashSet<Constraint>();
		this.constraints.add( Constraint.NotEqualConstraint(SA, WA));
		this.constraints.add( Constraint.NotEqualConstraint(SA, NT));
		this.constraints.add( Constraint.NotEqualConstraint(SA, Q));
		this.constraints.add( Constraint.NotEqualConstraint(SA, NSW));
		this.constraints.add( Constraint.NotEqualConstraint(SA, V));
		this.constraints.add( Constraint.NotEqualConstraint(WA, NT));
		this.constraints.add( Constraint.NotEqualConstraint(NT, Q));
		this.constraints.add( Constraint.NotEqualConstraint(Q, NSW));
		this.constraints.add( Constraint.NotEqualConstraint(NSW, V));
	}

	public static void main(String[] args) {
		System.out.println("Australia Map Coloring Problem (AIMA 6.1.1)");
		CSP csp = new CSP();
		System.out.println(csp);
		System.out.println("Backtracking search solver");
		Solver solve =new Solver();
		long start = new Date().getTime();
		Assignment result = solve.BacktrackingSearchSolve(csp);
		long end = new Date().getTime();
		System.out.format("time: %.3f secs\n", (end-start)/1000.0);
		System.out.println("result=" + result);
	}
}
