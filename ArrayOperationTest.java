/*���ʵ���������ɾ�Ĳ�*/
public class ArrayOperationTest{


	   public static void main(String[] arge){

		//����һ������Ϊ5����Ϊint���͵�һά���飬��ӡ����Ԫ��ֵ��
			int [] fARR = new int[5];
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
		System.out.println("----------------------------------------------------------");	
			//ʹ��10 20 30 40�ֱ��������ǰ�ĸ�λ��Ԫ�ظ�ֵ����ӡ����Ԫ��
			fARR[0]=10;
			fARR[1]=20;
			fARR[2]=30;
			fARR[3]=40;
			
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
			System.out.println("----------------------------------------------------------");	
			// ������50���뵽�������±�Ϊ0��λ��ԭ��Ԫ������ƶ��ٴδ�ӡ
			
			for (int i=fARR.length; i>0; i--){
				
				if(i-1==0){
					 fARR[i-1]=50;
				}else{
					 fARR[i-1]=fARR[i-2];
				}
				
			}
			System.out.println("���������ӡ���");
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
		System.out.println("----------------------------------------------------------");		
			//������50��������ɾ��������Ԫ����ǰ�ƶ����ٴδ�ӡ����Ԫ��
			
			for (int i=0 ;i<fARR.length-1;i++){
				//if (i<4){
				fARR[i]=fARR[i+1];
				System.out.println(i);
				//}
		
			}
			fARR[4] =0;
			System.out.println("ɾ���������ӡ���");
			for (int i =0;i<fARR.length; i++){
				System.out.println(fARR[i]);
			}
			System.out.println("----------------------------------------------------------");	
			//�����������Ƿ����Ԫ��20����������Ԫ��20��Ϊ200���ڴδ�ӡ����
			
			for (int i=0;i<fARR.length; i++){
				
				if (20==fARR[i]){
					fARR[i]=200;
					
				}
				
			}
			
				System.out.println("�޸ĺ������ӡ���");
				for (int i =0;i<fARR.length; i++){
					System.out.print(fARR[i]+" ");
				}

	   }
   
}