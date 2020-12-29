/*
提示用户输入编辑的学生人数以及每个学生的 学号，姓名，年龄，最后分别打印出来

Student[] arr =new Student[ii]引用数据类型的数组中放的是内存地址，(基本数据类型数组中放的是值)；
*/
import java.util.Scanner;
public class StudentTest{

    

   private void StudentTest(){};
  
   public static void main(String[] args){

    //1.请输入学生数
     System.out.println("请输入学生数");
   Scanner sc = new Scanner(System.in);
     int ii = sc.nextInt();
  //2.根据认识生成一个一维数组  
   //数组中的每个元素都是Student类型的变量
   
    Student[] arr =new Student[ii];//生成一个 类型为Student长度为ii的数组
    Student s = new Student(); 
     for(int i= 0;i< ii;i++){

        System.out.println("请输入第"+ (i+1)+ "个学生的信息 姓名，学号，年龄");

         arr[i]  = new Student( sc.next(), sc.nextInt(),sc.nextInt());
     }   
      
    for (int n=0;n<ii;n++){
         System.out.println("姓名"+arr[n].getName()+"学号:" +arr[n].getNum() + "年龄"+arr[n].getAge());
      }
     
   /* System.out.println("请输入学号");
    Scanner n = new Scanner(System.in);
    int num =n.nextInt();
    Student s = new Student();
    s.setNum(num);
    System.out.println("学号:"+s.getNum());*/
   }






}