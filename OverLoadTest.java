/*
  编程实现重载体现形式的测试

*/

public class OverLoadTest {


    void show(){

         System.out.println("show()");     
    }

    void show(int i){

         System.out.println("show()"+i);     
    }

    void show(int i,double d){

         System.out.println("show()"+i +d);     
    }
  
    void show(double d,int i){

         System.out.println("show()"+i +d);     
    }

   /* int show(){ //与返回值类型无关

             System.out.println("show()");   
      } */
     

  //方法重载与形参变量名无关
    public static void main (String[]argsK){

              
         //声明本类类型的引用 指向本类的对象
            OverLoadTest ot = new OverLoadTest();
            
            //调用成员方法 调用的时候可以区分就可以重载
           ot.show();
           ot.show(66);
           ot.show(5,3.141596);
           ot.show(3.141596,5);

    }


}