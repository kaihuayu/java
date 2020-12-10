/*
 编程实现阶乘计算并打印  

*/

public class JiechengTest{


    //自定义成员方法实现参数n阶乘并返回 递推方式

  /* int show (int n){
       int res =1;
       for (int i= n;i >1;i--){
           res *=i; // res =res *i;  

       }     
        return res;
     }*/

     //递归方式

     int show (int n){
  
         if (1==n){
            return  1;     
         }
         
       return n*show(n-1);            

     }

    public static void main (String[] ages){

       JiechengTest jt = new JiechengTest();
       int num = jt .show(5);
       System.out.println("结果是："+ num);
     }


}