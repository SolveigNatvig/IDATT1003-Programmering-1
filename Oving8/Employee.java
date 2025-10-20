package Oving8;

public class Employee {
    private final Person personDetails;
    private final int employeeID;
    private final int yearOfHire;
    private double monthlySalary;
    private double taxPercentage;

    public Employee(Person personDetails, int employeeID, int yearOfHire, double monthlySalary, double taxPercentage){
        this.personDetails = personDetails;
        this.employeeID = employeeID;
        this.yearOfHire = yearOfHire;
        this.monthlySalary = monthlySalary;
        this.taxPercentage = taxPercentage;
    }

    // Get methods
    public Person getPersonDetails(){
        return this.personDetails;
    }

    public int getEmployeeID(){
        return this.employeeID;
    }

    public int getYearOfHire(){
        return this.yearOfHire;
    }

    public double getMonthlySalary(){
        return this.monthlySalary;
    }
    
    public double getTaxPercentage(){
        return this.taxPercentage;
    }

    public String getFullName(){ // Noe galt her. hvordan hente navn når det er private i en annen klasse?
        return this.personDetails.firstName + " " + this.personDetails.lastName;
    }

    // Set methods
    public void setMonthlySalary(double newMonthlySalary){
        this.monthlySalary = newMonthlySalary;
    }
    
    public void setTaxPercentage(double newTaxPercentage){
        this.taxPercentage = newTaxPercentage;
    } 

    // Other mathods
    public double calculateMonthlytax(){
        return 1.1;
    }

    public double calculateMonthlyGrossSalary(){
        return 1.1;
    }

    public double caculateAnnualTax(){
        return 1.1;
    }

    public int calculateAge(){
        return 1;
    }

    public int calculateYearsEmployed(){
        return 1;
    }

    public boolean hasBeenEmployedLongerThan(int year){
        return true;
    }




}
