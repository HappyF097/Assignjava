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
public class Weekly_employee extends Employee {
    public void week(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter worked hours:\n");
        hours = input.nextInt();
        System.out.println("enter worked hours:\n");
        hrate = input.nextInt();
        if(hours>40){
            gross_salary = hours * hrate;
            bonus = gross_salary * 10/100;
            net_salary = gross_salary + bonus;
            System.out.println("bonus is:");
            System.out.println(bonus);
            System.out.println("gross salary is:");
            System.out.println(gross_salary);
            System.out.println("net salary is:");
            System.out.println(net_salary);   
        }
        else{
          net_salary = hours * hrate; 
          System.out.println("net salary is:");
          System.out.println(net_salary);
        }
        
    }
    
    
}
