//"To Find Position of element in Infinite array !!"
public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr ={1,3,4,6,7,9,10,12,13,15,16,17,18,19,20};
        int target = 15;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target){
        int start =0;
        int end =1;
        while(target > arr[end]){
          int temp = end+1;
          end = end + (end - start + 1) * 2;
          start = temp;
        }
        return search(arr,target,start,end);
    }
        static int search(int[] arr,int target,int start,int end){

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
}
