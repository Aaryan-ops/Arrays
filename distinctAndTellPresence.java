package sortedAnyRotatedSum;

public class distinctAndTellPresence {
    public static void main(String[] args) {
        int[] a = new int[] { 11, 15, 6, 8, 9, 10 };// right rotated
        int[] b = new int[] { 11, 15, 26, 38, 9, 10 };// left rotated
        int[] c = new int[] { 11, 15, 26, 38, 9, 10 };
        System.out.println(doesHaveSuchAPair(a, a.length, 16));
        System.out.println(doesHaveSuchAPair(b, b.length, 35));
        System.out.println(doesHaveSuchAPair(c, c.length, 45));
    }

    public static boolean doesHaveSuchAPair(int[] a, int n, int sumKey) {
        int i;
        /* assumed ascending order */
        for (i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                break;
            }
        }
        int indexOne = (i + 1) % n;
        int indexTwo = i;
        while (indexOne != indexTwo) {
            if (a[indexOne] + a[indexTwo] == sumKey) {
                return true;
            }

            if (a[indexOne] + a[indexTwo] < sumKey) {
                indexOne = (indexOne + 1) % n;

            } else {
                indexTwo = (n + indexTwo - 1) % n;
            }
        }
        return false;
    }
}
