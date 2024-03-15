import java.util.Scanner;

public class linsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr n");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter elem:");

        int elem = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == elem) {
                System.out.println("yes found");
                return;
            }

        }
        System.out.println("no");
    }

}
