/* �������� �� ��ӡ */

public class ArrayTest {

    public static void main(String[] arge){
        //��̬��ʽ
        int[] arr = new int[3];
        arr[0]= 1;
        arr[1]=2;
        arr[2]=3;
        System.out.println("����ĳ����ǣ�" +arr.length);
        //System.out.println("�±�Ϊ0��Ԫ��" + arr[0]);
        //System.out.println("�±�Ϊ1��Ԫ��" + arr[1]);
        //System.out.println("�±�Ϊ2��Ԫ��" + arr[2]);
   //����oK ���в���ArrayIndexOutOfBoundsException�����±�Խ���쳣
        System.out.println("--------------------------");
        for(int i= 0; i<arr.length;  i++){
           System.out.println("�±�Ϊ"+i+"��Ԫ��" + arr[i]);

        }
        System.out.println("--------------------------");
        double[] dArr = new double[5];
        for(int i= 0; i<dArr.length;  i++){
           System.out.println("�±�Ϊ"+i+"��Ԫ��" + dArr[i]);

        }
        System.out.println("--------------���鸳ֵ------------");
        arr[0]= 11;
        arr[1]=22;
        arr[2]=33;
        for(int i= 0; i<arr.length;  i++){
           System.out.println("�±�Ϊ"+i+"��Ԫ��" + arr[i]);

        }
        //��ֵ��û�����Ƚо�̬��ʽ�������Ȳ���ֵ�Ķ�̬��ʽ
        System.out.println("--------------��������ͬʱ������Ԫ�س�ʼ����̬��ʽ------------");
        int[] iArr = {10,55,33,66,88,99};
        System.out.println("����ĳ���"+iArr.length);
        for(int i= 0; i<iArr.length;  i++){
           System.out.println("�±�Ϊ"+i+"��Ԫ��" + iArr[i]);

        }
        System.out.println("--------------���ӷ�ʽ------------");
        int[] tArr = new int[]{1,2,3,4,5,6};
        for(int i= 0; i<tArr.length;  i++){
           System.out.println("�±�Ϊ"+i+"��Ԫ��" + tArr[i]);

        }
		//����һ������Ϊ5����Ϊint���͵�һά���飬��ӡ����Ԫ��ֵ��
		int [] fARR = new int[5];
		for (int i =0;i<fARR.length; i++){
			System.out.println(fARR[i]);
		}
		
		//ʹ��10 20 30 40�ֱ��������ǰ�ĸ�λ��Ԫ�ظ�ֵ����ӡ����Ԫ��
		fARR[0]=10;
		fARR[1]=20;
		fARR[2]=30;
		fARR[3]=40;
		
		for (int i =0;i<fARR.length; i++){
			System.out.println(fARR[i]);
		}
		// ������50���뵽�������±�Ϊ0��λ��ԭ��Ԫ������ƶ��ٴδ�ӡ
		
		//������50��������ɾ��������Ԫ����ǰ�ƶ����ٴδ�ӡ����Ԫ��
		//�����������Ƿ����Ԫ��20����������Ԫ��20��Ϊ200���ڴδ�ӡ����
    }

}