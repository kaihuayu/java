/*
SingletonTest类对Singleton类进行测试
要求在main放风筝能得到且只能得到Singleton类的一个对象。
*/

public class SingletonTest {
 
     public static void main (String[] args){
          //声明Singleton 类型的引用指向该类的对象
       //Singleton s1 = new Singleton();
       //Singleton s2 = new Singleton();
      //System.out.println(s1==s2);//判断s1和s2是否相等 （结果不相等 地址不同）
      Singleton s1= Singleton.getInstance();
      Singleton s2= Singleton.getInstance();
       System.out.println(s1==s2);//判断s1和s2是否相等   结果 true  
     }


}