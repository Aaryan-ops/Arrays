import java.util.Arrays;

public class oneClockWiseCycle {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(a));
        rotateRight(a);
        System.out.println(Arrays.toString(a));
    }

    public static void rotateRight(int[] a) {
        int i = 0, j = a.length - 1;
        while (i != j) {
            a[i] += a[j];
            a[j] = a[i] - a[j];
            a[i] -= a[j];
            i++;
        }
    }
}
