public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int original = number;
        int reverse = 0;
        while (number != 0){
            int lastDigit = number % 10;
            number /= 10;
            reverse = reverse * 10 + lastDigit;
        }
        return(original == reverse);
    }
}