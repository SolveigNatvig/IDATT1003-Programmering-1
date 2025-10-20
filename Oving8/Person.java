package Oving8;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int yearOfBirth;

    public Person(String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
}
