import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;   // cube of digit
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}
