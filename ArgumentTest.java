/*

    �������ݹ��̲���
*/

public class ArgumentTest{


    void show(int i){
        i=200;
        System.out.println("i=" +i);
 
    }
  //�������β�
    void show (int[] arr){

       arr =new int[2]; //���ϸ��д�����ִ�н�� ��Ϊarr �ڶ����¿��˿ռ䡣ָ���ں�brrΪͬһ�ڴ��ַ
       arr[0] = 200;
       System.out.println("arr[0]="+arr[0]);//200       

    }

    public static void main (String[] args){
//a. �������������͵ı�����Ϊ�����Ĳ�������ʱ���βα����ĸı䲻��Ӱ�쵽ʵ�Σ�
         ArgumentTest at = new ArgumentTest();
         int num =10;
         at.show(num);
         System.out.println("num=" +num);  //��ӡ���Ϊ 10
      
       System.out.println("--------------------------------------");
//b.�������������͵ı�����Ϊ�����Ĳ�������ʱ���βα�����ָ������ݷ����ı���Ӱ�쵽ʵ�α���ָ������ݣ�


        int[] brr =new int[]{10,20}; 
        at.show(brr);
        System.out.println("brr[0]="+brr[0]); // ��ӡ���Ϊ200  ���ϸ��д�����ִ�н�� Ϊ10 
    } 

   


}