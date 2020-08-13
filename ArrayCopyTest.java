/*编程实现拷贝*/

public class ArrayCopyTest{

	public static void main(String[] agrs){

          //声明一个初始值为 11 22 33 44 55的一维数组
		int [] arr ={11,22,33,44,55};

	   //打印所有元素
		
             for (int i=0; i<arr.length;i++){

              System.out.print(arr[i] +" ");
	    }
          //声明一个长度为3的元素类型为int类型的数组
	System.out.println();
             int [] brr = new int[3];
          
	   //打印所有元素
		
             for (int i=0; i<brr.length;i++){

              System.out.print(brr[i] +" ");
	    }	
		
		System.out.println();
		System.out.println("------------------------------------------------");
	//将第一个数组中间3个元素赋值到第二个数组
       // brr[0] =arr[1];brr[1] =arr[2];brr[2] =arr[3];
		System.arraycopy(arr,1,brr,0,3); //将数组中下标从1开始的3个元素拷贝到数组BRR从下标0开始
		
          for (int i=0;i<arr.length;i++){
           	if(i<3){
				brr[i]=arr[i+1];
                  }
			
			}
			 //打印所有元素
		
             for (int i=0; i<brr.length;i++){

              System.out.print(brr[i] +" ");
	
		
			 }		
		//编程统计用户输入任意一个正整数中每个数字出现的次数统计并打印
		
		
		
     }
}