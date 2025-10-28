package Oving9;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentOverview {
    private Student students;
    private int numberOfStudents;
    private ArrayList<Student> studentArray;

    AssignmentOverview(Student students){
        this.students = students;
        this.numberOfStudents = 1;
        this.studentArray = new ArrayList<>();
        this.studentArray.add(students);
    }
    private int findNumberOfStudents(){
        return this.numberOfStudents;
    }

    private int findNumberOfSolvedAssignments(int index){
        return this.studentArray.get(index).getNumberOfAssignments();
    }

    private Student registerNewStudent(String name, int assignments){
        Student stud = new Student(name, assignments);
        this.numberOfStudents += 1;
        this.studentArray.add(stud);
        return stud;
    }

    private void addAssignmentToStudent(int index, int newAssignments){
        this.studentArray.get(index).increaseNumberOfAssignments(newAssignments);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append("Number of Students: ").append(this.findNumberOfStudents()).append("\n");
        for (Student stud : this.studentArray) {
            sb.append(i + " " + stud.toString()).append("\n");
            i ++;
        }
        return sb.toString();
    }

    private void mainRunning(){
        boolean run = true;

        Scanner scan = new Scanner(System.in);

        while (run){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1: Registrer a new student");
            System.out.println("2: Increase number of assignments for students");
            System.out.println("3: See number of students");
            System.out.println("4: See all student overview");
            System.out.println("5: See the number of assignments for one student");
            System.out.println("6: Stop\n");
            int answer = Integer.parseInt(scan.nextLine());

            if (answer == 1){
                System.out.println("Name: ");
                String name = scan.nextLine();

                System.out.println("Number of Assignments: ");
                int assignments = Integer.parseInt(scan.nextLine());

                this.registerNewStudent(name, assignments);
                System.out.println("Registration Done\n");
            }
            else if (answer == 2){
                System.out.println("Which student do you want to see the assignment for? (1, 2, 3 ...)");
                System.out.println(this.toString());
                int studentNumber = Integer.parseInt(scan.nextLine());

                System.out.println("Increasing number: ");
                int newAssignments = Integer.parseInt(scan.nextLine());

                this.addAssignmentToStudent(studentNumber, newAssignments);
            }
            else if (answer == 3){
                System.out.println(String.format("\nNumber of Students: %d\n", this.findNumberOfStudents()));
            }
            else if (answer == 4){
                System.out.println("\n" + this.toString() + "\n");
            }
            else if (answer == 5){
                System.out.println("Which student do you want to see the assignment for? (1, 2, 3 ...)");
                System.out.println(this.toString());
                int studentNumber = Integer.parseInt(scan.nextLine());
                System.out.println("\n" + this.studentArray.get(studentNumber).getName() + " has done " + this.findNumberOfSolvedAssignments(studentNumber) + " assignments \n");

            }
            else if (answer == 6){
                System.out.println("Avslutter programmet...");
                run = false;
                break;
            }
        }
        scan.close();

    }

    public static void main(String[] args) {
        Student sun = new Student("Sunniva Hoidal", 10);
        AssignmentOverview testobjekt = new AssignmentOverview(sun);
        testobjekt.registerNewStudent("Cathrine", 10);
        testobjekt.registerNewStudent("Mathea Gjerde", 10);
        testobjekt.registerNewStudent("Solveig Natvig", 1);
        testobjekt.registerNewStudent("Elisabeth Berg", 10);

        testobjekt.mainRunning();
        //System.out.println(testobjekt.findNumberOfSolvedAssignments(3));

        
    }
}
