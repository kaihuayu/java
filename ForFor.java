/* for 双重循环 
 外层循环用于控制打印行数。
 内层循环用于控制当前行的打印的列数
 外层的循环变量动一下，则内层跑一圈；
 当需要打印多行多列的时候需要用到

*/
public class ForFor{
   public static void main(String [] arge){
       //1.打印5行字符串内容
       for (int i=1; i<= 5; i++){
           System.out.println("厉害了我的歌");
       }

System.out.println("----------------------------------------");

      // 打印5列字符串内容
        for (int j=1; j<=5; j++){
            System.out.print("厉害了我的歌 ");
        }
        //换行用
        System.out.println();

       //打印五行五列
System.out.println("----------------------------------------");
       for (int i=1; i<= 5; i++){
           
            for (int j=1; j<=5; j++){
                System.out.print("厉害了我的歌 ");
            }
             System.out.println();
       }


   }

}