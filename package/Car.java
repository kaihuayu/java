/*��װ*/

public class Car {
  //1.˽�л���Ա������ʹ��private �ؼ������Σ�
// private ���γ�Ա������ʾ˽�еĺ��壬�ó�Ա����ֻ���ڱ�����ڲ�ʹ��
   private String brand; //��������Ʒ�Ƶĳ�Ա������
   private String color; //����������ɫ�ĳ�Ա������
   private int price;    //���������۸�ĳ�Ա������
//2.�ṩ���е�get��set���������ڷ������н��к���ֵ���ж�
//public ���γ�Ա������ʾ���еģ��÷�������������λ�õ���
// ������ǰ��ʲôҲ���ӱ�ʾĬ��Ȩ�ޣ����ʼ������public,
 //3.�ڹ��췽���е���set�������к���ֵ���ж�
//���÷����ṩ����Ŀ�ά����
   public void setBrand(String brand){

         this.brand=brand;
    };
   public void setColor(String color){

          this.color = color;
    };
// ��װ���۸��Ƿ����
   public void setPrice (int price){
          if(price >= 0){
           this.price =price;
           }else{

             System.out.println("�۸񲻺���");
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
   

    //�޲ι���
   Car(){};

   //�в�������
   Car(String brand,String color,int price){
        //this.brand=brand;
        //this.color=color;
       // ��װ���۸��Ƿ���� 
       setBrand(brand);
       setColor(color);
       setPrice(price);
    }
    
  //ʵ�ּ۸�����1000Ԫ����Ϊ
     void grow(){

        price +=1000;
     };
    //ʵ�ּ۸����Ӳ���ָ����ֵ����Ϊ
 
     void grow(int price){

        this.price +=price;
     };
  //��ӡ���в���
     void show(){
        System.out.println("������Ʒ��"+getBrand() +"��ɫ"+getColor()+"�۸�"+getPrice());
    };

  /* public static void main(String[] ages){
     Car c= new Car();
      c.setBrand("QQ");
        c.setColor("��ɫ");
        c.setPrice(40000);
        c.show();
        c.grow();
  System.out.println("-----------------------�۸��1000---------------------------------");
        c.show();
     System.out.println("-------------------------�۸�����10000-------------------------------");
       c.grow(10000);
        c.show();
     System.out.println("--------------------------------------------------------");


    Car  c1 = new Car();
      c1.brand ="�µ�";
      c1.color  ="��ɫ";
      c1.price = 150000;
     c1.show();    

   }*/


}