package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
            // Return number 
    	if(times == 1) {
    		return number;
    	}
    	
        // Else return number + recursiveMultiplication(number, times-1)
    	
        return number + recursiveMultiplication(number, times-1);
    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDivideBy) {
    	
    	if(numberToDivideBy > number) {
    		return number;
    	}
    
    	if(numberToDivideBy <= 0) {
    		System.out.println("Division by zero or negative number, returns -1");
    		return -1;
    	}
    	
    	if(numberToDivideBy == 1) {
    		return number;
    	}
    	
        return number + recursiveDivision(number - numberToDivideBy, numberToDivideBy);
        
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
        
        return 0;
    }
}
