package PRACTICE;

public class EmployeeFullTIme extends SalaryPolicy {
    private float rate;

    public EmployeeFullTIme(float baseSalary) {
        super(baseSalary);
        this.rate = 4;
    }
    @Override
    public float getBaseSalary() {
        return rate*getBaseSalary();
    }
}
