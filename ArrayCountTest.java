//编程统计用户输入任意一个正整数中每个数字出现的次数统计并打印
import java.util.Scanner;
public class ArrayCountTest{


	public static void main(String[] args){


		//提示输入任意一个正整数
              System.out.println("输入一个正整数");
              Scanner sc = new Scanner(System.in);
              int number =sc.nextInt();
               //将正整数中每个数字拆分出来并记录
		int[] arr =new int[10];

              while(number>0){
                arr[number%10]++; //对10求余，如果余数等于k，则说明个位上出现k
                number /=10;// 除以10，并保存结果，去除当前个位，当n==0时结束
						
	      }
          //打印所有元素
		
            	 for (int i=0; i<arr.length;i++){
                  if(arr[i]>0){
                   System.out.print("数字"+i +"出现了"+arr[i] +" 次");
		}
	    }	


	}





}