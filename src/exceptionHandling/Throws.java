package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

	@SuppressWarnings("resource")
	public void test() throws FileNotFoundException {
		//String s = "souni";
		//int a = Integer.valueOf(s);
		//System.out.println(a);
		@SuppressWarnings("unused")
		FileInputStream fis = new FileInputStream("C:/Users/souni_apu/workspace/coreJavaInterviewProgramm/src/exceptionHandling/exception.properties");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Throws obj = new Throws();
		obj.test();
	}
}
