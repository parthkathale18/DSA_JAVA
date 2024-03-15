/**
 * binsearch
 */
public class binsearch {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = a.length;

        int l = 0;
        int h = n - 1;
        int target = 5;
        while (h >= l) {

            int m = (h + l) / 2;
            if (a[m] > target) {
                h = m - 1;
            } else if (a[m] < target) {
                l = m + 1;
            } else {
                System.out.println("found at " + m);
                return;

            }
        }
        System.out.println("not found");
    }
}