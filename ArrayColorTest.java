/*��ɫ˫ɫ�� ���� 6��  1-33��6�����ظ�����
����1-16 ֮�����ɫ�����¼��������
*/
import java.util.Random;
public class ArrayColorTest{

	public static void main(String[] args){


         //����һ������Ϊ7��INT �͵�һά����
         int[] arr = new int[7];
         // ����6��1��33 ֮��ĺ�ɫ�����¼������
         Random ra = new  Random();
         for (int i=0; i<arr.length-1;i++){
           int number = ra.nextInt(33)+1;
           
           arr[i]=number;
          
	//ʹ�õ�ǰ���ɵ����������ߵ������ν��бȽ�
            for (int j= i-1;j>=0;j--){

		if (arr[i]==arr[j]){                     
                     i--; //Ϊ���´����ɵĺ�����Ը���֮ǰ�Ѿ��ظ��ĺ���
                 break;// ��Ⱦ��˳�����������ǰѭ��
                }	
	    }
               
                  
           
         } 

      // ����1-16 ֮�����ɫ�����¼��������
           int blueNumb=ra.nextInt(16)+1;
            arr[6]=blueNumb;
	 for (int i=0; i<arr.length;i++){

             System.out.println("������ɵĺ����ǣ�"+ arr[i]);

              }	


	}


}