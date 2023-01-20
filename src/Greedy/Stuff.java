package Greedy;

import java.util.ArrayList;
import java.util.Arrays;


public class Stuff {
    public static void main(String[] args) {
        int output1 = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output1); // 3

        int output2 = movingStuff(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output2); // 4

        int output3 = movingStuff(new int[]{42, 25, 60, 73, 103, 167}, 187);
        System.out.println(output3); // 4
    }
    public static int movingStuff(int[] stuff, int limit) {
        Arrays.sort(stuff);
        ArrayList<Integer> box = new ArrayList<>();
        int count = 0;
        int last;
        int x = 0;
        for (int i = 0; i < stuff.length-x;) {
            last = stuff[stuff.length-1-x];
            box.add(last);

            int sum = sum(box);
            if (sum + stuff[i] <= limit){ //넣을수있는경우
                box.add(stuff[i]);
                i++;
            }

            count++;
            x++;
            box = new ArrayList<>();
        }
        return count;
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for(int num : list){
            sum+=num;
        }
        return sum;
    }
}