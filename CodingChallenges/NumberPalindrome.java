package CodingChallenges;

public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int last;
        int start = number;
        while(number != 0){
            last = number % 10;
            number /= 10;
            reverse = (reverse * 10) + last;
        }
        return start == reverse;
    }
}
