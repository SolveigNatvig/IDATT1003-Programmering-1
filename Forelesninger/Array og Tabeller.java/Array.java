import java.util.Arrays;
class Array {

    public static void testReference (int[] arr){
        int[] newArray = Arrays.copyOf(arr, arr.length);
        arr[5] = -1;
    }
    public static void main(String[] args) {
        int[] week1 = {3, 4, 5, 7, 8, 9, 0};
        int[] week2 = {3, 4, 5, 7, 8, 9, 0};

        week1[6] = 10;

        for (int i=0; i < week1.length; i++){
            System.out.println(week1[i]);
        }
    }
    
}

