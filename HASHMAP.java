import java.util.HashMap;

/**
 * HASHMAP
 */

public class HASHMAP {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 1 };

        HashMap<Integer, Integer> element = new HashMap<>();

        for (int num : array) {
            if (element.containsKey(num)) {

                element.put(num, element.get(num) + 1);
            } else {

                element.put(num, 1);
            }
        }

        for (int num : element.keySet()) {
            System.out.println("Element " + num + " occurred " + element.get(num) + " times.");
        }
    }
}
