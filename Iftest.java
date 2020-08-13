/* if分支结构*/
import java.util.Scanner;
public class Iftest{
   public static void main(String [] arge){
	System.out.println("输入年龄");
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        if (age >=18){
        System.out.println("你成年了");
       
        }else{
          System.out.println("你未成年");
             }
     System.out.println("不好意思哦再见");

   }
}