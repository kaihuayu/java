/*
 Worker��Ĳ���
*/

public class WorkerTest{

    public static void main(String[] arge){

          Worker w1 =new Worker();
          w1.show(); //null 0
          Worker w2 =new Worker("zhangfei",30,3000);
          w2.show();
          w2.eat("��ѿ");
          w2.play("��Ϸ");
          //w2.work();
        

    }

}