//���� �� WelcomeJava
public class WelcomeJava {
	//��ʽ�����ݶ��ǹ̶��ģ�main����Ϊ������Ŀ��Ψһ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���м�����Ĵ洢�����Զ���������Ϊ����������㵥λ��������2Ϊ��������������Ч�ʸ���
		//�������Ǿͻῴ�����������������㣬�󲿷�Ĭ��ֵ������2�ı�������Ϊ��׼
		//byte   1   
		//short  2
		//int    4
		//long   8
		//float  4
		//double 8
		//�������͵������ͳ�ʼ���������ʽ
		//method 1:Datatype varName = iniValue;
		//method 2:Datatype varName;��������������������,���ڴ��п�����һ�οռ䣬���Ҹ��ռ���׵�ַ����
		// varName = iniValue;����ʼֵ������Ӧ�ռ丳ֵ
		//0X 846F�������൱�ڸ��ڴ��ַ�����
		//'\t'��ʹ��ǰ����ַ���ռ�ݹ̶�����8��������
		//�������ɿ������ĵ���ע�ͣ�����ͨ��Javadoc������ĵ�ע�͵��뵽�������ĵ���ȥ
		/**
		 * �ؼ��֣�Java�涨�����ض���;�����֣�����˵int����ɫ
		 * ��ʶ�����Զ���ı�ʾһ����������֣�����˼�壬����Ϸ�
		 * ����˼��:�������־�֪�����壬Ҳ����˵����age��֪�������
		 * ����Ϸ�������Լ���׳ɵ�һЩ�涨�͸�ʽ��ͬʱ�������﷨
		 * ��ɲ��֣�Ӣ����ĸ��a-z A-Z�� ���֣�0-9�� �»��ߣ�_�� �����ַ���$��
		 */
		//���кͶ���ע�ͣ��ڱ�����̶����ᱻ�Զ����ԣ��ڿ���������һ����ʾ���ã�����˵һ�θ��Ӵ����˼·��һ���ؼ��Ա����ĺ��塢һ����־λ����ת��һ�������Ŀ�ʼ��һ���жϷ�֧
		// specChar WelcomeJava		
		//������
		//char specChar = '\t';
		//Ŀǰ�����������򣺴������ĵط����÷����Ĵ����ŵĽ�β��
		//�������ڣ���������ʱ�䵽����ִ�н�����ʱ��
		//������ָ�ı��������Ǿֲ�����
		//the local variable
		char sex = 'M';		
		int age = 38 ;		
		double salaryMin = 5000.00;
		
		//System.out.println(age);
		System.out.println(sex);
		System.out.println("abcdefghijk");
		System.out.println(1+salaryMin+2);
		//��������أ���+�����߶����ӵ�����ֵ���͵ı������߳����Ļ�����ô������ֵ��ӣ���������һ�����ַ�����ô��������
		
		{
			//���������򣺴������ĵط�������Ľ�β��
			//�������ڣ���������ʱ�䵽����ִ�н�����ʱ��
			//������ָ�ı��������Ƿ�Χ��С�ľֲ�����
			int increaseAge = 3;
			System.out.println(increaseAge);
		}
		
		//boolean�����ͣ����أ�Ҫô��Ҫô�أ��Ǵ˼��ˣ�������õĶ����ơ������м�������ܶ�Ԫ������ϲ����ѡ���أ�������С����㣩
		//��true ��false
		boolean isCollege = true;   //�Ƿ��Ǵ�ѧ��ҵ
		//boolean flag....
		//!ȡ�����Ǵ˼��ˡ�����isCollege��true���������Ľ������false
		//����isCollege��false���������Ľ������true
		System.out.println("�Ƿ��ѧ�ˣ�"+!isCollege);
		//&&�룬�ң� 
		//��������Ϊ�棬��Ϊ�棬ֻҪһ��Ϊ�٣��Ͷ�Ϊ��
		//Abool && Bbool    result
		//true  && true     true
		//true  && false     false
		//false  && true     false
		//false  && false     false
		//||��
		//ֻҪһ��Ϊ�棬�Ͷ�Ϊ�棬��������Ϊ�٣���Ϊ��
		//Abool || Bbool    result
		//true  || true     true
		//true  ||false     true
		//false  || true     true
		//false  || false     false
		
		boolean flagOne = true;
		boolean flagTwo = false;
		System.out.println(flagOne||flagTwo);
		

	}

}
