/*
   ���ʵ��Person��ķ�װ
*/

public class Person{

    //1��˽�л���Ա������ʹ��private�ؼ�������

      private String name;
      private int age;
      //private String country; //�����ڶ���㼶��ÿ�������ж�����һ��
	  public static String country; //��������㼶�������ж�����һ��
   //2.�ṩ���е�get��set���������ڷ������н��к���ֵ���ж�

   //3.�ڹ��췽���е���set�������к���ֵ���ж�
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
              System.out.println("���䲻����");     
           }
      }
      public String getConutry(){
            return country;  
      }
      public void setCountry(String country){
            this.country =country;
      }
	  
	  public void show(){
		  System.out.println("�ҽ�"+getName()+"����"+getAge()+"����"+getConutry());
		  
	  }
	  
	  public static void main(String[] ages){

                  //û��������ʱ���������ӱ���������
                  System.out.println("Person.country="+Person.country);  
		  Person p=new Person("����","��",100);
		  p.show();
		 
                  Person p2=new Person("����","���",110); 
                   p.country="��̬";
                   System.out.println("����"+p2.country);
		  
	  }
                                 


}