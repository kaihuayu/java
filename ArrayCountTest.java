//���ͳ���û���������һ����������ÿ�����ֳ��ֵĴ���ͳ�Ʋ���ӡ
import java.util.Scanner;
public class ArrayCountTest{


	public static void main(String[] args){


		//��ʾ��������һ��������
              System.out.println("����һ��������");
              Scanner sc = new Scanner(System.in);
              int number =sc.nextInt();
               //����������ÿ�����ֲ�ֳ�������¼
		int[] arr =new int[10];

              while(number>0){
                arr[number%10]++; //��10���࣬�����������k����˵����λ�ϳ���k
                number /=10;// ����10������������ȥ����ǰ��λ����n==0ʱ����
						
	      }
          //��ӡ����Ԫ��
		
            	 for (int i=0; i<arr.length;i++){
                  if(arr[i]>0){
                   System.out.print("����"+i +"������"+arr[i] +" ��");
		}
	    }	


	}





}