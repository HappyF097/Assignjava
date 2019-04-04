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
public class Hourly_employee extends Employee {
    public void hours(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter worked hours:\n");
        hours = input.nextInt();
        System.out.println("hourly rate:\n");
        hrate = input.nextInt();
        net_salary = hours * hrate;
        System.out.println(net_salary);
        
    }
    
}
