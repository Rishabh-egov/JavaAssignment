public class Employee {

    String Name;
    double BaseSalary;
    double Gratuity;
    long JoiningDate;

    public Employee(String Name,double BaseSalary, double Gratuity, long JoiningDate)
    {
        this.Name = Name;
        this.BaseSalary = BaseSalary;
        this.Gratuity = Gratuity;
        this.JoiningDate = JoiningDate;
    }
    public void displayTotalSalary()
    {
        System.out.println("Total Salary of employee "+ Name+ " is: " + (BaseSalary+Gratuity) + " per month");
    }
    public void displayEmployeeRole(){
        System.out.println("I am an instance of the type employee, I can do anything!");
    }
}
