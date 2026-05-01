public class StartEnd {
    static int search(int[] nums,int target, boolean isStart){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid =start+(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else {
                ans = mid;
                if(isStart){
                    end = mid-1;
                }
                else{
                    start =mid+1;
                }
            }
        }
        return ans;
    }
    static int[] Search(int[]nums,int target){
        int[]ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0] != -1){
            ans[1]=search(nums,target,false);
        }
        return ans;
    }

    public static void main(String[]args){
        int[] number ={5,7,7,7,7,8,8,10};
        int aim = 7;
        int[] output = Search(number,aim);  //"THE OUTPUT IS {1,4}"
//        System.out.println(output);

    }
}