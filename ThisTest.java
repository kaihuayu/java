/*


  ���ʵ��this�ؼ��ָ���Ĳ���

*/

public class ThisTest{


       ThisTest(){
            //�ڹ��췽���г���this����ǰ���ڹ���Ķ���
         System.out.println("���췽�� this ="+this);
       }

       void show(){
          // �ڹ��췽���г��ֵ�this����ǰ���ڵ��õĶ���
           System.out.println("��Ա���� this ="+this);
        } 


      public static void main(String[] args){

              ThisTest tt = new ThisTest();
              tt.show();
              System.out.println("main�����У�tt= "+ tt);


              ThisTest tt2 = new ThisTest();
              tt2.show();
              System.out.println("main�����У�tt2= "+ tt2);

       }
}