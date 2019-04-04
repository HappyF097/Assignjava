/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.util.Scanner;
/**
 *
 * @author Teacher
 */
public class Monthly_employee extends Employee {
    public void month(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter gross salary");
        gross_salary = input.nextInt();
        tax = gross_salary * 25/100;
        rssb = gross_salary * 5/100;
        deductions = tax + rssb;
        compensation = gross_salary * 5/100;
        net_salary = gross_salary - deductions + compensation;
        System.out.println("employee's salary before deductions and compensation is:\n");
        System.out.println(gross_salary);
        System.out.println("employee's salary after deductions and compensation is:\n");
        System.out.println(net_salary);
        
        
    }
    
}
