package codingTestTip;

public class permutationRecursion {
    static int[] a = {1, 2, 3};
    static int r = 3;
    static int n = 3;

    public static void main(String[] args) {

        makePermutation(n, r, 0);
    }

    static void makePermutation(int n, int r, int depth) {
        if (r == depth) {
            print();
            return;

        }
        for (int i = depth; i < n; i++) {
            swap(i, depth);
            makePermutation(n, r, depth + 1);
            swap(i, depth);
        }
    }

    static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print() {
        for (int i = 0; i < r; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
