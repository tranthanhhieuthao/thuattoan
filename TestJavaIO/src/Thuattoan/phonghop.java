package Thuattoan;

public class phonghop {

    static int mettingRoom(int[] s, int[] e) {
        saxep(s,e);
        int[] arr = new int[s.length * 2];
        int check = 0;
        int count = 0;
        for (int i =0; i< s.length;i++) {
            if (check + 2 <= s.length * 2) {
            if (check + 1 < s.length * 2) {
                arr[check] = s[i];
                arr[check + 1] = e[i];
            }
                check = check + 2;
            }
        }
        int check1 = 0;
        for (int i =0 ; i < arr.length; i+=2) {
            if (i ==0 || (i+1 < arr.length && (arr[i] -arr[i+1]) <= 0 && arr[i] >= check1)) {
                check1 = arr[i+1];
                count++;
            }

        }
        return count;
    }
     static void saxep(int[] n, int[] m) {
         for (int i =0 ; i< m.length; i++) {
             for (int j = i + 1; j< m.length; j++) {
                 if (m[i] > m[j]) {
                     int temp = n[i];
                     n[i] = n[j];
                     n[j] = temp;
                     int temp1 = m[i];
                     m[i] = m[j];
                     m[j] = temp1;
                 }
             }
         }
     }

    public static void main(String[] args) {
        int[] s = {1,2,3,5};
        int[] e = {2,4,6,8};
        int[] s1 = {98,14,70,19,59,17,27,27,22,92,10,0,75,28,23,12,47,51,50,81};
        int[] e1 = {139,32,93,44,78,65,61,29,115,107,41,84,98,68,32,85,75,81,123,151};
        int[] s2 = {1,3,0,5,8,5};
        int[] e2 = {2,4,6,7,9,9};
        int test = mettingRoom(s1,e1);
        System.out.println(test);
    }
}
