/*
 ���ʵ�ֽ׳˼��㲢��ӡ  

*/

public class JiechengTest{


    //�Զ����Ա����ʵ�ֲ���n�׳˲����� ���Ʒ�ʽ

  /* int show (int n){
       int res =1;
       for (int i= n;i >1;i--){
           res *=i; // res =res *i;  

       }     
        return res;
     }*/

     //�ݹ鷽ʽ

     int show (int n){
  
         if (1==n){
            return  1;     
         }
         
       return n*show(n-1);            

     }

    public static void main (String[] ages){

       JiechengTest jt = new JiechengTest();
       int num = jt .show(5);
       System.out.println("����ǣ�"+ num);
     }


}