/* ʹ��if��֧�ṹ�����ֵ*/
import java.util.Scanner;
public class IfMaxTest{

public static void main(String[] arge){

    System.out.println("��������������");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b){
        System.out.println("�������"+a);
    }
    if (b >= a){
    System.out.println("�������"+b);
    }
  
   //���õ�д��
    int max =a;
    if (max<b){
        max = b;
    } 
    System.out.println("�����������"+max);
 }
}