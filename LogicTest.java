/* �߼�����ʹ��*/
import java.util.Scanner;
public class LogicTest{
    public static void main(String[] args){
	boolean b1 = true;
	boolean b2 = false;
	System.out.println("b1=" +b1); //true
	System.out.println("b2=" +b2); //false
	System.out.println("_________________________________");
	System.out.println(b1 && b2); //false �� ���� ͬ��Ϊ��
	System.out.println(b1 || b2); //true �� ����  һ��Ϊ��
	System.out.println(!b1); //false �� ȡ��
	System.out.println(!b2); //true
	System.out.println("_________________________________");
	
	System.out.println("����һ���������ж��Ƿ���3λ��");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	System.out.println(number >=100 && number<=999);
	System.out.println("_________________________________");
	//�߼���Ķ�·���� �����һ���ʽ�Ѿ������жϽ�����Ͳ������������ˡ�
	int ia = 3;
	int ib = 2;
	boolean b3=(++ia ==3) && (++ib ==2);// false ++ia=4 ����Ϊfalse
	System.out.println("b3=" +b3);	//false
	System.out.println("ia=" +ia); //false 4
	System.out.println("ib=" +ib);  // 2ia ���������� ��·���� ++ib ����ִ��

	//�߼���Ķ�·����
	System.out.println("_________________________________");
	boolean b4=(++ia ==5) && (++ib ==2);// false ++ia=3 ����Ϊfalse
	System.out.println("b4=" +b4);   //false
	System.out.println("ia=" +ia);  //5
	System.out.println("ib=" +ib);  // 3 ia ������������ ++ib=3 ����ִ��

	System.out.println("________�߼���Ķ�·����_____________");

	boolean b5=(++ia ==6) || (++ib ==2);// ia=5 Ϊ true ��·ib��������
	System.out.println("b5=" +b5);   //
	System.out.println("ia=" +ia);  //6
	System.out.println("ib=" +ib);  // 3 ia ������������ ++ib=3 ����ִ��

}

}