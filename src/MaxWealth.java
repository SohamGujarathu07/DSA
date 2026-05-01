public class MaxWealth {
    static int wealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][] money = {
                {2,5,10},
                {1,2},
                {77,10}
        };
        System.out.println(wealth(money));
    }
}
