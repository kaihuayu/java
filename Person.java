/*
ʵ��Person��Ķ����ʹ��
*/
public class Person {
	
	String name; //�������������ĳ�Ա����
	int age; //�������������ĳ�Ա����
	

        //�Զ����Ա������ӡ������������ֵ
       
       void show(){
          // ��Ա����������ֱ�ӷ��ʳ�Ա����
           System.out.println("����" +name + "����" +age);  
        } 

        //�Զ����Ա����ʵ����������һ�����Ϊ
        void grow(){
           age ++;

         }
        //�Զ����Ա����ʵ��������������ָ����ֵ����Ϊ
        void grow(int i){

           age += i;
        } 

 
       //�Զ����޲ι��췽��
       Person(){

       }
        
        //�Զ��幹�췽�� �вι��췽��
        Person(String n,int i){
           // System.out.println("���ǹ��췽����");   
		name=n;
                age =i;    
        }      


       //�Զ����Ա����ʵ�ֽ���Ա����name�޸�Ϊָ������ֵ

       void setName(String n){
            name=n;

        }   
        //�Զ����Ա����ʵ�ֽ���Ա����age�޸�Ϊָ������ֵ����Ϊ

        void setAge(int s){

            age =s;        
         }

	public static void main(String[] args){
		
		// ����Pesron���͵Ķ���
		Person n= new Person();
		n.name ="����";
		n.age =11;
		//System.out.println("����" +n.name + "����" +n.age);
                //���÷����ı��ʾ��Ǹ��ݷ�������ת��ȥִ����Ϻ�����ת������
		n.show();
		
	System.out.println("------------------------------------");
     //���ó�Ա�����޸�����������
       n.setName("zzzzzzzz");
       n.setAge(20);	
	n.show();

            Person n2 = new Person("����",22);
   	System.out.println("����" +n2.name + "����" +n2.age);

        //���÷�������
           n2.grow();
           n2.show();   //���� ��һ��
           n2.grow(10);   
           n2.show();   //������10�� 
 
	}
	
}