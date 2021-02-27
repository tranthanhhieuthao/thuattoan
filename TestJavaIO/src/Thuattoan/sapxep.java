package Thuattoan;

public class sapxep {

    static int[] thuattoansx(int[] n) {
        for (int i =0 ; i< n.length; i++) {
            for (int j = i + 1; j< n.length; j ++) {
                if (n[i] > n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] n = {2,5,7,3,23,12,56,23,12,67,45,34,2,54,6,9,80};
        int[] test = thuattoansx(n);
        for (int i =0; i < n.length; i++) {
            System.out.print(test[i] + ", ");
        }
    }
}
