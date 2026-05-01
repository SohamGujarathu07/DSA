import java.util.*;
public class Search_in_2d {
    static int [] search(int [][] arr,int target){
       for (int i = 0; i < arr.length; i++){
          for (int j= 0; j<arr[i].length; j++){
              if(arr[i][j] == target){
                  return new int[]{i,j};
              }
          }
       }
       return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][] arr = {
                {7,8,9,54,5},
                {77,85},
                {2,35,4,95}
        };
        System.out.print("Enter the number:");
        int target = sc.nextInt();
        int [] ans = search(arr, target);
        System.out.println("The element is at position:" + Arrays.toString(ans));
    }
}
