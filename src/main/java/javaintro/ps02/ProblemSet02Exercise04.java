package javaintro.ps02;

/*
 * In this exercise we are going to look at returning
 * and comparing strings.
 */
public class ProblemSet02Exercise04 {

    /*
     * Return Hello World
     * 
     * You do not need to change anything on this method.
     */
    public static String helloWorldExample() {
        return "Hello World";
    }
    
    /*
     * Return Hello World from variable. Notice that String 
     * begins with a capital letter.  This is because it is a
     * class--not a primitive like int.
     * 
     * You do not need to change anything on this method.
     */
    public static String helloWorldVariableExample() {
        String message = "Hello World";
        return message;
    }
    
    
    /*
     * Make this method return "Super Man".  You will need to change
     * the String from "Hello World" to "Super Man".
     */
    public static String superMan() {
        String message = "Super Man";
        return message;
    }
    
    /*
     * Return the String "Super Man" directly without
     * assigning it to a variable. 
     * 
     * You will need to replace "Hello World" with "Super Man"
     * 
     */
    public static String superManNoVariable() {
        return "Hello World";
    }
    
    
    /*
     * The + symbol allows you to concatenate Strings.  In this exercise,
     * change the code so it returns Hello instead of World.
     */
    public static String hello() {
        return "Wor" + "ld";
    }
    

    /*
     * Sames as above but this time assigned to variables.
     */
    public static String helloVariables() {
        String firstPart = "Wor";
        String secondPart = "ld";
        return firstPart + secondPart;
    }
    
    /*
     * The + symbol allows you to concatenate Strings. Change this method so 
     * it returns "Super Man" instead of "Hello World".
     */
    public static String superManConcat() {
        String firstWord = "Hello";
        String secondWord = "World";
        //We have to add a space between the two words
        return firstWord + " " + secondWord;
    }
    
    
    
     
}
