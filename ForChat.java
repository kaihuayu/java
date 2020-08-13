/*For 循环模拟聊天*/
import java.util.Scanner;
public class ForChat{
    public static void main(String[] arge){
        for(;;){
            System.out.println("请输入要发送的内容");
            Scanner sc =new Scanner(System.in);
            String msg = sc.next();
                if ("bye".equals(msg)){
                   System.out.println("聊天结束");
                   break;
                }
               // else{
                 System.out.println("小明说:"+msg);
                //}
         }
     }
}