import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        String rev = "";
        int len = A.length();
        for (int j = len - 1; j >= 0; j--) {
            rev += A.charAt(j);

        }
        System.out.println(rev);
        if (A.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
