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
public class Employee {
    int days;
    int deductions;
    int compensation;
    int tax;
    int bonus;
    int rssb;
    int hours;
    int hrate;
    int gross_salary;
    int net_salary;
    String ID;
    String name;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Employee Emp = new Employee();
        System.out.println("Enter employee's name");
        Emp.name = input.next();
        System.out.println("Enter employee's ID");
        Emp.ID = input.next();
        String category;
        System.out.println("choose employee's category:\n day \n monthly \n weekly");
        category = input.next();
        switch (category){
            case "day":
                Hourly_employee hemp = new Hourly_employee();
                hemp.hours();
                break;
            case "weekly":
                Weekly_employee wemp = new Weekly_employee();
                wemp.week();
                break;
            case "monthly":
                Monthly_employee memp = new Monthly_employee();
                memp.month();
                break;
        }       
    }   
}

