public class MaxVal {
    static int max(int[] arr){
       int maxx =arr[0];
        for(int i = 0; i<arr.length; i++ ){
            if(arr[i]> maxx){
                maxx = arr[i];
            }
        }
        return maxx;
    }
    static int max(int[] arr,int start, int end) {
        int maxx = arr[start];
        for (int i = start; i <=end; i++) {
            if (arr[i] > maxx) {
                maxx = arr[i];
            }
        }
        return maxx;
    }

    public static void main(String[] args) {
        int [] arr = {77, 85, 100, 400, 5, 62, 25, 78, 54};
        System.out.println(max(arr));

        System.out.println(max(arr,5,8));
    }


}
