/* 数组声明 和 打印 */

public class ArrayTest {

    public static void main(String[] arge){
        //动态方式
        int[] arr = new int[3];
        arr[0]= 1;
        arr[1]=2;
        arr[2]=3;
        System.out.println("数组的长度是：" +arr.length);
        //System.out.println("下标为0的元素" + arr[0]);
        //System.out.println("下标为1的元素" + arr[1]);
        //System.out.println("下标为2的元素" + arr[2]);
   //编译oK 运行产生ArrayIndexOutOfBoundsException数组下标越界异常
        System.out.println("--------------------------");
        for(int i= 0; i<arr.length;  i++){
           System.out.println("下标为"+i+"的元素" + arr[i]);

        }
        System.out.println("--------------------------");
        double[] dArr = new double[5];
        for(int i= 0; i<dArr.length;  i++){
           System.out.println("下标为"+i+"的元素" + dArr[i]);

        }
        System.out.println("--------------数组赋值------------");
        arr[0]= 11;
        arr[1]=22;
        arr[2]=33;
        for(int i= 0; i<arr.length;  i++){
           System.out.println("下标为"+i+"的元素" + arr[i]);

        }
        //给值的没给长度叫静态方式，给长度不给值的动态方式
        System.out.println("--------------声明数组同时对数组元素初始化静态方式------------");
        int[] iArr = {10,55,33,66,88,99};
        System.out.println("数组的长度"+iArr.length);
        for(int i= 0; i<iArr.length;  i++){
           System.out.println("下标为"+i+"的元素" + iArr[i]);

        }
        System.out.println("--------------复杂方式------------");
        int[] tArr = new int[]{1,2,3,4,5,6};
        for(int i= 0; i<tArr.length;  i++){
           System.out.println("下标为"+i+"的元素" + tArr[i]);

        }
		//声明一个长度为5类型为int类型的一维数组，打印所有元素值；
		int [] fARR = new int[5];
		for (int i =0;i<fARR.length; i++){
			System.out.println(fARR[i]);
		}
		
		//使用10 20 30 40分别给数组中前四个位置元素赋值并打印所有元素
		fARR[0]=10;
		fARR[1]=20;
		fARR[2]=30;
		fARR[3]=40;
		
		for (int i =0;i<fARR.length; i++){
			System.out.println(fARR[i]);
		}
		// 将数据50插入到数组中下标为0的位置原有元素向后移动再次打印
		
		//将数据50从数组中删除，后续元素向前移动后再次打印所有元素
		//查找数组中是否包含元素20，若包含将元素20改为200后在次打印所有
    }

}