import java.util.*;
public class BinarySearch {
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,3,5,6};
        System.out.print("Enter the element to be found: ");
        int target = sc.nextInt();
        int ans = search(arr,target);
        System.out.println("The element is at index: " + ans);
        // System.out.println(ans);
    }
}