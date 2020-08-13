/*二维数组*/
public  class ArryArryTest{
	
	
	public static void main(String[] args){
		//声明一个具有2行3列元素类型为INT类型的二维数组 
		int[][] arr = new int[2][3];
		//打印所有数组元素
		//使用外层for循环用于控制打印的行数
		for (int i=0;i<arr.length;i++){
			//使用内层FOR循环用控制打印的列数
			for(int j= 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "");
			}
			System.out.println(); //第一行结束换行
			
		}
		
		System.out.println("-------------------------");
		//二维数组中元素的初始化和打印
		int[][] brr ={{1,2,3},{4,5,6,}};
		//打印
		
		for (int i=0;i<brr.length;i++){
			//使用内层FOR循环用控制打印的列数
			for(int j= 0; j<brr[i].length; j++){
				System.out.print(brr[i][j] + "");
			}
			System.out.println(); //第一行结束换行
			
		}
		
		System.out.println("-------------------------");
		//二维数组的特殊用法
		int[][] crr = new int[3][]; //列不固定
		crr[0] =new int[3];  //第一行 有3列
		crr[1] =new int[4];  //第二行 有4列
		crr[2] =new int[5];  //第s三行 有5列
		
		for (int i=0;i<crr.length;i++){
			//使用内层FOR循环用控制打印的列数
			for(int j= 0; j<crr[i].length; j++){
				System.out.print(crr[i][j] + "");
			}
			System.out.println(); //第一行结束换行
			
		}
	}
	
	
	
}