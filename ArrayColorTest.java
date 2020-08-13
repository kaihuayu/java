/*彩色双色球 红球 6个  1-33中6个不重复数字
生成1-16 之间的蓝色号码记录到数组中
*/
import java.util.Random;
public class ArrayColorTest{

	public static void main(String[] args){


         //生成一个长度为7的INT 型的一维数组
         int[] arr = new int[7];
         // 生成6个1到33 之间的红色号码记录到数组
         Random ra = new  Random();
         for (int i=0; i<arr.length-1;i++){
           int number = ra.nextInt(33)+1;
           
           arr[i]=number;
          
	//使用当前生成的随机数与左边的数依次进行比较
            for (int j= i-1;j>=0;j--){

		if (arr[i]==arr[j]){                     
                     i--; //为了下次生成的号码可以覆盖之前已经重复的号码
                 break;// 相等就退出用于跳出当前循环
                }	
	    }
               
                  
           
         } 

      // 生成1-16 之间的蓝色号码记录到数组中
           int blueNumb=ra.nextInt(16)+1;
            arr[6]=blueNumb;
	 for (int i=0; i<arr.length;i++){

             System.out.println("随机生成的号码是："+ arr[i]);

              }	


	}


}