import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class myClass1Test {

	@Test

	public void test() {
		myClass1 m1 = new myClass1();
		int r = m1.bestimmteFunction(17); //*2
		Assert.assertEquals(34,r,0);
	}

}