/*
SingletonTest���Singleton����в���
Ҫ����main�ŷ����ܵõ���ֻ�ܵõ�Singleton���һ������
*/

public class SingletonTest {
 
     public static void main (String[] args){
          //����Singleton ���͵�����ָ�����Ķ���
       //Singleton s1 = new Singleton();
       //Singleton s2 = new Singleton();
      //System.out.println(s1==s2);//�ж�s1��s2�Ƿ���� ���������� ��ַ��ͬ��
      Singleton s1= Singleton.getInstance();
      Singleton s2= Singleton.getInstance();
       System.out.println(s1==s2);//�ж�s1��s2�Ƿ����   ��� true  
     }


}