package HelloWorldJava; 
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import example.util.Calculator;
import org.junit.jupiter.apiTest;

public class HelloWorldTest {

        @Test
	public void
        testAddition() {
        HelloWorld helloWorld = new HelloWorld();
                assertTrue(helloWorld.equals("Hello World!"));
        }
}
