/*三目运算*/
import java.util.Scanner;
public class ThreeEyeTest{
   public static void main(String[] args){
      System.out.println("输入两个整数判断大小");
        Scanner sc = new Scanner(System.in);
	int ia = sc.nextInt();
	int ib = sc.nextInt();
       System.out.println(ia>=ib ? "我是大的数"+ia:"我是大的数"+ib);
      // System.out.println("我是大的数"+(ia>=ib ? ia:ib));
 
}
}