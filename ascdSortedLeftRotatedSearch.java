package ascendSortedLeftRotatedSearch;

public class ascdSortedLeftRotatedSearch {
    public static void main(String[] args) {
        int[] a = new int[] { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int[] b = new int[] { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int[] c = new int[] { 30, 40, 50, 10, 20 };
        System.out.println(searchIndex(a, a.length, 3));
        System.out.println(searchIndex(b, b.length, 30));
        System.out.println(searchIndex(c, c.length, 10));
    }

    public static int searchIndex(int[] a, int n, int searchItem) {

        int pivotIndex = findPivotIndex(a, 0, n - 1);
        if (pivotIndex == -1) {
            return binarySearchIndex(a, 0, n - 1, searchItem);
        }
        if (a[pivotIndex] == searchItem) {
            return pivotIndex;
        }
        if (a[0] <= searchItem) {
            return binarySearchIndex(a, 0, pivotIndex - 1, searchItem);
        }
        return binarySearchIndex(a, pivotIndex + 1, n - 1, searchItem);
    }

    public static int findPivotIndex(int[] a, int lowerIndex, int higherIndex) {

        if (lowerIndex > higherIndex) {
            return -1;
        }
        if (lowerIndex == higherIndex) {
            return lowerIndex;
        }
        int middleIndex = (lowerIndex + higherIndex) / 2;
        if (middleIndex < higherIndex && a[middleIndex] > a[middleIndex + 1]) {
            return middleIndex;
        }
        if (lowerIndex < middleIndex && a[middleIndex - 1] > a[middleIndex]) {
            return middleIndex - 1;
        }
        if (a[lowerIndex] >= a[middleIndex]) {
            return findPivotIndex(a, lowerIndex, middleIndex - 1);
        }
        return findPivotIndex(a, middleIndex + 1, higherIndex);
    }

    public static int binarySearchIndex(int[] a, int lowerIndex, int higherIndex, int searchKey) {

        if (lowerIndex > higherIndex) {
            return -1;
        }
        int middleIndex = (lowerIndex + higherIndex) / 2;
        if (a[middleIndex] == searchKey) {
            return middleIndex;
        }
        if (a[middleIndex] > searchKey) {
            return binarySearchIndex(a, lowerIndex, middleIndex - 1, searchKey);
        }
        return binarySearchIndex(a, middleIndex + 1, higherIndex, searchKey);
    }
}
