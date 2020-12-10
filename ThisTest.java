/*


  编程实现this关键字概念的测试

*/

public class ThisTest{


       ThisTest(){
            //在构造方法中出现this代表当前正在构造的对象
         System.out.println("构造方法 this ="+this);
       }

       void show(){
          // 在构造方法中出现的this代表当前正在调用的对象
           System.out.println("成员方法 this ="+this);
        } 


      public static void main(String[] args){

              ThisTest tt = new ThisTest();
              tt.show();
              System.out.println("main方法中：tt= "+ tt);


              ThisTest tt2 = new ThisTest();
              tt2.show();
              System.out.println("main方法中：tt2= "+ tt2);

       }
}