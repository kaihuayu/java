/*for  ѭ����ӡ1 �� 10 */

class ForNumber{
    public static void main(String[] arge){
        for (int i=1; i<=10; i++){
         System.out.println(i);
        }
        //�ڣ�����{ }�����ı����п�����������ұߵ����ž������ˡ�
        //��ӡ10 �� 1
         System.out.println("----------��ӡ10 �� 1------------------");
         for (int i=10; i>=1;i--){
         System.out.println(i);
        }
        //��ӡ1-100����
        for(int i=1;i<=100;i++){
           if(i%2 !=0)
           {
             System.out.println("i="+i);
           }
           
        }
        System.out.println("�Ȳ����еķ�ʽ��ӡ����");
        for(int i=1;i<=100;i=i+2){
            System.out.println("i="+i);
        }
        System.out.println("ͨ�ʽ�ķ�ʽ��ӡ����");
        for(int  i=1; i<=50;i=i+1){
            System.out.println("i="+(2*i-1));

         }

    }

}