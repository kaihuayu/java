/* if- else if ��֧�ṹ*/
import java.util.Scanner;
public class Ifelseif{
    public static void main(String[] arge){
       System.out.println("���������Ϣ");
       Scanner sc = new Scanner(System.in);
       String str =sc.next();
    //����String �����������������ͣ����ʹ��equals�����ж��Ƿ���ȣ�
     if("����".equals(str)){
          System.out.println("�����߾���ͨ��");
      }
      else if ("ѧ��".equals(str)){
          System.out.println("����ѧ��ͨ��");
      }
      else{
          System.out.println("������ͨͨ��");  
      }    


   System.out.println("���ǹ�����");

    }
}