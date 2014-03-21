import junit.framework.*;

public class HelloTest extends TestCase {

    private String expectedGreeting;
    private String expectedName;
    private Hello testObject;

    protected void setUp(){
	expectedGreeting = "Hello";
	expectedName = "World";
	testObject = new Hello();
    }

    public void testGreet(){
	String expectedOutput = expectedGreeting + " " + expectedName;
	String actualOutput = testObject.greet();
	assertTrue(expectedOutput.equals(actualOutput));
    }
    public void testGreetJay(){
	expectedName = "Jay";
	testObject = new Hello(expectedName);
	String expectedOutput = expectedGreeting + " " + expectedName;
	String actualOutput = testObject.greet();
	assertTrue(expectedOutput.equals(actualOutput));
    }
}