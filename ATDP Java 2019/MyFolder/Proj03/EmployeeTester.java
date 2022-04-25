public class EmployeeTester
{
    public static void main(String args[]) {
        Employee grace = new Employee ("Grace", 2000);
        
        String name = grace.getName();
        double salary = grace.getSalary();
        
        System.out.println ("Employee name:" + name+ '\n'+ "Expected: Grace");
        System.out.println ("Employee salary:" + salary + '\n' + "Expected: 2000");
        
        grace.raiseSalary(10);
        System.out.println ("Employee salary after raise:" + grace.getSalary());
        System.out.println ("Expected: 2200");
        
    }}