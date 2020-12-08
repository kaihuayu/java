/*编程实现Point类的定义和使用*/

public class Point {


    int x; //用于描述横坐标的成员变量

    int y; //用于描述纵坐标的成员变量

    //无参构造
    Point(){
    }
    //有参构造
    Point(int i,int j){
         x =i;
         y =j;
          
     } 
    void show(){

           System.out.println("横坐标"+ x +"纵坐标"+y);
    }
   //自定义成员方法实现纵坐标减一的功能
    void reduce(){

          y --;
     }
   
    void reduce(int i){

          y -=i;  
     }
    
   //自定义成员方法实现纵坐标减去参数指定数值的功能

    public static void main(String[] args){
    // 声明Point引用指向Point对象，打印特征的默认数值
    Point p = new Point();

          p.show();
    //System.out.println("x="+p.x +"y="+p.y);
    
     System.out.println("-------------------------------");

     p.x=3;
     p.y=5;
      //System.out.println("x="+p.x +"y="+p.y);
      p.show();

     //有参数方式
    
       Point p2 = new Point(20,30);
       p2.show();
       p2.reduce();  //29;
       p2.show();
       p2.reduce(9);
       p2.show();   //20
    }
}