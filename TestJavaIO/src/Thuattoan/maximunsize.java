package Thuattoan;

public class maximunsize {

    static int maximizeSum(int[] arr) {
        saxsep(arr);
        int[] newArr =  new int[arr.length];
        newArr[0] = arr[0];
        newArr[arr.length-1] = arr[arr.length-1];
        int total = 0;
        int j = 0;
        for (int i =1; i < arr.length / 2; i++) {
            int check = arr[i];
            newArr[i+j] = arr[arr.length -1 -i];
            newArr[i+1+j] = check;
            j++;
        }
        if(arr.length % 2 == 1) newArr[arr.length -1] = arr[arr.length/2 + 1];
         for (int i =0;i< arr.length - 1;i++) {
             System.out.println(newArr[i] + "-" + newArr[i+1]);
             total +=Math.abs(newArr[i]-newArr[i+1]);
         }
        total +=Math.abs(newArr[0]-newArr[arr.length -1]);
         return total;
    }

    static void saxsep(int[] arr) {
        for (int i =0 ; i< arr.length; i++) {
            for (int j = i + 1; j< arr.length; j ++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int[] arr1 = {0,0,20,17,15,13,1,15,0,11};
        int ressult = maximizeSum(arr1);
        System.out.println(ressult);
    }

}
