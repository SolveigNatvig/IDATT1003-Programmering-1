package IDATT1003_Programmering_1.Oving10;

class Event {
    private String organiser;
    private int number;
    private String name;
    private String type;
    private String location;
    private long time;

    public Event(String name, String type, String organiser, long time, String location){
        this.name = name;
        this.type = type;
        this.organiser = organiser;
        this.time = time;
        this.location = location;

        // number is the index of the list
    }

    public String getName(){
        return this.name;
    }

    public String getOrganiser(){
        return this.organiser;
    }

    public String getType(){
        return this.type;
    }

    public long getTime(){
        return this.time;
    }

    public int getNumber(){
        return this.number;
    }

    public String getLocation(){
        return this.location;
    }

    // Set methods
    public void setName(String newName){
        this.name = newName;
    }

    public void setOrganiser(String newOrganiser){
        this.organiser = newOrganiser;
    }

    public void setType(String newType){
        this.type = newType;
    }

    public void setTime(long newTime){
        this.time = newTime;
    }

    public void setNumber(int newNumber){
        this.number = newNumber;
    }

    public void setLocation(String newLocation){
        this.location = newLocation;
    }

}
