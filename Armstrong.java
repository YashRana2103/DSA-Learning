public class Armstrong {
    public static void main(String[] args) {
for(long i=100;i<1000;i++){
    if(isArmstrong(i)){
        System.out.print(i+" ");
    }
}
    }
    static boolean isArmstrong(long num){
        long original=num;
        long sum=0;
        while(num>0){
            long remainder=num%10;
            sum=sum+(remainder*remainder*remainder);
            num=num/10;
        }
        return sum==original;
    }
}
