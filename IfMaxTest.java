/* 使用if分支结构找最大值*/
import java.util.Scanner;
public class IfMaxTest{

public static void main(String[] arge){

    System.out.println("请输入两个整数");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b){
        System.out.println("最大数是"+a);
    }
    if (b >= a){
    System.out.println("最大数是"+b);
    }
  
   //更好的写法
    int max =a;
    if (max<b){
        max = b;
    } 
    System.out.println("这里最大数是"+max);
 }
}