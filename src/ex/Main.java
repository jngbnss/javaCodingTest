package ex;

public class Main {
    public static void main(String[] args) {
        int []arr = new int[3];
        int[] arr1 = {1, 2, 3,4};
        for (int i = 0; i < 3; i++) {
            arr[i] = i+1;
        }
        for (int i : arr) {
            System.out.println("arr[i] = " + i);
        }
        for (int i : arr1) {
            System.out.println("arr1[i]  = " + i);
        }

    }
}
