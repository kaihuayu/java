/* car������
import Car;
*/

public class CarTest{


       public static void main(String[] ages){
     Car c= new Car();
      c.setBrand("QQ");
        c.setColor("��ɫ");
        c.setPrice(-40000);
        c.show();
        c.grow();
  System.out.println("-----------------------�۸��1000---------------------------------");
        c.show();
     System.out.println("-------------------------�۸�����10000-------------------------------");
       c.grow(10000);
        c.show();
     System.out.println("-------------------------��װ����-------------------------------");


    Car  c1 = new Car();
    // c1.brand ="�µ�";
     // c1.color  ="��ɫ";
     // c1.price = 150000;
     c1.show(); 

System.out.println("-----------------------");
    Car c2 = new Car("����","��ɫ",-500);
     c2.show();

   }



}