public class palindromeLC {

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int var = 0;
        int temp = x;
        while(temp>0){
            var = var*10 + temp%10;
            temp = temp/10;
        }
        if(var == x){
            return true;
        }
        return false;
    }
}
