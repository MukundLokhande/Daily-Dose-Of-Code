package day09;


public class CheckIfStringIsPalindrome2 {

    public static Boolean checkPalindrome(String str) {
   
        str = str.toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println(checkPalindrome(str)); 
    }
}
