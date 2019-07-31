/* 逻辑运算使用*/
import java.util.Scanner;
public class LogicTest{
    public static void main(String[] args){
	boolean b1 = true;
	boolean b2 = false;
	System.out.println("b1=" +b1); //true
	System.out.println("b2=" +b2); //false
	System.out.println("_________________________________");
	System.out.println(b1 && b2); //false 与 并且 同真为真
	System.out.println(b1 || b2); //true 或 或者  一真为真
	System.out.println(!b1); //false 非 取反
	System.out.println(!b2); //true
	System.out.println("_________________________________");
	
	System.out.println("输入一个正整数判断是否是3位数");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	System.out.println(number >=100 && number<=999);
	System.out.println("_________________________________");
	//逻辑与的短路特性 如果第一表达式已经可以判断结果，就不在往下运算了。
	int ia = 3;
	int ib = 2;
	boolean b3=(++ia ==3) && (++ib ==2);// false ++ia=4 条件为false
	System.out.println("b3=" +b3);	//false
	System.out.println("ia=" +ia); //false 4
	System.out.println("ib=" +ib);  // 2ia 条件不成立 短路所以 ++ib 不会执行

	//逻辑与的短路特性
	System.out.println("_________________________________");
	boolean b4=(++ia ==5) && (++ib ==2);// false ++ia=3 条件为false
	System.out.println("b4=" +b4);   //false
	System.out.println("ia=" +ia);  //5
	System.out.println("ib=" +ib);  // 3 ia 条件成立所以 ++ib=3 不会执行

	System.out.println("________逻辑或的短路特性_____________");

	boolean b5=(++ia ==6) || (++ib ==2);// ia=5 为 true 短路ib不做运算
	System.out.println("b5=" +b5);   //
	System.out.println("ia=" +ia);  //6
	System.out.println("ib=" +ib);  // 3 ia 条件成立所以 ++ib=3 不会执行

}

}