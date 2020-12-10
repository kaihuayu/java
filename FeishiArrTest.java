/*

   费氏数列 1,1,2,3,5,8,13,21,34,55,89，......

    n=1 返回  1, n=2 返回 1 1 n=3 返回1 1 2 n=4 ,1 1 2 3

F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
*/
import java.math.BigInteger;
import java.util.*;
public class FeishiArrTest {
 
	/**
	 * @author Helen
	 * Nov 21, 2014 10:30:46 AM
	 * @param args
	 * void
	 * TODO
	 */
	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入N:");
		n=input.nextInt();
		input.close();
		long t=System.currentTimeMillis();
		cal(n);
		System.out.println();
		System.out.println("cal耗时:"+(System.currentTimeMillis()-t));
		t=System.currentTimeMillis();
		for (int i = 1; i < n; i++) {
			System.out.print(cal2(i)+",");
		}
		System.out.println();
		System.out.println("cal2耗时:"+(System.currentTimeMillis()-t));
	}
	
	public static void cal(int n){
		int[] Fib=new int[n];
		//f(n)=n,if n=0,n=1
		Fib[0]=0;
		Fib[1]=1;
		//f(n)=f(n-1)+f(n-2),if n>=2
		for (int i = 2; i < Fib.length; i++) {
			Fib[i]=Fib[i-1]+Fib[i-2];
		}
		for (int i : Fib) {
			System.out.print(i+",");
		}
	}
	/**
	 * 
	 * @author Helen
	 * Nov 21, 2014 11:13:56 AM
	 * @param n
	 * @return
	 * int
	 * TODO 递归(耗时)
	 */
	public static int cal2(int n){
		if(n==0||n==1){
			return n;
		}else{
			return cal2(n-1)+cal2(n-2);
		}
	}
}