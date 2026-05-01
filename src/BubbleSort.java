import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[]arr = {9,2,3,4,6,7,8,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

    static void bubble(int [] arr){
        int count = 0;
        // Run steps till n-1 time;
        for(int i=0; i<arr.length-1;i++){
            boolean swapp = false;
            // for each step max element will come at end;
            for(int j=0;j<arr.length-i-1;j++){
                // Swap if element is smaller than previous element;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapp = true;
                } 
            }
            System.out.println(++count);
            // if not swapp for any value of i end the program;
            if (swapp != true){
                break;
            }
        }

    }
}