/*
��ʾ�û�����༭��ѧ�������Լ�ÿ��ѧ���� ѧ�ţ����������䣬���ֱ��ӡ����

Student[] arr =new Student[ii]�����������͵������зŵ����ڴ��ַ��(�����������������зŵ���ֵ)��
*/
import java.util.Scanner;
public class StudentTest{

    

   private void StudentTest(){};
  
   public static void main(String[] args){

    //1.������ѧ����
     System.out.println("������ѧ����");
   Scanner sc = new Scanner(System.in);
     int ii = sc.nextInt();
  //2.������ʶ����һ��һά����  
   //�����е�ÿ��Ԫ�ض���Student���͵ı���
   
    Student[] arr =new Student[ii];//����һ�� ����ΪStudent����Ϊii������
    Student s = new Student(); 
     for(int i= 0;i< ii;i++){

        System.out.println("�������"+ (i+1)+ "��ѧ������Ϣ ������ѧ�ţ�����");

         arr[i]  = new Student( sc.next(), sc.nextInt(),sc.nextInt());
     }   
      
    for (int n=0;n<ii;n++){
         System.out.println("����"+arr[n].getName()+"ѧ��:" +arr[n].getNum() + "����"+arr[n].getAge());
      }
     
   /* System.out.println("������ѧ��");
    Scanner n = new Scanner(System.in);
    int num =n.nextInt();
    Student s = new Student();
    s.setNum(num);
    System.out.println("ѧ��:"+s.getNum());*/
   }






}