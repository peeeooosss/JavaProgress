public class findNextGreatest {
    public static void main(String[] args) {
        
        char[] letters = {'c', 'f', 'j','l','p'};
        char target = 'b';
        System.out.println(nextGreatestNumber(letters, target));
    }
    static char nextGreatestNumber(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }
}
