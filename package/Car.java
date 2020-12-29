/*封装*/

public class Car {
  //1.私有化成员变量，使用private 关键字修饰；
// private 修饰成员变量表示私有的含义，该成员变量只能在本类的内部使用
   private String brand; //用于描述品牌的成员变量；
   private String color; //用于描述颜色的成员变量；
   private int price;    //用于描述价格的成员变量；
//2.提供公有的get和set方法，并在方法体中进行合理值的判断
//public 修饰成员方法表示公有的，该方法可以在任意位置调用
// 若方法前面什么也不加表示默认权限，访问级别低于public,
 //3.在构造方法中调用set方法进行合理值的判断
//调用方法提供代码的可维护性
   public void setBrand(String brand){

         this.brand=brand;
    };
   public void setColor(String color){

          this.color = color;
    };
// 封装检查价格是否合理
   public void setPrice (int price){
          if(price >= 0){
           this.price =price;
           }else{

             System.out.println("价格不合理");
           }
    }

   public String getColor(){
      return color;

   } 
   public String getBrand(){
      return brand;
   }
   public int getPrice(){
      return price;
    }
   

    //无参构造
   Car(){};

   //有参数构造
   Car(String brand,String color,int price){
        //this.brand=brand;
        //this.color=color;
       // 封装检查价格是否合理 
       setBrand(brand);
       setColor(color);
       setPrice(price);
    }
    
  //实现价格增长1000元的行为
     void grow(){

        price +=1000;
     };
    //实现价格增加参数指定数值的行为
 
     void grow(int price){

        this.price +=price;
     };
  //打印所有参数
     void show(){
        System.out.println("汽车的品牌"+getBrand() +"颜色"+getColor()+"价格"+getPrice());
    };

  /* public static void main(String[] ages){
     Car c= new Car();
      c.setBrand("QQ");
        c.setColor("红色");
        c.setPrice(40000);
        c.show();
        c.grow();
  System.out.println("-----------------------价格加1000---------------------------------");
        c.show();
     System.out.println("-------------------------价格增加10000-------------------------------");
       c.grow(10000);
        c.show();
     System.out.println("--------------------------------------------------------");


    Car  c1 = new Car();
      c1.brand ="奥迪";
      c1.color  ="黑色";
      c1.price = 150000;
     c1.show();    

   }*/


}