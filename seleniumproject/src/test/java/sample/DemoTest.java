package sample;

import org.testng.annotations.Test;

public class DemoTest 
{
	@Test(groups = {" smoketest"})
	public void method()
	{
		System.out.println("method running ");
		System.out.println("its done");
	}
}
