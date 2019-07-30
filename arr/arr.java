import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class arr { 
public static void main(String argvs[]) 
{ 
for (int i=1;i<10;i++){
	
	for (int j=1;j<=i;j++){
	System.out.print(j+"x"+i+"="+i*j+" "+ "\t"); 
	
	}
	System.out.print("\n"); 
}

System.out.print("----------------------------------"+"\n"); 


for (int i=1;i<=5;i++) {
	
	for(int k=1;k<=5-i;k++) {
		System.out.print(" ");
		}
	
	for (int j=0;j<2*i-1;j++) {
		
		System.out.print("*");
		}
	System.out.print("\n"); 
	}


System.out.print("----------------------------------"+"\n"); 
	wujiao();
	
	for(int i=1;i<10;i++) {
		if (i%2!=0) {
		System.out.print(i);
		System.out.print("\n"); 
		}
	}






System.out.print("----------------------------------"+"\n"); 
	wujiao();
	dengyao();
	jihe();
	input();
} 

public  static void wujiao() {
	
	
	String[] wujiaoxing={"     *","    * *","* *    * *"," *      *","   *    *"," * * * *","*        *"};
    for(int i=0;i<wujiaoxing.length;i++){
        System.out.println(wujiaoxing[i]);
    }
}


public static void dengyao() {
	
	for(int j = 0; j < 5 ; j ++) {
        for(int a = 0; a <= j ; a ++) {
            System.out.print("*");
        }
        System.out.println("");
     }
    System.out.println("------等腰三角形的星星-----");

}

public static void jihe() {
	
	String[] j= {"a","b","1","c"};
	for (int i=0; i<j.length; i++) {
		System.out.println(j[i]);
	}
	Collection stringList=java.util.Arrays.asList(j);
	//开始遍历
	for(Iterator itr=stringList.iterator();itr.hasNext();){
		Object str = itr.next();
		System.out.println(str);
	
	}
}

public static void input() {
	Scanner sc = new Scanner(System.in);
	String name=sc.next();
	System.out.print("name="+name);
	
}
	
}