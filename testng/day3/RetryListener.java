package testng.day3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		if (testMethod.getName().equals("test1")) {
			annotation.setInvocationCount(2);
		}

		annotation.setRetryAnalyzer(RetryFailed.class);

	}

}
