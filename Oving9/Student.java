package Oving9;

public class Student {
    private String name;
    private int numberOfAssignments;

    public Student(String name, int numberOfAssignments) {
        this.name = name;
        this.numberOfAssignments = numberOfAssignments;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfAssignments(){
        return this.numberOfAssignments;
    }

    public void increaseNumberOfAssignments(int increaser){
        this.numberOfAssignments += increaser;
    }

    public String toString(){
        return String.format("Name: %s, Assignments: %d", this.name, this.numberOfAssignments);
    }

    public static void main(String[] args) {
        Student sol = new Student("Solveig Natvig", 10);
        System.out.println(sol.toString());
    }
}
