public class MethodOverloading {
    public static void main(String[] args){
       int newScore = calculateScore("Dylan", 500);
       System.out.println("New score is " + newScore);
       calculateScore(75);
       calculateScore();
       double centimeters = calcFeetAndInchesToCentimeters(6, 13);
       if(centimeters < 0.0 ){
           System.out.println("Invalid parameters");
       }
       calcFeetAndInchesToCentimeters(6, 0);
       calcFeetAndInchesToCentimeters(7, 5);
       calcFeetAndInchesToCentimeters(-10, 1);
       calcFeetAndInchesToCentimeters(0, 1);
       calcFeetAndInchesToCentimeters(6, -10);
       calcFeetAndInchesToCentimeters(6, 13);
       
       calcFeetAndInchesToCentimeters(100);
       calcFeetAndInchesToCentimeters(156);
       calcFeetAndInchesToCentimeters(157);
       calcFeetAndInchesToCentimeters(-10);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("Invalid inches parameter");
            return -1;
        }
        
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
