/*���ʵ��Point��Ķ����ʹ��*/

public class Point {


    int x; //��������������ĳ�Ա����

    int y; //��������������ĳ�Ա����

    //�޲ι���
    Point(){
    }
    //�вι���
    Point(int i,int j){
         x =i;
         y =j;
          
     } 
    void show(){

           System.out.println("������"+ x +"������"+y);
    }
   //�Զ����Ա����ʵ���������һ�Ĺ���
    void reduce(){

          y --;
     }
   
    void reduce(int i){

          y -=i;  
     }
    
   //�Զ����Ա����ʵ���������ȥ����ָ����ֵ�Ĺ���

    public static void main(String[] args){
    // ����Point����ָ��Point���󣬴�ӡ������Ĭ����ֵ
    Point p = new Point();

          p.show();
    //System.out.println("x="+p.x +"y="+p.y);
    
     System.out.println("-------------------------------");

     p.x=3;
     p.y=5;
      //System.out.println("x="+p.x +"y="+p.y);
      p.show();

     //�в�����ʽ
    
       Point p2 = new Point(20,30);
       p2.show();
       p2.reduce();  //29;
       p2.show();
       p2.reduce(9);
       p2.show();   //20
    }
}