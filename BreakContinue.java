/*break 关键字 continue 关键字*/

public class BreakContinue{

    public static void main(String[] arge){
       for (int i=1;i<=20;i++){

            if (0==i%5){
              continue; //结束本次循环继续下一次循环
             }
            if(18 == i){
               break;
            }
       System.out.println("i="+i);

       }


    }

}