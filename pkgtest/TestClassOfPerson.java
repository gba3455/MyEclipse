package pkgtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * 这里的Before和After会在每一个测试方法运行时都运行.
 * 而BeforeClass和AfterClass是在所有测试方法中只运行一次.
 */

public class TestClassOfPerson {
	Person p;
	@Before
	public void before(){
		//可以在这个方法里创建测试时需要的资源,确保测试时没问题.
		System.out.println("before");
		p = new Person();
	}
	@Test
	public void testRun(){
		p.run();
	}
	
	@Test
	public void testEat(){
		Person p = new Person();
		p.eat();
	}
	@After
	public void after(){
		//可以在这里对测试后的资源进行销毁.
		System.out.println("after");
		p = null;
	}
}
