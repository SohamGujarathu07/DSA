import java.util.*;
public class OrderAgnosticBs {
    static int OrderABS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={-8,-4,-2,0,2,4,6,8,10,14,65,76,78,97};
        System.out.print("Enter the element to be found: ");
        int target = sc.nextInt();
        int ans = OrderABS(arr,target);
        System.out.print("The element is at index: ");
        System.out.println(ans);

    }
}
