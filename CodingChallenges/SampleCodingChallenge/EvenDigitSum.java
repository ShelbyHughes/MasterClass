package CodingChallenges.SampleCodingChallenge;

public class EvenDigitSum {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }else{
            int sum = 0;
            int remainingNumber;
            while(number != 0){
                remainingNumber = number % 10;
                number /= 10;
                if(remainingNumber % 2 == 0){
                    sum += remainingNumber;
                }
            }
            return sum;
        }
    }
}
