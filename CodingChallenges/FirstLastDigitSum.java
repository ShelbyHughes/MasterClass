package CodingChallenges;

public class FirstLastDigitSum {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }else{
            int first = number % 10;
            int last = 0;
            while(number != 0){
                last = number % 10;
                number /= 10;
            }
            return first + last; 
        }
        
    }
}
