package rotationCountInSorted;

public class findRotations {
    public static void main(String[] args) {
        int[] a = { 15, 18, 2, 3, 6, 12 };
        int[] b = { 7, 9, 11, 12, 5 };
        int[] c = new int[] { 7, 9, 11, 12, 15 };
        System.out.println(countClockwiseRotations(a, 0, a.length - 1));
        System.out.println(countClockwiseRotations(b, 0, b.length - 1));
        System.out.println(countClockwiseRotations(c, 0, c.length - 1));

    }

    public static int countClockwiseRotations(int[] a, int indexOne, int indexTwo) {

        if (indexOne > indexTwo) {
            return 0;
        }
        if (indexOne == indexTwo) {
            return indexOne;
        }
        int middleIndex = (indexOne + indexTwo) / 2;
        if (middleIndex < indexTwo && a[middleIndex + 1] < a[middleIndex]) {
            return middleIndex + 1;
        }
        if (middleIndex > indexOne && a[middleIndex - 1] > a[middleIndex]) {
            return middleIndex;
        }
        if (a[indexTwo] > a[middleIndex]) {
            return countClockwiseRotations(a, indexOne, middleIndex - 1);
        }
        return countClockwiseRotations(a, middleIndex + 1, indexTwo);
    }
}
