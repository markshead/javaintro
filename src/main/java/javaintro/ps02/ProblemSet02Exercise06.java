package javaintro.ps02;

/*
 * Primitives are data types like int and boolean. In this exercise we are going to look at long, float and double primitives.
 * You can read more about primitives here:
 * http://download.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class ProblemSet02Exercise06 {
    
    /*
     *  A long is similar to an int, and short, but it can contain larger numbers.  The range of values a
     *  long can represent is  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.  
     */
    public static long getSmallestLong() {
        int smallestLong = 0;
        return smallestLong;
    }
    
    public static long getLargestLong() {
        int largestLong = 0;
        return largestLong;
    }
    
  
    /*
     * A float represents a floating point number or a number with a decimal.  As such it can point to a much greater 
     * range of numbers than int, short or long, but at the expense of precision. A common beginner mistake is to use a float
     * for money calculations. This will sometimes work for awhile, but the lack of precision means that such programs
     * will run into problems with larger numbers and more complex calculations.
     * 
     * In the exercise below, return the floating point number of 0.2 by replacing 0.1 with the new value.
     * 
     * Notice the f after the 0.1. This tells java that this number is to be forced to a float.  By default, numbers with decimals
     * will be seen as a double (discussed next).
     */
    public static float getFloat() {
        float aFloat =  0.1f;
        return aFloat;
    }
    
    /*
     * A double is similar to a float, but where a float is represented in the computer's memory with only 32 bits, a
     * double is represented with 64 bits.  This makes a double much more precise. 
     * 
     * Change this method to return 5.9 instead of 0.5.
     * 
     * Notice that we didn't have to use a small letter after the number with a double because numbers with a decimal automatically default
     * to the type of double to make sure they are as precise as possible.  We could add a lower case d after the number to force it to
     * be a double, but this isn't required.
     * force it to be a double
     */
    public static double getDouble() {
        double aDouble = 0.5;
        return aDouble;
    }
}
