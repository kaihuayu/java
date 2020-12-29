/*
     Static关键字的使用
*/

public class StaticTest{

    private int cnt =1;//隶属于对象层级，每个对象都拥有一份
    private static int snt =2;//隶属于类层级，所有对象共享同一份
    public void show(){

      System.out.println("cnt="+cnt);
      System.out.println("snt="+snt);

    }
    
   //使用static修饰的方法隶属于类层级，推荐使用类名.方法
    public static void test(){
      //System.out.println("cnt="+cnt); //error StaticTest.java:18: 错误: 无法从静态上下文中引用非静态 变量 cnt
     // System.out.println("cnt="+cnt); //error
      System.out.println("snt="+snt);

    }

    public static void main (String[] args){
        StaticTest st = new StaticTest();     
        st.show();
        StaticTest.test();
    }
}