package CodingChallenges.SampleCodingChallenge;

public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(true, 0));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking == false){
            return false;
        }else if(barking == true && hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23){
            return true;
        }else if(barking == true && hourOfDay > 8 && hourOfDay < 22){
            return false;
        }else if(barking == true && hourOfDay < 0){
            return false;
        }else if(barking == true && hourOfDay > 23){
            return false;
        }else{
            return false;
        }
    }
}
