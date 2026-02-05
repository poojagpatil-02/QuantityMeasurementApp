import java.util.*;

 class Feet {
 
    boolean checkEquality() {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter first value in feet: ");
        double a = sc.nextDouble();
 
        System.out.print("Enter second value in feet: ");
        double b = sc.nextDouble();
 
        return a == b;
    }
}

class Inches {
 
    boolean checkEquality() {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter first value in feet: ");
        double a = sc.nextDouble();
 
        System.out.print("Enter second value in feet: ");
        double b = sc.nextDouble();
 
        return a == b;
    }
}

public class FeetEqaulityUc2{
 
    public static void main(String[] args) {
        checkFeet(); 
        checkInches();   
    }
 
    // static method for feet
    static void checkFeet() {
        Feet feet = new Feet();
        boolean result = feet.checkEquality();
 
        if (result) {
            System.out.println("Feet values are equal");
        } else {
            System.out.println("Feet values are NOT equal");
        }
    }
    static void checkInches() {
        Inches inches = new Inches();
        boolean result = inches.checkEquality();
 
        if (result) {
            System.out.println("Inches values are equal");
        } else {
            System.out.println("Inches values are NOT equal");
        }
    }
}