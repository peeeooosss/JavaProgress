import java.util.*;

public class JavaArea {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        area();
    }

    static void area() {
        Scanner scn = new Scanner(System.in);

        int breadth = scn.nextInt();
        int height = scn.nextInt();
        scn.close();

        if (breadth <= 0 || height <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.print(breadth * height);
        }

    }
}
