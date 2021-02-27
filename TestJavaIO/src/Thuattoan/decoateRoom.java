package Thuattoan;

public class decoateRoom {
    static long decorateRoom(int r, int g, int b) {
      int[] arr = {r,g,b};
        thuattoansx(arr);
        long min1 = arr[0];
        long min2 = arr[1];
        long max = arr[2];
        long count1 = -1;
        long count2 = -1;
        long maxCount = max /2;
        boolean check = max % 2 == 0;
        if (min1 + min2 <= maxCount) return min1+min2;
        count1 = min1 - maxCount / 2;
        count2 = min2 - maxCount / 2;
        if (count1 <= 0) min1 = 0;
        else min1 = min1 - count1;
        if (count2 <= 0) min2 = 0;
        else min2 = min2 -count2;
        if(check)  max = (count1 + count2) * 2;
        else  max = (count1 + count2) * 2 + 1;

        return count1 +count2;

    }

    static void thuattoansx(int[] n) {
        for (int i =0 ; i< n.length; i++) {
            for (int j = i + 1; j< n.length; j ++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        int r =7; 3 4 2
//        int g =2; 2
//        int b =13; 6 3 2
//        //7
//        int r1 =25;    1  12
//        int g1 =16; 6 10  2
//        int b1 =23; 6 17  8 1
//        // 21
//        long ressult = decorateRoom(r1,g1,b1);
//        System.out.println(ressult);
    }
}
