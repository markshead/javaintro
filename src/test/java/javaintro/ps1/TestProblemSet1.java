package javaintro.ps1;

import junit.framework.TestCase;

public class TestProblemSet1 extends TestCase{
    
    public void testProblemSet01Exercise01() {
        int x = ProblemSet01Exercise01.getTheNumberOne();
        assertEquals(1, x);
    }
    
    public void testProblemSet01Exercise02a() {
        boolean x = ProblemSet01Exercise02.getBooleanFalse();
        assertEquals(false, x);
    }
    
    public void testProblemSet01Exercise02b() {
        boolean x = ProblemSet01Exercise02.getBooleanTrue();
        assertEquals(true, x);
    }
    
    public void testProblemSet01Exercise03a() {
        int x = ProblemSet01Exercise03.getFivePlusFive();
        assertEquals(10, x);
    }
    
    public void testProblemSet01Exercise03b() {
        int x = ProblemSet01Exercise03.getTenTimesTen();
        assertEquals(100, x);
    }
    
    public void testProblemSet01Exercise04() {
        String msg = ProblemSet01Exercise04.getHelloWorld();
        assertEquals("Hello World", msg);
    }
    
    public void testProblemSet01Exercise50() {
        int x = ProblemSet01Exercise05.getVariableX();
        assertEquals(5, x);
    }
    
    public void testProblemSet01Exercise06() {
        String firstName = ProblemSet01Exercise06.getFirstName();
        assertEquals("George", firstName);
    }
    
    public void testProblemSet01Exercise07() {
        int x = ProblemSet01Exercise07.getXTimesY();
        assertEquals(15 * 11, x);
    }
    
    public void testProblemSet01Exercise08() {
        int x = ProblemSet01Exercise08.getXTimesY();
        assertEquals(5*6, x);
    }
    
    public void testProblemSet01Exercise09() {
        int xcubed = ProblemSet01Exercise09.getXCubed();
        assertEquals(3*3*3,xcubed);
    }
    
    public void testProblemSet01Exercise10() {
        int x = 5;
        int y = ProblemSet01Exercise10.squareInput(x);
        assertEquals(x*x,y);
    }

}
