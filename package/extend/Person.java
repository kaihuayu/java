/* Person��ķ�װ*/

public class Person{

      private String name;
      private int age;
      private void Person(){}

   public void setName(String name){

           this.name=name;
   }
   public String getName(){
            return name;
   }
   public void setAge(int age){
          if(age>0 & age<150){
            this.age= age;
          }else{
             System.out.println("���䲻�Ϸ�");
           }
    }
    public int getAge(){
           return age;
     }      

   public void show(){
         System.out.println("����"+getName()+"���� "+getAge());
    }
   //�����������static ���εķ���������дҲ������static 
   public static void test(){
         System.out.println("�����еľ�̬����");
   }
  //�Զ����Ա���������Է�����Ϊ
   public void eat(String food){
         System.out.println(food+"�ó�"); 
   }
   //�Զ����Ա��������������Ϊ
   public void play(String game){
        System.out.println(game+"����"); 
   }
}