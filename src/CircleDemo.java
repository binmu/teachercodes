//Java���ͺͱ���һ��������ܶ๤�ߺܶ���ܶ෽��������ʹ��
//�ܶ๤��Ӧ�������֯��10000������Ӧ�������֯�Ͱڷţ�package
//�ڲ���ϵͳ�У�10000���ļ�����ΰڷţ��ļ����ļ�������һ���ܺõİ���
import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ѭ�����﷨��ʽ֮һ��while
		//while(boolean���ʽ){
		// codes;
		//}
		//��12�д��뱻ִ���˶��ٴ� 11   ��13�д��뱻ִ���˶��ٴ� 10������-���ޡ�������ںž�Ҫ�Ӹ�1��
//		int count = 0;			//����һ��������������ʼֵ
//		while(count<10){        //ִ��ѭ�������ж������Ƿ�Ϊtrue�����Ϊtrue����ִ��ѭ���壬�����Ϊtrue��������ѭ��
//			System.out.println(count);//ѭ����ĺ��Ĺ������
//			count++;            //�ı��������ֵ���Ӷ��ﵽ�����ܹ�����ѭ����Ŀ��
//		}
		
		//���ڿ���̨�����·ݣ����ܻ�����ļ��ִ���:1.����ĸ����Ͳ������֣����ַ�������ô�����Ͳ�ƥ��
		//2.��������ֳ���int�����޺ͱ�ʾ��Χ���ͱ���
		//3.���������Ӧ������ʵ����ȷ��1-12��������������������
		//step1:input
		//��һ�δ�����Ҫ�ظ���ʱ��Ҫô��ѭ����ҪôҪ���¼ܹ���Ͷ���
		/*
		int inputCount=0;	
		int year = 2017;
		int month = 0;
		int monthDay = 31;
		boolean isRight = false;
		Scanner sc = new Scanner(System.in);
		
		while(!isRight && inputCount<3){
			inputCount++;
			System.out.println("������һ��1-12�����֣�������ʾ�·ݣ�");		
			month = sc.nextInt();
			//step2:check
			isRight = !(month < 1 || month > 12);
			if(isRight){
				System.out.println("��������·���ȫ��������");				
			}else{
				System.out.println(month);
			}
		}
		//step3���ó�����
		switch(month){
			case 4:
			case 6:
			case 9:
			case 11:
				monthDay = 30;
			case 2:
				if(year%400==0 || (year%4==0 && year%100!=0)){
					monthDay = 29;
				}else{
					monthDay = 28;
				}
		}
		//step4:output
		System.out.println("��������·�"+month+"�·���"+monthDay+"��");
		*/
		
		//�ۼӣ�1-100������
		//1+2+3+4+5+6+7+8+9+10
		//1.�����һ������
		//2.���1-100����������
		//3.�ۼ���Щ����
		/*
		int count = 1;
		int result = 0;
		if(count%2!=0){
			count++;	
		}
		while(count <= 100){
			result += count;						
			count+=2;			
		}
		System.out.println(result);
		*/
		//�ۼӣ�1-100������
		//1.�����һ������
		//2.���1-100����������
		//3.�ۼ���Щ����
		/*
		int number = 2;
		int iniCount = 2;
		int sumResult = 0;
		boolean isSu = true;
		while(number <= 100){
			while(iniCount<number&&isSu){
				isSu = isSu && number % iniCount != 0;	
				iniCount++;
			}
			if(isSu){
				System.out.println(number + "�Ǹ�����");
				sumResult = sumResult + number;
			}	
			iniCount = 2;
			isSu = true;
			number++;
		}
		System.out.println("����֮��Ϊ"+sumResult );
		*/
		//whileѭ�������ж���ѭ����ѭ�������ķ�Χ��0��N
		//dowhileѭ������ѭ�����жϣ�ѭ�������ķ�Χ��1��N
		/*
		int count = 0;			//����һ��������������ʼֵ
		do{        //ִ��ѭ�������ж������Ƿ�Ϊtrue�����Ϊtrue����ִ��ѭ���壬�����Ϊtrue��������ѭ��
			System.out.println(count);//ѭ����ĺ��Ĺ������
			count++;            //�ı��������ֵ���Ӷ��ﵽ�����ܹ�����ѭ����Ŀ��
		}while(count<10);
		*/
		//1243243243243......2
//		for(���ʽ1;���ʽ2;���ʽ3){
//			codes4;
//		}
		//forʲô�����Ըı䣬����ִ��˳�򲻻�ı�
		//forʲô������ʡ�ԣ����������ֺŲ���ʡ��
		//1.����һ��������������ʼֵ
		//2.ִ��ѭ�������ж������Ƿ�Ϊtrue�����Ϊtrue����ִ��ѭ���壬�����Ϊtrue��������ѭ��
		//4.ѭ����ĺ��Ĺ������
		//3.�ı��������ֵ���Ӷ��ﵽ�����ܹ�����ѭ����Ŀ��
//		for(int count = 0;count<10;count++){
//			System.out.println(count);
//		}
		
//		System.out.println("*****\n*****\n*****\n*****\n*****");
		
		int rowCount = 5;
//		for(int count = 0;count<rowCount*rowCount;count++){
//			System.out.print('*');
//			if(count%5==4){
//				System.out.println();
//			}
//		}
		//rowCount spaceCount starCount
		//   0        4           1
		//   1        3           3
		//   2        2           5
		//   3        1           7
		//   4        0           9
		//1.�ȿ���������֮��������ȹ�ϵ������  -1�������������1��   ���� 1
		//2.�Ҵ�1����С1��������ϵ��1  -1*rowCount             2 
		//3.���䳣�������ֵ5 1 -1    5-1-1*rowCount         2*rowCount+1
		
		for(int count = 0;count<rowCount;count++){
			for(int spaceCount = 0;spaceCount<4-count;spaceCount++){
				System.out.print(' ');
			}
			for(int colCount = 0;colCount<2*count+1;colCount++){
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
