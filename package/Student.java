/*
��ʾ�û�����༭��ѧ�������Լ�ÿ��ѧ���� ѧ�ţ����������䣬���ֱ��ӡ���� ��װ
*/

public class Student{

      private String name;
      private int num;
      private int age;

      public Student(){}
      public Student(String name,int num,int age){
         setName(name);
         setNum(num);
         setAge(age);

      }

      public void setName(String name){
            this.name=name;
      }
      public String getName(){

           return name;
      }
      public void setNum(int num){
         if (num>0){
            this.num=num;
          }else{

             System.out.println("��������ȷ��ѧ��");
          }
      }
      public int getNum(){
             return num;
      }
      public void setAge(int age){
            this.age=age;
      }
      public int getAge(){
             return age;
      }
                           


}