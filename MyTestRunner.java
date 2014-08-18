import org.junit.runner.*;
import org.junit.runner.notification.*;


public class MyTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestTreeNode.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
 
