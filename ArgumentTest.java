/*

    参数传递过程测试
*/

public class ArgumentTest{


    void show(int i){
        i=200;
        System.out.println("i=" +i);
 
    }
  //引用型形参
    void show (int[] arr){

       arr =new int[2]; //加上该行代码后的执行结果 因为arr 在堆区新开了空间。指向不在和brr为同一内存地址
       arr[0] = 200;
       System.out.println("arr[0]="+arr[0]);//200       

    }

    public static void main (String[] args){
//a. 当基本数据类型的变量作为方法的参数传递时，形参变量的改变不会影响到实参；
         ArgumentTest at = new ArgumentTest();
         int num =10;
         at.show(num);
         System.out.println("num=" +num);  //打印结果为 10
      
       System.out.println("--------------------------------------");
//b.当引用数据类型的变量作为方法的参数传递时，形参变量的指向的内容发生改变后会影响到实参变量指向的内容；


        int[] brr =new int[]{10,20}; 
        at.show(brr);
        System.out.println("brr[0]="+brr[0]); // 打印结果为200  加上该行代码后的执行结果 为10 
    } 

   


}