package pkgenum2;

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
		System.out.println(g.localValue());
	}
}

//带抽象方法的枚举

enum Grade{//class A100-90优   B89-80良  C79-70中  D69-60差  E59-0不及格
	A("100-90") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "优";
		}
	},B("89-80") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "良";
		}
	},C("79-70") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "中";
		}
	},D("69-60") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "差";
		}
	},E("59-0") {
		@Override
		public String localValue() {
			// TODO Auto-generated method stub
			return "不及格";
		}
	};//相当于建乐5个对象
	private String value;
	private Grade(String value){
		this.value = value;
	}
	private Grade(){
		
	}
	public String getValue(){
		return this.value;
	}
	
	public abstract String localValue();
}