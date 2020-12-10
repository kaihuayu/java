/* this 原理

 
为什么不同的对象调用同一个方法打印结果不同，因为当我们在成员方法中访问成员变量虽然写的是name其实是默认this.name


*/

public class Boy {

    String name ;  //成员变量

    //无参构造
    Boy(){

    System.out.println("无参构造");
      };  
   
   //就近原则  ，不加this打印结果为null
    Boy(String name){
        this(); //在构造方法的第一行使用this（实参）的方式可以调用本类中的其他构造方法。
         this.name =name;
      System.out.println("有参构造");
    }
 //成员方法
   void show(){
      System.out.println("name=" +name);
 
     }

 public static void main(String [] ages){

      Boy b= new Boy("哈哈");
      b.show();
      Boy b2= new Boy("嘻嘻");
      b2.show();
      Boy b3 =null;
      b3.show(); //NullPointerException 


 }






}