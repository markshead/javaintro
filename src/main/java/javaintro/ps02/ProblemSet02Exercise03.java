package javaintro.ps02;

/*
 * In this exercise we are going to look at some other
 * comparisions using if statements 
 */
public class ProblemSet02Exercise03 {

    /*
     * Return true if the input x is greater than 5 and false if it is equal to
     * or less.
     * 
     * The code below almost works, but it fails when x is equal to 5. Modify
     * the less than comparator to be less than or equal to (<=) in order to fix
     * the problem.
     */
    public static boolean isGreaterThanFive(int x) {
        boolean returnValue = true;

        if (x > 5) {
            returnValue = true;
        }

        if (x < 5) {
            returnValue = false;
        }

        return returnValue;
    }

    /*
     * Test to see if x is between 5 and 50. Return true if it is within that
     * range and false if it isn't.
     * 
     * There are comments and two "true" statements showing where to put the two
     * comparisons. The && is the AND logical operator.
     * 
     * It will evaluate to true if the arguments on both sides evaluate as true.
     * 
     * Notice the use of extra parenthesis in order to clarify exactly in what
     * order the expression is to be evaluated.
     * 
     * Also notice the pattern of setting returnValue to a default of "false".
     * This makes it so we don't have to write code to test to see if the number
     * is outside of the range. If it isn't within 5 to 50 we know it is outside
     * 5 to 50 and we can return false.
     */
    public static boolean isBetweenFiveAndFifty(int x) {
        boolean returnValue = false;
        if ((true/* first comparison */) && (true/* second comparison */)) {
            returnValue = true;
        }
        return returnValue;
    }
    
    
    /*
     * Complete the method below to return true
     * only if x is greater than 500 and false otherwise.
     */
    public static boolean isGreaterThan500(int x) {
        boolean returnValue = false;
        //Put your code here
        
        
        return returnValue;
    }
    

    /*
     * Complete the method below to return true
     * only if x is greater than or equal to 500 and false otherwise.
     */
    public static boolean isGreaterThanOrEqualTo500(int x) {
        boolean returnValue = false;
        //Put your code here
        
        
        return returnValue;
    }

    /* 
     * Return true only if x is less than five or greater than 50.
     */
    public static boolean isNotBetweenFiveAndFifty(int x) {
        boolean returnValue = false;
        
        // Put your code here
        
        return returnValue;
        
    }
}
