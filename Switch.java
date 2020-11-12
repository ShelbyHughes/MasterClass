public class Switch {
    public static void main(String[] args){
        // int value = 3;
        // if(value == 1){
        //     System.out.println("Value was 1");
        // }else if(value == 2){
        //     System.out.println("Value was 2");
        // }else {
        //     System.out.println("Was not 1 or 2");
        // }

        int switchValue = 6;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break 
        // Add a default which displays a message saying not found

        char character = 'A';
        switch(character){
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C':
                System.out.println("This is C");
                break;
            case 'D':
                System.out.println("This is D");
                break;
            case 'E':
                System.out.println("This is E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        switch(character){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(character + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break; 
        }

        String month = "JANUARy";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
}
