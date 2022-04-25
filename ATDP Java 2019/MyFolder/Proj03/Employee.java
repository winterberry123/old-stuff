/**
 * @author Joyce Chen
 * @version 1.0
 */

public class Employee
{
    private String employeeNAME;
    private double employeeSalary;
    
    /** 
     * Initialize the employee's name to the given name and initialize 
     * the employee's salary to the given current salary.
     * @param employeeName the name of the employee
     * @param currentSalary the employee's current salary
     */ 
    public Employee (String employeeName, double currentSalary){
        employeeNAME = employeeName;
        employeeSalary = currentSalary;
    }
    
    /**
     * Gets the employee's name.
     * @return the given employee's name
     */
    public String getName () {
     return employeeNAME;   
    }
    
    /**
     * Gets the current salary of the employee.
     * @return the given current employee salary
     */
    public double getSalary() {
     return employeeSalary;   
    }
    
    /**
     * Calculates the employee's salary after getting a raise by the given percentage.
     * @param byPercent the percentage to raise the employee's salary by
     */
    public void raiseSalary(double byPercent) {
      employeeSalary = employeeSalary + employeeSalary * byPercent * 0.01;
    }
    
}