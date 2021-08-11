package sortedAnyRotatedSum;

public class count {
    public static void main(String[] args) {
        int[] a = new int[] { 11, 15, 6, 7, 9, 10 };
        System.out.println(countOfSumPairs(a, a.length, 16));
    }

    public static int countOfSumPairs(int[] a, int n, int sumKey) {

        int i;
        for (i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                break;
            }

        }
        int count = 0;
        int indexOne = (i + 1) % n;
        int indexTwo = i;
        while (indexOne != indexTwo) {
            if (a[indexOne] + a[indexTwo] == sumKey) {
                count++;
                if (indexOne == (n + indexTwo - 1) % n) {
                    return count;
                }
                indexOne = (indexOne + 1) % n;
                indexTwo = (n + indexTwo - 1) % n;
            } else if (a[indexOne] + a[indexTwo] < sumKey) {
                indexOne = (indexOne + 1) % n;
            } else {
                indexTwo = (n + indexTwo - 1) % n;
            }
        }
        return count;
    }
}
