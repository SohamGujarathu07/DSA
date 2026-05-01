public class SearchInMountain {
    static int search(int[] arr,int target){
        int peak = MtSearch(arr);
        int first = OrderABS(arr,target,0,peak);
        if(first != -1){
            return first;
        }
        return OrderABS(arr,target,peak+1,arr.length-1);
    }
    static int MtSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    static int OrderABS(int[] arr,int target,int start,int end){

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

    public static void main(String[] arg) {
        int[] arr ={1,2,3,4,5,3,1};
        int target = 1;
        System.out.println(search(arr,target));
    }
}
