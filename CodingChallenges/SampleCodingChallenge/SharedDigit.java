package CodingChallenges.SampleCodingChallenge;

public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int p, int q){
        if(p < 10 || p > 99 || q < 10 || q > 99){
            return false;
        }
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return(p == q|| p == y || x == q || x == y);

    }
}
