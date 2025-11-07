package IDATT1003_Programmering_1.Oving10;

import java.util.ArrayList;
import java.util.Scanner;

public class EventRegister {
    private ArrayList<Event> eventList1;

    public EventRegister(){
        this.eventList1 = new ArrayList<>();
    }

    public void addEvent(Scanner scan){

        System.out.println("Name: ");
        String name = scan.nextLine();

        System.out.println("Organiser: ");
        String org = scan.nextLine();

        System.out.println("Type: ");
        String type = scan.nextLine();

        System.out.println("Time: ");
        long time = Long.parseLong(scan.nextLine());

        System.out.println("Location: ");
        String location = scan.nextLine();

        Event event = new Event(name, type, org, time, location);

        this.eventList1.add(event);
        
        this.eventList1.get(this.eventList1.size()-1).setNumber(this.eventList1.size()-1);
    }

    public void allEventsAtLocation(String location){
        for (Event event : this.eventList1){
            if (event.getLocation().equals(location)){
                System.out.println(String.format("\nNumber: %d\nName: %s\n", event.getNumber(), event.getName()));
            }
        }
    }

    public void allEventsOnDate(long time){
        for (Event event : this.eventList1){
            if (event.getTime() == time){
                System.out.println(String.format("\nNumber: %d\nName: %s\n", event.getNumber(), event.getName()));
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        EventRegister reg = new EventRegister();
        reg.addEvent(scan);
        reg.addEvent(scan);
        //reg.addEvent();

        reg.allEventsOnDate(11376536L);

        scan.close();
    }
}

