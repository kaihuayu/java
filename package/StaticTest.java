/*
     Static�ؼ��ֵ�ʹ��
*/

public class StaticTest{

    private int cnt =1;//�����ڶ���㼶��ÿ������ӵ��һ��
    private static int snt =2;//��������㼶�����ж�����ͬһ��
    public void show(){

      System.out.println("cnt="+cnt);
      System.out.println("snt="+snt);

    }
    
   //ʹ��static���εķ�����������㼶���Ƽ�ʹ������.����
    public static void test(){
      //System.out.println("cnt="+cnt); //error StaticTest.java:18: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� cnt
     // System.out.println("cnt="+cnt); //error
      System.out.println("snt="+snt);

    }

    public static void main (String[] args){
        StaticTest st = new StaticTest();     
        st.show();
        StaticTest.test();
    }
}