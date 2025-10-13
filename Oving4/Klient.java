package Oving4;
import java.util.Scanner;
class Klient {
    private final String name;
    private final int age;


    public Klient(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){ // Dette er en metode som returnerer en type
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Klient p1 = new Klient("Juli", 4);
        //p1.name = "Juli";
        //p1.age = 4;
        String navnet = p1.getName();
        int alder = p1.getAge();
        System.out.println(navnet + alder);
        int i = 1;
        do{
            System.out.println("Skriv inn ett navn: ");
            String navnn = scan.nextLine();
            System.out.println(navnn);
            i ++;
        } while (i < 5);
        
        scan.close();
    
    }

}