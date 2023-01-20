package Greedy;

public class Money {
    public static void main(String[] args) {
        // 4000원을 받았을 때 500원짜리 동전 8개를 반환합니다.
        int output1 = partTimeJob(4000);
        System.out.println(output1); // --> 8

        // 4972원을 받았을 때 500원짜리 동전 9개, 100원짜리 동전 4개, 50원짜리 동전 1개, 10원짜리 동전 2개, 1원짜리 동전 2개, 총 18개를 반환합니다.
        int output2 = partTimeJob(4972);
        System.out.println(output2); // --> 18
    }
    public static int partTimeJob(int k) {
//        int result = 0;
//
//        while (k>0){
//            if (k % 500 == 0){
//                result+=k/500;
//                k=0;
//            } else if (k % 100 == 0){
//                k-=100;
//                result++;
//            } else if (k % 50 == 0) {
//                k-=50;
//                result++;
//            } else if (k % 10 == 0) {
//                k-=10;
//                result++;
//            } else if (k % 5 == 0) {
//                k-=5;
//                result++;
//            }else {
//                k -= 1;
//                result ++;
//            }
//        }
//
//        return result;
        int[] coins = new int[]{1,5,10,50,100,500};
        int last = coins.length - 1;
        int count = 0;
        while (last >= 0) {
            if(k-coins[last]>=0){
                k-=coins[last];
                count++;
            }else{
                last--;
            }
        }
        return count;
    }
}
