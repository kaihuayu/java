/* if- else if 分支结构*/
import java.util.Scanner;
public class Ifelseif{
    public static void main(String[] arge){
       System.out.println("输入身份信息");
       Scanner sc = new Scanner(System.in);
       String str =sc.next();
    //由于String 类型是引用数据类型，因此使用equals方法判断是否相等；
     if("军人".equals(str)){
          System.out.println("可以走军人通道");
      }
      else if ("学生".equals(str)){
          System.out.println("请走学生通道");
      }
      else{
          System.out.println("请走普通通道");  
      }    


   System.out.println("我们过来啦");

    }
}