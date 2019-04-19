package UMLER;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
	Result result = JUnitCore.runClasses(TestUMLER.class);

	for (Failure failure : result.getFailures()) {
	    System.out.println(failure.toString());
	}
	double percent= result.getFailureCount()/(double)result.getRunCount();
	percent =1-percent;
	percent *=100;
	
	System.out.println((int)percent+"% Pass");

    }
}  	
