/*
实现Person类的定义和使用
*/
public class Person {
	
	String name; //用于描述姓名的成员变量
	int age; //用于描述姓名的成员变量
	

        //自定义成员方法打印所有特征的数值
       
       void show(){
          // 成员方法中允许直接访问成员变量
           System.out.println("我是" +name + "年龄" +age);  
        } 

        //自定义成员方法实现年龄增长一岁的行为
        void grow(){
           age ++;

         }
        //自定义成员方法实现年龄增长参数指定数值的行为
        void grow(int i){

           age += i;
        } 

 
       //自定义无参构造方法
       Person(){

       }
        
        //自定义构造方法 有参构造方法
        Person(String n,int i){
           // System.out.println("我是构造方法！");   
		name=n;
                age =i;    
        }      


       //自定义成员方法实现将成员变量name修改为指定的数值

       void setName(String n){
            name=n;

        }   
        //自定义成员方法实现将成员变量age修改为指定的数值的行为

        void setAge(int s){

            age =s;        
         }

	public static void main(String[] args){
		
		// 创建Pesron类型的对象
		Person n= new Person();
		n.name ="张三";
		n.age =11;
		//System.out.println("我是" +n.name + "年龄" +n.age);
                //调用方法的本质就是根据方法名跳转过去执行完毕后在跳转回来；
		n.show();
		
	System.out.println("------------------------------------");
     //调用成员方法修改姓名和年龄
       n.setName("zzzzzzzz");
       n.setAge(20);	
	n.show();

            Person n2 = new Person("王晓",22);
   	System.out.println("我是" +n2.name + "年龄" +n2.age);

        //调用方法重载
           n2.grow();
           n2.show();   //王晓 加一岁
           n2.grow(10);   
           n2.show();   //王晓加10岁 
 
	}
	
}