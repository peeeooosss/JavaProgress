import java.util.*;

public class JavaIntToString {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        try {
            int n = scn.nextInt();
            String s;
            s = String.valueOf(n);
            System.out.println("Good job");

        } catch (InputMismatchException e) {
            System.out.println("Wrong answer");
        }

    }

}
