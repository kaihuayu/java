/*worker�̳�person��*/

public class Worker extends Person{
      //˽�л���Ա����
      private int salary;
     // 2.�ṩ���е�get,set���������к����ж�

     //3.�ڹ��췽���е���set����
     public Worker(){}
     public Worker(String name,int age,int salary){
         setName(name);
         setAge(age);
         setSalary(salary);
           
     }

     
      public void setSalary(int salary){
           if(salary>2012){
            this.salary=salary;
           }else{
           System.out.println("������");
          }
       }

       public int getSalary(){
                return salary;
       }
       //�Զ����Ա����
      public void work(){
            System.out.println("������"+"нˮ"+getSalary());
      }

      @Override   //��ע��˵������ķ����ǶԸ����з�������д����û������д����ͱ���
      public void show(){
       super.show();//������ø����е�show����;
       System.out.println("�ҵ�нˮ"+getSalary());
         
      }
     //�����������static ���εķ���������дҲ������static
      public static void test(){
         System.out.println("�����еľ�̬����");
   }


}