package CodingChallenges.SampleCodingChallenge;

public class NumberToWords {
    public static void main(String[] args){
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    public static void numberToWords(int number) {
 
        if(number < 0) {
            System.out.println("Invalid Value");
        }
 
        int digitToPrint = 0;
        int digitCount = getDigitCount(number);
        int reverseNumber = reverse(number);
 
        while(digitCount > 0) {
 
            digitCount--;
            digitToPrint = reverseNumber % 10;
            reverseNumber /= 10;
 
            switch(digitToPrint) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
        }
    }
 
    public static int reverse(int number) {
 
        int reverseNumber = 0;
 
        while( number != 0) {
            reverseNumber = (reverseNumber * 10) + number % 10;
            number /= 10;
        }
 
        return reverseNumber;
    }
 
    public static int getDigitCount(int number) {
 
        if(number < 0) {
            return -1;
        }
 
        int digitCount = 0;
 
        do {
            number /= 10;
            digitCount++;
        } while(number > 0);
 
        return digitCount;
    }
}
