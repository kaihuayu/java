/*��ά����*/
public  class ArryArryTest{
	
	
	public static void main(String[] args){
		//����һ������2��3��Ԫ������ΪINT���͵Ķ�ά���� 
		int[][] arr = new int[2][3];
		//��ӡ��������Ԫ��
		//ʹ�����forѭ�����ڿ��ƴ�ӡ������
		for (int i=0;i<arr.length;i++){
			//ʹ���ڲ�FORѭ���ÿ��ƴ�ӡ������
			for(int j= 0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "");
			}
			System.out.println(); //��һ�н�������
			
		}
		
		System.out.println("-------------------------");
		//��ά������Ԫ�صĳ�ʼ���ʹ�ӡ
		int[][] brr ={{1,2,3},{4,5,6,}};
		//��ӡ
		
		for (int i=0;i<brr.length;i++){
			//ʹ���ڲ�FORѭ���ÿ��ƴ�ӡ������
			for(int j= 0; j<brr[i].length; j++){
				System.out.print(brr[i][j] + "");
			}
			System.out.println(); //��һ�н�������
			
		}
		
		System.out.println("-------------------------");
		//��ά����������÷�
		int[][] crr = new int[3][]; //�в��̶�
		crr[0] =new int[3];  //��һ�� ��3��
		crr[1] =new int[4];  //�ڶ��� ��4��
		crr[2] =new int[5];  //��s���� ��5��
		
		for (int i=0;i<crr.length;i++){
			//ʹ���ڲ�FORѭ���ÿ��ƴ�ӡ������
			for(int j= 0; j<crr[i].length; j++){
				System.out.print(crr[i][j] + "");
			}
			System.out.println(); //��һ�н�������
			
		}
	}
	
	
	
}