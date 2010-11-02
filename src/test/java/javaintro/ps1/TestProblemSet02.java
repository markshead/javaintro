package javaintro.ps1;

import java.util.Date;
import java.util.Random;

import javaintro.ps02.ProblemSet02Exercise01;
import junit.framework.TestCase;

public class TestProblemSet02 extends TestCase{
    
    public void testProblemSet02Exercise01() {
        int i = 10;
        Random r = new Random(new Date().getTime());
        while(i > 0) {
            int x = r.nextInt(1000) + 1;
            int y = r.nextInt(1000) + 1;
            int add = x + y;
            int div = x / y;
            int multi = x * y;
            int sub = x - y;
            int mod = x % y;
            String addMessage = 
                    x + " + " + y + " should equal " + add;
            String divMessage = 
                    x + " / " + y + " should equal " + div;
            String multiMessage = 
                    x + " * " + y + " should equal " + multi;
            String subMessage = 
                    x + " - " + y + " should equal " + sub;
            String modMessage = 
                x + " % " + y + " should equal " + mod;            
            assertEquals(addMessage, add, ProblemSet02Exercise01.addition(x, y));
            assertEquals(subMessage, sub, ProblemSet02Exercise01.subtraction(x, y));
            assertEquals(multiMessage, multi, ProblemSet02Exercise01.multiplication(x, y));
            assertEquals(divMessage, div, ProblemSet02Exercise01.division(x, y));  
            assertEquals(modMessage, mod, ProblemSet02Exercise01.modulus(x, y));
        }
        
    }

    public void testProblemSet02Exercise02() {
        
    }

    public void testProblemSet02Exercise03() {
        
    }

    public void testProblemSet02Exercise04() {
        
    }

    public void testProblemSet02Exercise05() {
        
    }

    public void testProblemSet02Exercise06() {
        
    }

    public void testProblemSet02Exercise07() {
        
    }

    public void testProblemSet02Exercise08() {
        
    }

    public void testProblemSet02Exercise09() {
        
    }

    public void testProblemSet02Exercise10() {
        
    }

}
