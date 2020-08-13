/*for  循环打印1 到 10 */

class ForNumber{
    public static void main(String[] arge){
        for (int i=1; i<=10; i++){
         System.out.println(i);
        }
        //在（）或{ }声明的变量叫块变量，出了右边的括号就销毁了。
        //打印10 到 1
         System.out.println("----------打印10 到 1------------------");
         for (int i=10; i>=1;i--){
         System.out.println(i);
        }
        //打印1-100奇数
        for(int i=1;i<=100;i++){
           if(i%2 !=0)
           {
             System.out.println("i="+i);
           }
           
        }
        System.out.println("等差数列的方式打印奇数");
        for(int i=1;i<=100;i=i+2){
            System.out.println("i="+i);
        }
        System.out.println("通项公式的方式打印奇数");
        for(int  i=1; i<=50;i=i+1){
            System.out.println("i="+(2*i-1));

         }

    }

}