package Oving8;

public class Employee {
    private final Person personDetails;
    private final int employeeID;
    private final int yearOfHire;
    private double monthlySalary;
    public double taxPercentage = 0.22;

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
        return taxPercentage;
    }

    public String getFullName( ){ // Noe galt her. hvordan hente navn når det er private i en annen klasse?
        return this.personDetails.getFirstName() + " " + this.personDetails.getLastName();
    }

    // Set methods
    public void setMonthlySalary(double newMonthlySalary){
        this.monthlySalary = newMonthlySalary;
    }
    
    public void setTaxPercentage(double newTaxPercentage){
        this.taxPercentage = newTaxPercentage;
    } 

    // Other methods
    public double calculateMonthlyTax(){
        return this.monthlySalary*taxPercentage;
    }

    public double calculateMonthlyGrossSalary(){
        return this.monthlySalary;
    }

    public double caculateAnnualTax(){
        return this.calculateMonthlyTax() * 12;
    }

    public int calculateAge(int year){
        return year - personDetails.getYearOfBirth();
    }

    public int calculateYearsEmployed(int year){
        return year - yearOfHire;
    }

    public boolean hasBeenEmployedLongerThan(int year, Employee other){
        if (this.calculateYearsEmployed(year) > other.calculateYearsEmployed(year)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String Args[]){
        Person kimPerson = new Person("Kim", "Harris", 2001);
        Employee kim = new Employee(kimPerson, 0, 0, 0, 0);
        System.out.println(kim.getFullName());
    }




}
