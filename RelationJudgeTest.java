/* �ù�ϵ����������жϲ���ӡ*/
import java.util.Scanner;
public class RelationJudgeTest{

    public static void main (String[] arge){
         System.out.println("������һ������");
	 Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         System.out.println(number >10);
         System.out.println("--------��Ŀ����--------");
	//����Ϊtrue ִ�б��ʽ1 ��������Ϊfalseִ�б��ʽ2

         System.out.println(number >10 ? "����10":"С��10");

    }

}