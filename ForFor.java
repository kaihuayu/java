/* for ˫��ѭ�� 
 ���ѭ�����ڿ��ƴ�ӡ������
 �ڲ�ѭ�����ڿ��Ƶ�ǰ�еĴ�ӡ������
 ����ѭ��������һ�£����ڲ���һȦ��
 ����Ҫ��ӡ���ж��е�ʱ����Ҫ�õ�

*/
public class ForFor{
   public static void main(String [] arge){
       //1.��ӡ5���ַ�������
       for (int i=1; i<= 5; i++){
           System.out.println("�������ҵĸ�");
       }

System.out.println("----------------------------------------");

      // ��ӡ5���ַ�������
        for (int j=1; j<=5; j++){
            System.out.print("�������ҵĸ� ");
        }
        //������
        System.out.println();

       //��ӡ��������
System.out.println("----------------------------------------");
       for (int i=1; i<= 5; i++){
           
            for (int j=1; j<=5; j++){
                System.out.print("�������ҵĸ� ");
            }
             System.out.println();
       }


   }

}