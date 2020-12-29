/*

编程实现 Singleton类的封装；
饿汉式 一上来就new；
*/

public class Singleton {
      //2.提供本类类型的引用指向本类的对象
   //Singleton sin =new Singleton(); //sin 对象级成员变量，外部无法访问
   //private static Singleton sin =new Singleton(); 饿汉式 //sin 类级别的成员变量，外部可访问类名.成员变量,用private封装后无法直接方法，提供公有的get方法负责把他返回出去
   private static Singleton sin =null; //懒汉式 当有调用时候才返回出去

   //3.提供公有的get方法负责把他返回出去  （对象层级 需要 引用.调用 new）所以加上 类层级 加上static
      public static Singleton getInstance(){

       //return sin; 饿汉式
         if (null ==sin){
             sin = new Singleton(); //懒汉式

         }
           return sin;
      }
      
   //私有化构造方法
   //1.private修饰构造方法表示该方法只能在本类的内部使用
   private Singleton(){


   } 
}