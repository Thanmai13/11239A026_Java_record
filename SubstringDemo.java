public class SubstringDemo {
    public static void main(String[] args) {

        String s = "HELLO WORLD";

        // 1. substring(start, end)
        String part1 = s.substring(0, 5);   // HELLO

        // 2. substring(start)
        String part2 = s.substring(6);      // WORLD

        // 3. last 3 characters
        String part3 = s.substring(s.length() - 3); // RLD

        System.out.println("Substring(0,5): " + part1);
        System.out.println("Substring(6): " + part2);
        System.out.println("Last 3 chars: " + part3);
    }
}
