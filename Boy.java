/* this ԭ��

 
Ϊʲô��ͬ�Ķ������ͬһ��������ӡ�����ͬ����Ϊ�������ڳ�Ա�����з��ʳ�Ա������Ȼд����name��ʵ��Ĭ��this.name


*/

public class Boy {

    String name ;  //��Ա����

    //�޲ι���
    Boy(){

    System.out.println("�޲ι���");
      };  
   
   //�ͽ�ԭ��  ������this��ӡ���Ϊnull
    Boy(String name){
        this(); //�ڹ��췽���ĵ�һ��ʹ��this��ʵ�Σ��ķ�ʽ���Ե��ñ����е��������췽����
         this.name =name;
      System.out.println("�вι���");
    }
 //��Ա����
   void show(){
      System.out.println("name=" +name);
 
     }

 public static void main(String [] ages){

      Boy b= new Boy("����");
      b.show();
      Boy b2= new Boy("����");
      b2.show();
      Boy b3 =null;
      b3.show(); //NullPointerException 


 }






}