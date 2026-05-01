public class Evendigits {
    static int find (int[] nums){
        int count = 0;
        for(int num :nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numsOfDigit = digit(num);
        return numsOfDigit % 2 == 0 ;
    }

    static int digit(int num) {
        if(num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    public static void main(String[] args) {
        int[] amount = {12,345,2,6,7896,0};
        System.out.println(find(amount));
    }
}
