/* ������������++ ������ֵ��1��++ �ڱ���ǰ�󶼿���
��Ӧ������������ ++ ��ǰ ���� �� ���һ��
*/
import java.util.Scanner;
public class MySelf{
    public static void main (String[] aa){
        int a= 10;
        System.out.println("a="+ a);
	a++;
	System.out.println("a="+ a);
	++a;
	System.out.println("a="+a);
	System.out.println("--------------------------------");
        //ia++ �������������ʽ������ia����������������++������������
        //���ʽ�ͱ����и��Զ������ڴ�ռ�;
	//a++��ʾ����a����ֵ��Ϊ�������ʽ�Ľ����Ȼ������a �����1
        System.out.println(a++);   //12 //��++���ȿ���a��ֵ���ڴ棬Ȼ����+�����Ա��ʽ��ֵ����12
        System.out.println("a=" +a);//13 ʵ�� a �Ѿ���1
        System.out.println(++a);    //14
        System.out.println("a="+a);//14

    }



}