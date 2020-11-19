package CodingChallenges.SampleCodingChallenge;

public class LastDigitChecker {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000){
            return false;
        }else{
            int a = x % 10;
            int b = y % 10;
            int c = z % 10;
            return (a == b || a == c || b == c);
        }
    }
    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }else{
            return true;
        }
    }
}
