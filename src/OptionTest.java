
public class OptionTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//���������
		int numOne = 15;
		int numTwo = 10;
		double numThree = 15.0;
		double numFour = 10.0;
		System.out.println("numOne + numTwo =" + (numOne+numTwo));
		System.out.println("numOne - numTwo =" + (numOne-numTwo));
		System.out.println("numOne * numTwo =" + (numOne*numTwo));
		//numOne/numTwo:��������ͬһ����������������������࣬��ô�õ��Ľ��Ҳ��ԭ��������������	
		//�����ᷢ�����������Զ�ת��
		//ͬʱ��Ҫ��ʵ�ʿ�������������ʹ����������ȼ���ߵ�()������������Ч�ʣ����;�������
		System.out.println("numOne / numTwo =" + (numThree/numTwo));
		System.out.println("numOne % numTwo =" + (numOne%numTwo));
		//���ϸ�ֵ�����
		numTwo -= numOne;  //numTwo = numTwo - numOne;
		System.out.println("numTwo - numOne =" + numTwo);
		
		//Question1:�����������֣��ֱ�ΪnumOne��numTwo���뽫��������������ӡ
		/*
		int middleNum = numOne;
		numOne = numTwo;
		numTwo = middleNum;
		System.out.println("numOne =" + numOne);
		System.out.println("numTwo =" + numTwo);
		*/
		//Question2:�����������֣��ֱ�ΪnumOne��numTwo���뽫��������������ӡ(������ʹ�õ���������,�Ϻ�Ⱥ˶)
		/*
		numOne = numOne + numTwo;
		numTwo = numOne - numTwo;
		numOne = numOne - numTwo;
		System.out.println("numOne =" + numOne);
		System.out.println("numTwo =" + numTwo);
		*/
		
		//��ϵ����������ص���boolean�� > <  == != >= <=
		//�׶�԰��ѧ������1.����סС���������ǡ�abc��2.�����ѧ���������5��
		boolean flagArea = "abc" == "abc";
		boolean flagAge = 5 == 5;
		System.out.println("�Ƿ������ѧ���׶�԰ =" + (flagArea && flagAge));
		
		
	}

}
