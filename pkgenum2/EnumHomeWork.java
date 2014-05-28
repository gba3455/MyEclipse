package pkgenum2;
/*
 * WeekDay枚举值:MON,TUE,WED,THU,FRI,SAT,SUN
 * 一个枚举方法返回中文格式星期
 */
import org.junit.Test;
public class EnumHomeWork {
	@Test
	public void Test(){
		System.out.println(WeekDay.SAT.getWeek());
	}
}
enum WeekDay {
	MON {
		@Override
		public String getWeek() {
			// TODO Auto-generated method stub
			return "星期1";
		}
	},
	TUE {
		@Override
		public String getWeek() {
			// TODO Auto-generated method stub
			return "星期2";
		}
	},WED {
		@Override
		public String getWeek() {
			// TODO Auto-generated method stub
			return "星期3";
		}
	},THU {
		@Override
		public String getWeek() {
			// TODO Auto-generated method stub
			return "星期4";
		}
	},FRI {
		@Override
		public String getWeek() {
			// TODO Auto-generated method stub
			return "星期5";
		}
	},SAT {
		@Override
		public String getWeek() {
			// TODO Auto-generated method stub
			return "星期6";
		}
	},SUN {
		@Override
		public String getWeek() {
			// TODO Auto-generated method stub
			return "星期7";
		}
	};
	private String week;
	private WeekDay(){
		
	}
	private WeekDay(String week){
		this.week = week;
	}
	public abstract String getWeek();
}