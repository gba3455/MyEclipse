package pkgtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * 这里的Before和After会在每一个测试方法运行时都运行.
 * 而BeforeClass和AfterClass是在所有测试方法中只运行一次.
 * BeforeClass和AfterClass必须为静态方法.
 */

public class CopyOfTestClassOfPerson {
	@BeforeClass
	public static void beforeClass(){
		//可以在这个方法里创建测试时需要的资源,确保测试时没问题.
		System.out.println("beforeClass");
	}
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
	@AfterClass
	public static void afterClass(){
		//可以在这里对测试后的资源进行销毁.
		System.out.println("afterClass");
	}
}
