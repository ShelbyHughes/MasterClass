package InheritanceChallenge;

public class Mustang extends Car{ 
    private int roadServiceMonths;
    
    public Mustang(int roadServiceMonths){
        super("Mustang", "RWD", 4, 2, 5, true);
        this.roadServiceMonths = roadServiceMonths;
    }
 }