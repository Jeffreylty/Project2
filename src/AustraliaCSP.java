import java.util.ArrayList;
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
		this.variables = new ArrayList<Variable>();
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
		this.constraints = new ArrayList<Constraint>();
		this.constraints.add( new NotEqualConstraint(SA, WA));
		this.constraints.add( new NotEqualConstraint(SA, NT));
		this.constraints.add( new NotEqualConstraint(SA, Q));
		this.constraints.add( new NotEqualConstraint(SA, NSW));
		this.constraints.add( new NotEqualConstraint(SA, V));
		this.constraints.add( new NotEqualConstraint(WA, NT));
		this.constraints.add( new NotEqualConstraint(NT, Q));
		this.constraints.add( new NotEqualConstraint(Q, NSW));
		this.constraints.add( new NotEqualConstraint(NSW, V));
	}
}
