import java.util.Scanner;
public class TimeArithmetic{
	public static void main(String[] args){
		System.out.println("������������");
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int hour = number /3600;
		int minute = number % 3600 /60; //ȡ���µķ�����
		int second  = number % 60;
		System.out.println("��֣�" + hour + "Сʱ" + minute + "����" + second + "��");
			
	}
}