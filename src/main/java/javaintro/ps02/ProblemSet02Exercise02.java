package javaintro.ps02;

public class ProblemSet02Exercise02 {
    
    
    /*
     * This method takes a boolean value (true or false)
     * and needs to return 0 for false and 1 for true.
     * 
     * Notice that we compare using two equals signs. Other 
     * comparisions are:
     * !=  not equal
     * <=  less than
     * >=  greater than
     * 
     * Add another if statement to handle when the input
     * is false.
     * 
     * Programming Tip: Notice the use of the returnValue variable.
     * We could return the value directly from within the if statement.
     * Using the returnValue lets us have a single return statement. Methods
     * with a single return statement are significantly easier to debug
     * when something goes wrong thn methods with multiple return statements.
     * 
     * Also notice the use of 9 as the default value for returnValue. If for some
     * reason neither if statements are called, the value will still be 9. This is
     * much easier to spot than if the default value was 1 or 0 because it will only
     * be 9 if something goes wrong.
     */
    public static int booleanToBinary(boolean x) {
        int returnValue = 9;
        if(x == true) {
           returnValue = 1;
        }
        
        //add another if statement here
        //it should probably start with
        //if(x == false) { 
        
        
        
        return returnValue;
        
    }

    
}
