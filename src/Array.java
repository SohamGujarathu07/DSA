import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("size of array:");
        int n = sc.nextInt();
       
        int [] arr1 = new int [n];//import size of array

        //import elements in array
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("element to search:");
        int a = sc.nextInt();//Element to find

        for(int i=0;i<n;i++){
            if(a==arr1[i]){
                System.out.println("element found");
            }
            
            else{
                System.out.print("Element not found");
                break;
            }
        }
         

    }
}