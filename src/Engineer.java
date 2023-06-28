class Engineer extends Employee {

    double Benefits;
    public Engineer(String Name, double BaseSalary, double Gratuity, long JoiningDate, double benefits) {
        super(Name, BaseSalary, Gratuity, JoiningDate);
        this.Benefits = benefits;
    }

    public void displayTotalSalary() {
        System.out.println("Total Salary of employee "+ Name+ " is: " + (BaseSalary+Gratuity+Benefits) + " per month");
    }
    public void displayEmployeeRole(){
        System.out.println("I am an instance of type Engineer, I build stuff!");
    }
}
