/* 变量自增符号++ 自身数值加1，++ 在变量前后都可以
对应变量自身来数 ++ 在前 或在 后 结果一样
*/
import java.util.Scanner;
public class MySelf{
    public static void main (String[] aa){
        int a= 10;
        System.out.println("a="+ a);
	a++;
	System.out.println("a="+ a);
	++a;
	System.out.println("a="+a);
	System.out.println("--------------------------------");
        //ia++ 这个整体叫做表达式，其中ia叫做操作数，其中++叫做操作符。
        //表达式和变量有各自独立的内存空间;
	//a++表示先让a的数值作为整个表达式的结果。然后在让a 自身加1
        System.out.println(a++);   //12 //后++是先拷贝a的值到内存，然后在+。所以表达式的值还是12
        System.out.println("a=" +a);//13 实际 a 已经加1
        System.out.println(++a);    //14
        System.out.println("a="+a);//14

    }



}