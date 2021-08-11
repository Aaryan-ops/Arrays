import java.util.Arrays;

public abstract class leftRotate {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(a));
        leftRotate(a, 2, a.length);
        System.out.println(Arrays.toString(a));
        int[] b = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(b));
        leftRotate(b, 1, b.length);
        System.out.println(Arrays.toString(b));
    }

    public static void leftRotate(int[] a, int d, int n) {
        d %= n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        System.out.println(g_c_d);
        for (i = 0; i < g_c_d; i++) {
            temp = a[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n) {
                    k -= n;
                }
                if (k == i) {
                    break;
                }
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        ;
        return gcd(b, a % b);
    }
}
