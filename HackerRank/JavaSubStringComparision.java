
import java.util.Scanner;

public class JavaSubStringComparision {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i < s.length() - k + 1; i++) {
            String input = s.substring(i, k + i); // to fill every blocks
            if (input.compareTo(largest) > 0) {
                largest = input;
            }
            if (input.compareTo(smallest) < 0) {
                smallest = input;
            }
        }

        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
