public class NotAttackingConstraint extends Constraint {
    Variable v1;
    Variable v2;

    public NotAttackingConstraint(Variable v1, Variable v2){
        this.v1=v1;
        this.v2=v2;
    }

    public boolean isConsistent(Assignment as) {
        Contype a1 = as.getValue(v1);
        Contype a2 = as.getValue(v2);
        if(a1 !=null && a2 !=null){
            String[] s1 = a1.value.split(",");
            String[] s2 = a2.value.split(",");
            int row1 = Integer.parseInt(s1[0]);
            int col1 = Integer.parseInt(s1[1]);
            int row2 = Integer.parseInt(s2[0]);
            int col2 = Integer.parseInt(s2[1]);

            if(Math.abs(col1-col2) == Math.abs(row1-row2) || row1 == row2){
                return false;
            }
        }
        return true;
    }
}
