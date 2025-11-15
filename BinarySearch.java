public class BinarySearch {
    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 20};
        int key = 12;

        int result = search(a, key);
        System.out.println(result == -1 ? "Not Found" : "Found at index " + result);
    }
}
