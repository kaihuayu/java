/*for 循环*/

public class ForTest{

    public static void main(String [] args) throws Exception{

     for (int money=500; money>=100;money-=100){
         System.out.println("当前余额"+money +"正在出钞，请稍后。。。");
         Thread.sleep(5000);//延时5秒
         System.out.println(" 请取走您的钞票！\n\n\n");
      }
       System.out.println("现在可以潇洒的享乐了。。。");       
     


    }
}