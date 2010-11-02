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
