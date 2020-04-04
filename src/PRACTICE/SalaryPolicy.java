package PRACTICE;

public abstract class SalaryPolicy{
    private float baseSalary;

    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

}
