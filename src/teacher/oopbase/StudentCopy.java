package teacher.oopbase;


public class StudentCopy {
	//���캯���뷽��֮�������
	//1.���岻ͬ��
	//	A.���캯����������ȷ���ľ����������������������Լ��Զ����
	//  B.����ֵ���Ͳ�ͬ�������ķ���ֵ����Ҳ�ǿ����Զ���ģ����ǹ��캯��������û�з���ֵ��
	//     ��Ϊ���캯����Ŀ�ľ���Ϊ�˳�ʼ�������еĸ�������
	//2.���ò�ͬ��
	//     newһ�������Զ����ã���ͨ�������ö�����.�����������õ�
	//void iniStudentValue=StudentCopy
	//�ղŷ����ĵ����ǲ��Ǿ���newһ������֮��
	public StudentCopy(){
		this.name = "zhangsan";
		this.cardNo = "123456789";
	}
	public StudentCopy(String name,String cardNo){
		this.name = name;
		this.cardNo = cardNo;
	}
	
	public void iniStudentValue(String name,String cardNo){
		this.name = name;
		this.cardNo = cardNo;
	}
	public static  int studentCount;
	public String name;
	public int age;
	private String cardNo;
	public char sex;
	public String studentNo;
	//������װ���Ե����壺
	//1.�����ԵĶ�дȨ�޷���
	//2.������Ե�ҵ���߼�
	
	//cardNo���֤�ţ�һ��������֮�������ٱ仯
	//�����ǵ�һ������Ļ�������һ��Ҫ�ܹ����鿴���޸�����������ֿ��ſ���
	//�鿴�ķ����������÷���ֵ���ظ���磬���������в���
	public String getCardNo(){
		return this.cardNo;
	}
	//���õķ���
	//this�����this�Ǹ�����˭�������������˭����������������this
//	public void setCardNo(String cardNo){
//		this.cardNo = cardNo;
//	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		if(age<18){
			System.out.println("��Ͳ��ܹ�С�����볬��18��");
			return;
		}
		this.age = age;
	}
	
	public String displayStu(){
		String name = this.name;
		for(int count=0;count<5;count++){
			System.out.println(count);
		}
		return name;
	}
}

