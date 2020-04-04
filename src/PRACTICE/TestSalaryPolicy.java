package PRACTICE;

import java.util.Scanner;

public class TestSalaryPolicy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vui long nhap baseSalary Fulltime");
        float baseSalary_fulltime = scan.nextFloat();
        SalaryPolicy SL1 = new EmployeeFullTIme( baseSalary_fulltime);
        System.out.println(SL1);
        System.out.println("full-time employee salary" + SL1.getBaseSalary());

        System.out.println("Vui long nhap baseSalary Parttime");
        float baseSalary_parttime = scan.nextFloat();
        SalaryPolicy SL2 = new EmployeePartime( baseSalary_parttime);
        System.out.println(SL2);
        System.out.println("part-time employee salary" + SL2.getBaseSalary());
    }
}
