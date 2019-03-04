import java.util.HashSet;

/*
 to create an instance of Job Shop Scheduling CSP
 */
public class JobCSP extends CSP {

    public JobCSP(){
        this.variables = new HashSet<Variable>();
        Variable AxleF = new Variable("AxleF", Domain.JobDomain());
        this.variables.add(AxleF);
        Variable AxleB = new Variable("AxleB", Domain.JobDomain());
        this.variables.add(AxleB);
        Variable WheelRF = new Variable("WheelRF", Domain.JobDomain());
        this.variables.add(WheelRF);
        Variable WheelLF = new Variable("WheelLF", Domain.JobDomain());
        this.variables.add(WheelLF);
        Variable WheelRB = new Variable("WheelRB", Domain.JobDomain());
        this.variables.add(WheelRB);
        Variable WheelLB = new Variable("WheelLB", Domain.JobDomain());
        this.variables.add(WheelLB);
        Variable NutsRF = new Variable("NutsRF", Domain.JobDomain());
        this.variables.add(NutsRF);
        Variable NutsLF  = new Variable("NutsLF ", Domain.JobDomain());
        this.variables.add(NutsLF);
        Variable NutsRB = new Variable("NutsRB", Domain.JobDomain());
        this.variables.add(NutsRB);
        Variable NutsLB = new Variable("NutsLB", Domain.JobDomain());
        this.variables.add(NutsLB);
        Variable CapRF = new Variable("CapRF", Domain.JobDomain());
        this.variables.add(CapRF);
        Variable CapLF = new Variable("CapLF", Domain.JobDomain());
        this.variables.add(CapLF);
        Variable CapRB = new Variable("CapRB", Domain.JobDomain());
        this.variables.add(CapRB);
        Variable CapLB = new Variable("CapLB", Domain.JobDomain());
        this.variables.add(CapLB);
//        Variable Inspect = new Variable("Inspect", Domain.JobDomain());
//        this.variables.add(Inspect);

        this.constraints = new HashSet<Constraint>();
        this.constraints.add( new PrecedenceConstraints(AxleF,10,WheelRF));
        this.constraints.add( new PrecedenceConstraints(AxleF,10,WheelLF));
        this.constraints.add( new PrecedenceConstraints(AxleB,10,WheelRB));
        this.constraints.add( new PrecedenceConstraints(AxleB,10,WheelLB));

        this.constraints.add( new PrecedenceConstraints(WheelRF,1,NutsRF));
        this.constraints.add( new PrecedenceConstraints(WheelLF,1,NutsLF));
        this.constraints.add( new PrecedenceConstraints(WheelRB,1,NutsRB));
        this.constraints.add( new PrecedenceConstraints(WheelLB,1,NutsLB));

        this.constraints.add( new PrecedenceConstraints(NutsRF,2,CapRF));
        this.constraints.add( new PrecedenceConstraints(NutsLF,2,CapLF));
        this.constraints.add( new PrecedenceConstraints(NutsRB,2,CapRB));
        this.constraints.add( new PrecedenceConstraints(NutsLB,2,CapLB));

    }

}
