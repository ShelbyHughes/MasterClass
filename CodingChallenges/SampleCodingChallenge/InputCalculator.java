package CodingChallenges.SampleCodingChallenge;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, count = 0;
        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int num = scanner.nextInt();
                sum += num;
                count++;
            }else{
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/count));

        scanner.close();
    }
}
