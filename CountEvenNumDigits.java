public class CountEvenNumDigits {
//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    public static void main(String[] args) {
        int[] nums={2, 312, 561, 1, 9, 722, 666};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(isEvenDigit(nums[i])){
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigit(int num) {
        int count=0;
        int temp=num;
        int digit;
        while(temp!=0){
            digit=temp%10;
            temp/=10;
            count++;
        }
        if(count%2==0) return true;
        return false;
    }
}
