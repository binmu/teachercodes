
public class JudgeStrut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������䣺
		//1.˳�򣺰���д˳��ִ����Ӧ����
		//2.�жϷ�֧�������жϾ����Ƿ�ִ����Ӧ����
		//3.ѭ���������жϾ���ִ�ж��ٴ���Ӧ����
		//��򵥵��жϷ�֧A
		//if(���ʽB���ܹ�����boolean���κ���ʽ�ĳ����������ʽ��){
		//	codes;
		//}
		/*
		int height = 177;
		if(height >= 175){
			System.out.println("ԭ���Һ͸߸�˧����մ�ߵ�");
		}
		*/
		//�жϷ�֧B
		//if(���ʽB���ܹ�����boolean���κ���ʽ�ĳ����������ʽ��){
		//	codesA;
		//}else{
		//	codesB;
		//}
		
		/*
		int height = 173;
		int weight = 180;
		if(height >= 175){
			System.out.println("ԭ���Һ͸߸�˧����մ�ߵ�");
		}else{
			System.out.println("��Ҳ�������ǵĴ�");
		}
		*/
		//����߸���175��ԭ���Һ͸߸�˧����մ�ߵ�
		//����ߵ���175���Ϳ�������أ����ش���180���������أ�����С��180�����ں�ë
		//�жϷ�֧B
		//if(���ʽB���ܹ�����boolean���κ���ʽ�ĳ����������ʽ��){
		//	codesA;
		//}else{
		//	codesB;
		//}
		/*
		int height = 173;
		int weight = 200;
		if(height >= 175){
			System.out.println("ԭ���Һ͸߸�˧����մ�ߵ�");
		}else{
			if(weight>180){
				System.out.println("�Ҿ������أ����ݺ���");
			}else{
				System.out.println("�����ں�ë��Ǳ���޴�");
			}
		}
		*/
		//�߼�������
		/*
		int height = 173;
		int weight = 150;
		if(height >= 175){
			System.out.println("ԭ���Һ͸߸�˧����մ�ߵ�");
		}else if(weight>180){
			System.out.println("�Ҿ������أ����ݺ���");
		}else{
			System.out.println("�����ں�ë��Ǳ���޴�");
		}
		*/
		/*
		int height = 173;
		int weight = 150;
		if(height >= 175){
			System.out.println("ԭ���Һ͸߸�˧����մ�ߵ�");
		}
		if(height < 175 && weight>180){
			System.out.println("�Ҿ������أ����ݺ���");
		}
		if(!(height < 175 && weight>180)){{
			System.out.println("�����ں�ë��Ǳ���޴�");
		}
		*/
		//��Χ�ж� > < >= <=
		//��ֵ�ж�==ABCD
		char scoreClass = 'F';
		/*
		if(scoreClass == 'A'){
			System.out.println("�ᵱ�������һ����ɽС");
		}else if(scoreClass == 'B'){
			System.out.println("�Ͽ�����������죬��ҵҲ��ô����");
		}else if(scoreClass == 'C'){
			System.out.println("�����Ӳ���Ӳ������ҵ�ܲ����������Ҿ��޷�������");
		}else if(scoreClass == 'D'){
			System.out.println("����ô������");
		}
		*/
		switch(scoreClass){
		case 'A':
			System.out.println("�ᵱ�������һ����ɽС");
			break;
		case 'B':
			System.out.println("�Ͽ�����������죬��ҵҲ��ô����");
			break;
		case 'C':
			System.out.println("�����Ӳ���Ӳ������ҵ�ܲ����������Ҿ��޷�������");
			break;
		case 'D':
			System.out.println("����ô������");
			break;
		default:
			System.out.println("�Ҿ�Ȼû�гɼ���ʲô���");
			break;
		}
	}

}
