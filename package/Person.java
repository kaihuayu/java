/*
   编程实现Person类的封装
*/

public class Person{

    //1。私有化成员变量，使用private关键字修饰

      private String name;
      private int age;
      //private String country; //隶属于对象层级，每个对象都有独立的一份
	  public static String country; //隶属于类层级，被所有对象共享一份
   //2.提供公有的get和set方法，并在方法体中进行合理值的判断

   //3.在构造方法中调用set方法进行合理值的判断
      public Person(String name,String country,int age){
        setName(name);
        setAge(age);
        setCountry(country);
      } 
      public Person(){}
      
  
      public String getName(){
           return name; 

      }
      public void setName(String name){
          this.name = name;
      }
      public int getAge(){
         
           return age;

      }
      public void setAge(int age){
          if (age >=0 && age <=150){
             this.age =age;
           }else{
              System.out.println("年龄不合适");     
           }
      }
      public String getConutry(){
            return country;  
      }
      public void setCountry(String country){
            this.country =country;
      }
	  
	  public void show(){
		  System.out.println("我叫"+getName()+"年龄"+getAge()+"国籍"+getConutry());
		  
	  }
	  
	  public static void main(String[] ages){

                  //没创建对象时候，用类名加变量名访问
                  System.out.println("Person.country="+Person.country);  
		  Person p=new Person("哈哈","大方",100);
		  p.show();
		 
                  Person p2=new Person("哈哈","大大",110); 
                   p.country="静态";
                   System.out.println("国籍"+p2.country);
		  
	  }
                                 


}