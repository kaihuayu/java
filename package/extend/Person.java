/* Person类的封装*/

public class Person{

      private String name;
      private int age;
      private void Person(){}

   public void setName(String name){

           this.name=name;
   }
   public String getName(){
            return name;
   }
   public void setAge(int age){
          if(age>0 & age<150){
            this.age= age;
          }else{
             System.out.println("年龄不合法");
           }
    }
    public int getAge(){
           return age;
     }      

   public void show(){
         System.out.println("我是"+getName()+"年龄 "+getAge());
    }
   //如果父类中用static 修饰的方法子类重写也必须是static 
   public static void test(){
         System.out.println("父类中的静态方法");
   }
  //自定义成员方法描述吃饭的行为
   public void eat(String food){
         System.out.println(food+"好吃"); 
   }
   //自定义成员方法描述娱乐行为
   public void play(String game){
        System.out.println(game+"好玩"); 
   }
}