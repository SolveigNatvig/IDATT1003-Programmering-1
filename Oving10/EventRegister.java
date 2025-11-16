package IDATT1003_Programmering_1.Oving10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EventRegister {
    private ArrayList<Event> eventList1;

    public EventRegister() {
        this.eventList1 = new ArrayList<>();
    }

    public void addEvent(Scanner scan) {
        System.out.println("Navn: ");
        String name = scan.nextLine();

        System.out.println("Arrangør: ");
        String org = scan.nextLine();

        System.out.println("Type: ");
        String type = scan.nextLine();

        System.out.println("Tidspunkt (f.eks. 200210301800): ");
        long time = Long.parseLong(scan.nextLine());

        System.out.println("Sted: ");
        String location = scan.nextLine();

        Event event = new Event(name, type, org, time, location);
        event.setNumber(eventList1.size() + 1); // starter på 1

        eventList1.add(event);
        System.out.println("Arrangement lagt til!");
    }

    public void allEventsAtLocation(String location) {
        for (Event event : this.eventList1) {
            if (event.getLocation().equalsIgnoreCase(location)) {
                System.out.println(event.toString());
            }
        }
    }

    public void allEventsOnDate(long time) {
        for (Event event : this.eventList1) {
            if (event.getTime() == time) {
                System.out.println(event.toString());
            }
        }
    }

    public void allEventsBetweenDates(long startTime, long endTime) {
        ArrayList<Event> between = new ArrayList<>();

        for (Event event : this.eventList1) {
            if (event.getTime() >= startTime && event.getTime() <= endTime) {
                between.add(event);
            }
        }

        // Sorter på tid
        Collections.sort(between, new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                return Long.compare(e1.getTime(), e2.getTime());
            }
        });

        for (Event e : between) {
            System.out.println(e.toString());
        }
    }

    public void listSortedByLocation() {
        ArrayList<Event> copy = new ArrayList<>(eventList1);
        Collections.sort(copy, new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                return e1.getLocation().compareToIgnoreCase(e2.getLocation());
            }
        });

        for (Event e : copy) {
            System.out.println(e.toString());
        }
    }

    public void listSortedByType() {
        ArrayList<Event> copy = new ArrayList<>(eventList1);
        Collections.sort(copy, new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                return e1.getType().compareToIgnoreCase(e2.getType());
            }
        });

        for (Event e : copy) {
            System.out.println(e.toString());
        }
    }

    public void listSortedByTime() {
        ArrayList<Event> copy = new ArrayList<>(eventList1);
        Collections.sort(copy, new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                return Long.compare(e1.getTime(), e2.getTime());
            }
        });

        for (Event e : copy) {
            System.out.println(e.toString());
        }
    }

    // Meny
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EventRegister reg = new EventRegister();
        boolean run = true;

        while (run) {
            System.out.println("\n--- ARRANGEMENTREGISTER ---");
            System.out.println("1. Registrer nytt arrangement");
            System.out.println("2. Finn arrangementer på sted");
            System.out.println("3. Finn arrangementer på dato");
            System.out.println("4. Finn arrangementer innenfor tidsintervall");
            System.out.println("5. Liste sortert etter sted");
            System.out.println("6. Liste sortert etter type");
            System.out.println("7. Liste sortert etter tidspunkt");
            System.out.println("8. Avslutt");
            System.out.print("Valg: ");

            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {

                case 1:
                    reg.addEvent(scan);
                    break;

                case 2:
                    System.out.print("Sted: ");
                    String location = scan.nextLine();
                    reg.allEventsAtLocation(location);
                    break;

                case 3:
                    System.out.print("Tidspunkt (f.eks. 200210301800): ");
                    long time = Long.parseLong(scan.nextLine());
                    reg.allEventsOnDate(time);
                    break;

                case 4:
                    System.out.print("Starttid: ");
                    long start = Long.parseLong(scan.nextLine());
                    System.out.print("Sluttid: ");
                    long end = Long.parseLong(scan.nextLine());
                    reg.allEventsBetweenDates(start, end);
                    break;

                case 5:
                    reg.listSortedByLocation();
                    break;

                case 6:
                    reg.listSortedByType();
                    break;

                case 7:
                    reg.listSortedByTime();
                    break;

                case 8:
                    run = false;
                    System.out.println("Avslutter programmet...");
                    break;
                    
                default:
                    System.out.println("Ugyldig valg, prøv igjen.");
            }
        }

        scan.close();
    }
}
