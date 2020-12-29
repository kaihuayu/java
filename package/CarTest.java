/* car测试类
import Car;
*/

public class CarTest{


       public static void main(String[] ages){
     Car c= new Car();
      c.setBrand("QQ");
        c.setColor("红色");
        c.setPrice(-40000);
        c.show();
        c.grow();
  System.out.println("-----------------------价格加1000---------------------------------");
        c.show();
     System.out.println("-------------------------价格增加10000-------------------------------");
       c.grow(10000);
        c.show();
     System.out.println("-------------------------封装内容-------------------------------");


    Car  c1 = new Car();
    // c1.brand ="奥迪";
     // c1.color  ="黑色";
     // c1.price = 150000;
     c1.show(); 

System.out.println("-----------------------");
    Car c2 = new Car("大众","白色",-500);
     c2.show();

   }



}