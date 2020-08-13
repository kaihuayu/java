/* while循环的使用
while 循环和 for循环可以互换；
while（true）和 for(;;)表示无限循环；
while 主要用于明确循环条件但不明确循环次数的场合中；
for循环主要用于明确循环次数或范围的场合中；
*/

import java.util.Scanner;
public class WhileTest{

   public static void main (String[] arge){
       //for 打印1到10
       for (int i=1; i<=10; i++){
          System.out.println("i="+i); 
       }
       //while 打印1到10
          int i=0;
       while(i<=10){         
          i++;
          System.out.println("i="+i);
          
       }

     // while累加计算 1/1 +1/2 +1/3 ... 1/n
       System.out.println("-------------------------------");
       System.out.println("输入一个正整数");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       double sum =0.0;
       int ii=1;
       while(ii<=number){
          //sum +=1.0/ii;
          sum = sum + 1.0/ii;
          ii++;
       }  
       System.out.println("最终结果是："+sum);
      System.out.println("-------------------------------");   
      //任意正整数反向输出
       System.out.println("输入一个正整数哦");
       int num = sc.nextInt();
       int f=0;
       int s=0; 
       while(f<num){
           s=num-f;
           f++;
          System.out.println(s); 
       }   


   }

}