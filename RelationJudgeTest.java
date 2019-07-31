/* 用关系运算符进行判断并打印*/
import java.util.Scanner;
public class RelationJudgeTest{

    public static void main (String[] arge){
         System.out.println("请输入一个整数");
	 Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         System.out.println(number >10);
         System.out.println("--------三目运算--------");
	//条件为true 执行表达式1 否则条件为false执行表达式2

         System.out.println(number >10 ? "大于10":"小于10");

    }

}