/*编程实现数组的增删改查*/
public class ArrayOperationTest{


	   public static void main(String[] arge){

		//声明一个长度为5类型为int类型的一维数组，打印所有元素值；
			int [] fARR = new int[5];
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
		System.out.println("----------------------------------------------------------");	
			//使用10 20 30 40分别给数组中前四个位置元素赋值并打印所有元素
			fARR[0]=10;
			fARR[1]=20;
			fARR[2]=30;
			fARR[3]=40;
			
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
			System.out.println("----------------------------------------------------------");	
			// 将数据50插入到数组中下标为0的位置原有元素向后移动再次打印
			
			for (int i=fARR.length; i>0; i--){
				
				if(i-1==0){
					 fARR[i-1]=50;
				}else{
					 fARR[i-1]=fARR[i-2];
				}
				
			}
			System.out.println("数组插入后打印结果");
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
		System.out.println("----------------------------------------------------------");		
			//将数据50从数组中删除，后续元素向前移动后再次打印所有元素
			
			for (int i=0 ;i<fARR.length-1;i++){
				//if (i<4){
				fARR[i]=fARR[i+1];
				System.out.println(i);
				//}
		
			}
			fARR[4] =0;
			System.out.println("删除后数组打印结果");
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
			System.out.println("----------------------------------------------------------");	
			//查找数组中是否包含元素20，若包含将元素20改为200后在次打印所有
			
			for (int i=0;i<fARR.length; i++){
				
				if (20==fARR[i]){
					fARR[i]=200;
					
				}
				
			}
			
				System.out.println("修改后数组打印结果");
				for (int i =0;i<fARR.length; i++){
					System.out.print(fARR[i]+" ");
				}

	   }
   
}