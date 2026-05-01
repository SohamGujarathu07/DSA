import java.util.*;
public class MinVal {
    static void minimum(int[] arr){
        int min =arr[0];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                 index = i;
            }
        }
        System.out.println("The minimum number is:" + min +" at index:" + index);
    }

    static void minimum(int[] arr, int start, int end){
        int min =arr[0];
        int index = 0;
        for (int i=start;i<end;i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("The minimum number is:" + min +" at index:" + index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("size of array:");
        int n = sc.nextInt();
        int [] amount = new int [n];

        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            amount[i] = sc.nextInt();
        }
        minimum(amount);
        minimum(amount,2,4);
    }

}
