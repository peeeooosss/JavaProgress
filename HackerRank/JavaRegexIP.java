import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class JavaRegexIP{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String pattern = "^([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)\\.([01]?\\d{0,2}|25[0-5]|2[0-4]\\d)$";
}//Write your code here
