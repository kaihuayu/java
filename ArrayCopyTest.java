/*���ʵ�ֿ���*/

public class ArrayCopyTest{

	public static void main(String[] agrs){

          //����һ����ʼֵΪ 11 22 33 44 55��һά����
		int [] arr ={11,22,33,44,55};

	   //��ӡ����Ԫ��
		
             for (int i=0; i<arr.length;i++){

              System.out.print(arr[i] +" ");
	    }
          //����һ������Ϊ3��Ԫ������Ϊint���͵�����
	System.out.println();
             int [] brr = new int[3];
          
	   //��ӡ����Ԫ��
		
             for (int i=0; i<brr.length;i++){

              System.out.print(brr[i] +" ");
	    }	
		
		System.out.println();
		System.out.println("------------------------------------------------");
	//����һ�������м�3��Ԫ�ظ�ֵ���ڶ�������
       // brr[0] =arr[1];brr[1] =arr[2];brr[2] =arr[3];
		System.arraycopy(arr,1,brr,0,3); //���������±��1��ʼ��3��Ԫ�ؿ���������BRR���±�0��ʼ
		
          for (int i=0;i<arr.length;i++){
           	if(i<3){
				brr[i]=arr[i+1];
                  }
			
			}
			 //��ӡ����Ԫ��
		
             for (int i=0; i<brr.length;i++){

              System.out.print(brr[i] +" ");
	
		
			 }		
		//���ͳ���û���������һ����������ÿ�����ֳ��ֵĴ���ͳ�Ʋ���ӡ
		
		
		
     }
}