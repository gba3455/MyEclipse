package pkgenum;

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
	public static void print(Grade g){//A B C D E
		System.out.println(g);
		System.out.println(g.getValue());
	}
}

//enum Grade{
//		A,B,C,D,E;
//}
//如何定义枚举的构造函数,方法和字段 去封装更多的信息
enum Grade{
	A("100-90"),B("89-80"),C("79-70"),D("69-60"),E("59-0");//相当于建乐5个对象
	private String value;
	private Grade(String value){
		this.value = value;
	}
	private Grade(){
		
	}
	public String getValue(){
		return this.value;
	}
}