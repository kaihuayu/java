/*For ѭ��ģ������*/
import java.util.Scanner;
public class ForChat{
    public static void main(String[] arge){
        for(;;){
            System.out.println("������Ҫ���͵�����");
            Scanner sc =new Scanner(System.in);
            String msg = sc.next();
                if ("bye".equals(msg)){
                   System.out.println("�������");
                   break;
                }
               // else{
                 System.out.println("С��˵:"+msg);
                //}
         }
     }
}