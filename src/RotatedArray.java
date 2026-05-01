    public class RotatedArray {
        static int findPivot(int[] arr) {
            int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
        }
        static int binarysearch(int[] arr,int target,int start,int end){
            // int start = 0;
            // int end = arr.length-1;
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
        static int search(int[] arr, int target){
            int pivot = findPivot(arr);
               // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarysearch(arr, target, 0 , arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarysearch(arr, target, 0, pivot - 1);
        }

        return binarysearch(arr, target, pivot + 1, arr.length - 1);
    }
    
        public static void main(String args[]){
            int[] arr = {3,4,5,6,7,0,1,2};
            // int[] arr ={1};
            int target=0;
            System.out.println(search(arr, target));
            int rotate = findPivot(arr) + 1;
            // !!!!!!!!! HOW MANY TIMES ARRAY IS ROTATED !!!!!!!!!!
            System.out.println("num of times array rotated is: " + rotate);
        
    }
}
