
public class Option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ�����ʽ�ĳƺ����ɱ��ʽ����ĵ��Ǹ����������������������������
		boolean flagLarge = 150>100;
		//flagLarge = 150>100��ֵ���ʽ
		//150>100�������ʽ
		
		int age = 38;
		//��++���ڲ������ĺ��棬��ô���൱���¾仰�ټ�
		//��++���ڲ�������ǰ�棬��ô���൱���ȼ����������κβ���
		int anotherAge = flagLarge ? 60 : age++;
		System.out.println(anotherAge);
		System.out.println(age);
		//����������ά�Ȳ�ͬ����ɲ�ͬ�ĳƺ�
		//���� �������ƺ����������ֵ�������������������߼�������������������
		//����Ҫ�Ĳ��������ƺ�����������󲿷�������˫Ŀ�������Ҳ����˵�����������������ң����ǻ���һЩ�����
		//��Ŀ��++��--��!������Ŀ��?:��
		int score = 520;
		age = 12;
		String hometown = "JS";
		//�����������500������Ҫ����18����ʡ��ѧ����������ν
		boolean isCollege = score > 500 && (age > 18 || hometown == "JS");
		System.out.println(isCollege);
		
		//1.()
		//2.++ -- !
		//3.+-*/%
		//4.><==!=>=<=
		//5.&& ||
		//6.= ?:
		
	}

}
