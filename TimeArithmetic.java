import java.util.Scanner;
public class TimeArithmetic{
	public static void main(String[] args){
		System.out.println("请输入秒整数");
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int hour = number /3600;
		int minute = number % 3600 /60; //取余下的分钟数
		int second  = number % 60;
		System.out.println("拆分：" + hour + "小时" + minute + "分钟" + second + "秒");
			
	}
}