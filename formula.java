package maxValueOfSumWithRotationsOnly;

public class formula {
    public static void main(String[] args) {
        int[] a = new int[] { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(maximumValue(a, a.length));
        int[] b = new int[] { 8, 3, 1, 2 };
        System.out.println(maximumValue(b, b.length));
        int[] c = new int[] { 3, 2, 1 };
        System.out.println(maximumValue(c, c.length));
    }

    public static int maximumValue(int[] a, int n) {

        int arraySum = 0;
        int currentValue = 0;
        int maximumValue;
        for (int i = 0; i < n; i++) {
            arraySum += a[i];
            currentValue += i * a[i];
        }
        maximumValue = currentValue;
        for (int j = 1; j < a.length; j++) {
            currentValue += arraySum - n * a[n - j];
            maximumValue = Math.max(maximumValue, currentValue);
        }

        return maximumValue;

    }
}
