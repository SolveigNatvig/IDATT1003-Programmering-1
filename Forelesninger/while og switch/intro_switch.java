
class intro_switch{
    public static void main(String[] args) {
        int plassering = 2;
        switch (plassering){
            case 1:
                System.out.println("Utmerket!");
                break;
            
            case 2:
                System.out.println("Fantastisk!");
                break;

            case 3:
                System.out.println("Bra!");
                break;
            
            default:
                System.out.println("Det var ingen mach!"); 
        }
    }
}