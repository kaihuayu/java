/*worker继承person类*/

public class Worker extends Person{
      //私有化成员变量
      private int salary;
     // 2.提供公有的get,set方法并进行合理判断

     //3.在构造方法中调用set方法
     public Worker(){}
     public Worker(String name,int age,int salary){
         setName(name);
         setAge(age);
         setSalary(salary);
           
     }

     
      public void setSalary(int salary){
           if(salary>2012){
            this.salary=salary;
           }else{
           System.out.println("不合理");
          }
       }

       public int getSalary(){
                return salary;
       }
       //自定义成员方法
      public void work(){
            System.out.println("工作中"+"薪水"+getSalary());
      }

      @Override   //标注，说明下面的方法是对父类中方法的重写，若没构成重写规则就报错
      public void show(){
       super.show();//超类调用父类中的show方法;
       System.out.println("我的薪水"+getSalary());
         
      }
     //如果父类中用static 修饰的方法子类重写也必须是static
      public static void test(){
         System.out.println("子类中的静态方法");
   }


}