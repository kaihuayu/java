/* 赋值运算符*/
public class AssignTest{
    public static void main(String [] arge){
        int a =2;
       System.out.println("a="+a);
       System.out.println("----------------------------");
       //使用简单赋值运算
	a =5; // 用当前值覆盖之前的值
	 System.out.println("a="+a);
       System.out.println("-符合赋值运算---------------------------"); 
       //a= a+2; //等同于 a+ =2;
	a+=2; //符合赋值
       System.out.println("a="+a);

}
}