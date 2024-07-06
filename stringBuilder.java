/**
 * stringBuilder
 */
public class stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            System.out.println(ch);

        }
        sb.setCharAt(0, 'b');
        System.out.println(sb);
        sb.setCharAt(4, 'i');
        System.out.println(sb);
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        sb.setCharAt(4, 'o');
        System.out.println(sb);

        sb.insert(0, 'a');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.append('a');
        System.out.println(sb);

        sb.append('o');
        System.out.println(sb);

        sb.deleteCharAt(6);
        System.out.println(sb);

    }
}
