/*break �ؼ��� continue �ؼ���*/

public class BreakContinue{

    public static void main(String[] arge){
       for (int i=1;i<=20;i++){

            if (0==i%5){
              continue; //��������ѭ��������һ��ѭ��
             }
            if(18 == i){
               break;
            }
       System.out.println("i="+i);

       }


    }

}