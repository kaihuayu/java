/*
  ���ʵ������������ʽ�Ĳ���

*/

public class OverLoadTest {


    void show(){

         System.out.println("show()");     
    }

    void show(int i){

         System.out.println("show()"+i);     
    }

    void show(int i,double d){

         System.out.println("show()"+i +d);     
    }
  
    void show(double d,int i){

         System.out.println("show()"+i +d);     
    }

   /* int show(){ //�뷵��ֵ�����޹�

             System.out.println("show()");   
      } */
     

  //�����������βα������޹�
    public static void main (String[]argsK){

              
         //�����������͵����� ָ����Ķ���
            OverLoadTest ot = new OverLoadTest();
            
            //���ó�Ա���� ���õ�ʱ��������־Ϳ�������
           ot.show();
           ot.show(66);
           ot.show(5,3.141596);
           ot.show(3.141596,5);

    }


}