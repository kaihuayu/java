/* whileѭ����ʹ��
while ѭ���� forѭ�����Ի�����
while��true���� for(;;)��ʾ����ѭ����
while ��Ҫ������ȷѭ������������ȷѭ�������ĳ����У�
forѭ����Ҫ������ȷѭ��������Χ�ĳ����У�
*/

import java.util.Scanner;
public class WhileTest{

   public static void main (String[] arge){
       //for ��ӡ1��10
       for (int i=1; i<=10; i++){
          System.out.println("i="+i); 
       }
       //while ��ӡ1��10
          int i=0;
       while(i<=10){         
          i++;
          System.out.println("i="+i);
          
       }

     // while�ۼӼ��� 1/1 +1/2 +1/3 ... 1/n
       System.out.println("-------------------------------");
       System.out.println("����һ��������");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       double sum =0.0;
       int ii=1;
       while(ii<=number){
          //sum +=1.0/ii;
          sum = sum + 1.0/ii;
          ii++;
       }  
       System.out.println("���ս���ǣ�"+sum);
      System.out.println("-------------------------------");   
      //�����������������
       System.out.println("����һ��������Ŷ");
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