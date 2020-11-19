package CodingChallenges.SampleCodingChallenge;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        int num;
        int divisor = 0;
        if(first < 10 || second < 10){
            return -1;
        }
        if(first>second){
            num = first;
        }else{
            num = second;
        }
        for(int i = 1; i < num; i++){
            if(first % i == 0 && second % i == 0){
                divisor = i;
            }
        }    
        return divisor;
    }
}
