/*

���ʵ�� Singleton��ķ�װ��
����ʽ һ������new��
*/

public class Singleton {
      //2.�ṩ�������͵�����ָ����Ķ���
   //Singleton sin =new Singleton(); //sin ���󼶳�Ա�������ⲿ�޷�����
   //private static Singleton sin =new Singleton(); ����ʽ //sin �༶��ĳ�Ա�������ⲿ�ɷ�������.��Ա����,��private��װ���޷�ֱ�ӷ������ṩ���е�get��������������س�ȥ
   private static Singleton sin =null; //����ʽ ���е���ʱ��ŷ��س�ȥ

   //3.�ṩ���е�get��������������س�ȥ  ������㼶 ��Ҫ ����.���� new�����Լ��� ��㼶 ����static
      public static Singleton getInstance(){

       //return sin; ����ʽ
         if (null ==sin){
             sin = new Singleton(); //����ʽ

         }
           return sin;
      }
      
   //˽�л����췽��
   //1.private���ι��췽����ʾ�÷���ֻ���ڱ�����ڲ�ʹ��
   private Singleton(){


   } 
}