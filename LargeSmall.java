public class LargeSmall {
    public static void main(String[] args) {
        int[] a = {5, 9, 2, 11, 4};

        int small = a[0], large = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < small) small = a[i];
            if (a[i] > large) large = a[i];
        }

        System.out.println("Smallest: " + small);
        System.out.println("Largest: " + large);
    }
}
