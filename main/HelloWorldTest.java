import static org.junit.Assert.assertEquals;
import org.junit.*;

public class HelloWorldTest {

        @Test
	   public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
                assertEquals(0, (int) helloWorld.returnZero());
        }
}
