/*
提示用户输入编辑的学生人数以及每个学生的 学号，姓名，年龄，最后分别打印出来 封装
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

             System.out.println("请输入正确的学号");
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