package pkgenum2;

/*
 * 枚举类特性:
 * 		枚举类也是一种特殊形式的java类.
 * 		枚举类中声明的每一个枚举值达标枚举类的一个实例对象.
 * 		与java众的普通类一样,在声明枚举类时,也可以声明属性,方法和构造函数.但枚举类的构造函数必须为私有的
 * 		枚举类也可以实现接口,或继承抽象类.
 * 		JDK5中扩展了switch语句,它畜类可以接受int,byte,char,short外,还可以接受一个枚举类型.
 * 		若枚举类中有一个枚举值,则可以当做单例设计模式使用.
 */
import org.junit.Test;

/*
 * java 1.5以前,想要指定传A到E的成绩进print
 * 新建一个成绩类,把默认构造函数私有化掉.
 * 在创建5个
 */
//public class Demo1 {
//	public static void main(String[] args) {
//		print(Grade.B);
//	}
//	public static void print(Grade g){//A B C D E
//		
//	}
//}
//class Grade{
//	private Grade(){
//		
//	}
//	public static final Grade A = new Grade();
//	public static final Grade B = new Grade();
//	public static final Grade C = new Grade();
//	public static final Grade D = new Grade();
//	public static final Grade E = new Grade();
//}

//1.5以后就只要定义一个enum就可以代替上面的Grade类
public class Demo1 {
	public static void main(String[] args) {
		print(Grade.B);
	}

	public static void print(Grade g) {// A B C D E
		System.out.println(g);
		System.out.println(g.getValue());
		System.out.println(g.localValue());
	}

	// 测试枚举常用方法
	@Test
	public void TestEnumMethod() {
		System.out.println(Grade.C.name());
		System.out.println(Grade.C.ordinal());// 得到枚举所在脚标.0开始

		System.out.println(Grade.valueOf(Grade.class, new String("B")));
		
		Grade[] grr = Grade.values();
		for(Grade g1 : grr){
			System.out.println(g1);
		}

		String str = "Y";// 比如这个是客户端表单提交过来的字符串
		// 传过来得Y再枚举中没有,所以JUnit会报异常,只要判断有没异常就可以知道传过来的值是否符合要求
		System.out.println(Grade.valueOf(str));
	}
}

// 带抽象方法的枚举

enum Grade {// class A100-90优 B89-80良 C79-70中 D69-60差 E59-0不及格
	A("100-90") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "优";
		}
	},
	B("89-80") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "良";
		}
	},
	C("79-70") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "中";
		}
	},
	D("69-60") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "差";
		}
	},
	E("59-0") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "不及格";
		}
	};// 相当于建乐5个对象
	private String value;

	private Grade(String value) {
		this.value = value;
	}

	private Grade() {

	}

	public String getValue() {
		return this.value;
	}

	public abstract String localValue();
}

// 相当于用单例设计模式定义出了一个类
enum A {// class
	A;// Object
}