public class MountainArray {
    static int search(int[] arr){
            int start = 0;
            int end = arr.length-1;
            while(start < end){
                int mid = start + (end - start)/2;
                if(arr[mid] < arr[mid+1]){
                    start = mid+1;
                }
                else{
                    end = mid;
                }
            }
            return arr[start];
    }

    public static void main(String[] args) {
        int[] arr ={5,6,4,3,2,1,0};
        System.out.println(search(arr));
    }
}
