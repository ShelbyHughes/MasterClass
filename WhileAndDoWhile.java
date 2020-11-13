public class WhileAndDoWhile {
    public static void main(String[] args){
        // int count = 1;
        // while(count != 6){
        //     System.out.println("Count value is " + count);
        //     count++;
        // }
        // System.out.println("***************************");
        // for(count = 1; count != 6; count++){
        //     System.out.println("Count value is " + count);
        // }
        // System.out.println("***************************");
        // count = 1;
        // while(true){
        //     if(count == 6){
        //         break;
        //     }
        //     System.out.println("Count value is " + count);
        //     count++;
        // }
        // System.out.println("***************************");
        // count = 6;
        // do{
        //     System.out.println("Count value is " + count);
        //     count++;
        //     if(count > 100){
        //         break;
        //     }
        // }while(count != 6);
        // int number = 4;
        // int finishNumber = 20;
        // while(number <= finishNumber){
        //     number++;
        //     if(!isEvenNumber(number)){
        //         continue;
        //     }
        //     System.out.println("Even number " + number);
        // }
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
