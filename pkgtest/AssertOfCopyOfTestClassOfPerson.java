package pkgtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * Assert断言
 */

public class AssertOfCopyOfTestClassOfPerson {
	@Test
	public void testRun(){
		Person p = new Person();
		p.run();
	}
	
	@Test
	public void testEat(){
		Person p = new Person();
		p.eat();
	}
	
	@Test
	public void testSpeak(){
		Person p = new Person();
//		Assert.assertEquals("speak", p.speak());//para1是speak返值的期望值.para2是返回的实际值.如果不相等,报错.
		Assert.assertEquals("speak1", p.speak());
		
		Assert.assertArrayEquals(new int[]{1,1}, new int[]{1,2});
		
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		
		Assert.assertFalse(true);
		Assert.assertFalse(false);
	}
}
