import java.util.Scanner;

public class Exercise {
//	�����ʾ100�����ܱ�9������������֮�ͣ�Ҫ�����ַ�����
	public static void main(String[] args){
//		int number=1;
//		int sum=0;
//		No1 Method 2
//		boolean isRight = false;
//		for(number=1;number<=100;number+=isRight?9:1){
//			if(isRight || number%9==0){			
//				sum+=number;
//				isRight = true ;
//			}			
//		}
		//No2 Method 3
		/*int tempNum = 0;
		for(number=1;tempNum<=100;number++){
			tempNum = number * 9;		
			sum+=tempNum;
		}
		System.out.println(sum)*/;
//		��һ��������:2/1,3/2,5/3,8/5��..,��������20��֮��
//		double a=1;
//		double num=0;
//		double b=2;
////		double c=0;
//		int count=0;
//		for(count=0;count<20;count++){
//			num=b/a+num;
//			//a 1 b 2
//			b = a + b;	//a 1 b 3
//			a = b - a;  //a 2 b 3
////			c=b;
////			b=a+b;
////			a=c;
//		}
//		System.out.println(num);
		//�����λ��Ȼ���и�λ����֮��Ϊ6���Ҹ�λ���ֻ�����ͬ��������ͳ�Ƹ���
		//0123
		//3*3*2*1
//		int count = 0;
//		int gw = 0;
//		int sw = 0;
//		int bw = 0;
//		int qw = 0;
//		
//		for(int i=1000;i<6000;i++){
//			qw = i/1000;
//			bw = i%1000/100;
//			sw = i%100/10;
//			gw = i%10;
//			if(qw+bw+sw+gw!=6){
//				continue;
//			}
//			//&& || !
//			//��·�߼�������������ʽ����Ѷ�������治���м��㣬������&�����ӵı��ʽ�����&������Ѿ�false
//			//�����|�����ӵı��ʽ�����Ϊtrue
//			if((qw-bw) == 0 | (qw-sw) == 0 | (qw-gw)*(bw-sw)*(bw-gw)*(sw-gw)==0){
//				continue;
//			}
//			System.out.println("��λ����֮��Ϊ6���Ҹ�λ���ֻ�����ͬ����Ϊ��"+i);
//			count++;
//		}
//		System.out.println("����Ҫ�������"+count+"��");
		
		//��1�ǡ�2�ǡ�5�������1Ԫ���оٳ��������
//		int num=10;
//		int fiveCount=num/5; //2
//		int count = 0;
//		//2*5*10
//		for(int countFive=0;countFive<=fiveCount;countFive++){
//			for(int countTwo=0;countTwo<=(10-countFive*5)/2;countTwo++){				
//				if((countFive*5+countTwo*2)<=10){
//					count++;
//					System.out.println(count + ":" + (10-countFive*5-countTwo*2)+"��1�� + "+countTwo+"��2�� + "+countFive+"��5�� = 1Ԫ");
//				}				
//			}			
//		}
//		�������.ĳ��ѧ�����У�����������Լ��380~450��֮�䡣
//		���������ȫ�忼������ƽ����Ϊ76�֣�������ƽ����Ϊ75�֣�Ů����ƽ����Ϊ80.1�֣�
//		����Ů�����ж����ˣ�
//		int boy;
//		//75 76 80.1
//		//1*4.1   4.1*1
//		//5.1*80
//		//408
//		for(int all=380;all<=450;all++)
//		{
//			for(boy=1;boy<all;boy++)
//			{
//				if((boy*75+(all-boy)*80.1)==all*76){
//					System.out.println("������"+boy+"����"+"Ů����"+(all-boy)+"��");
//					return;
//				}					
//			}
//		}
		//7		
//		for(int a=-3;a<=3;a++){	
//			for(int b=0;b<Math.abs(a);b++){
//				System.out.print(" ");
//			}				   
//			for(int c=0;c<7-2*Math.abs(a);c++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//���������ӡ������Ч����Window7��ʾ��1900��1��1������һ
		//1.�����ж�����
		//2.�����ж�����
		//3.���µ�һ�������ڼ�
		//3.1.1900.1.1��һ
		//3.2.������������ж����죬Ȼ������ж����ܶ����죬���ڼ��������
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����������ѯ����ݣ�");
//		int year = 2017;//sc.nextInt();
//		System.out.println("�����������ѯ���·ݣ�");
//		int month = 7;//sc.nextInt();
//		int sumDays = 0;  //���ڴ��xxxx��xx��1�յ�������
//		//�������֮���������ࣺ1900.1.1-year.1.1
//		sumDays += (year-1900)*365;
//		for (int i = 1900; i < year; i=i+4) {
//			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
//				sumDays += 1;
//			} 
//		}
//		//�����·�֮���������ࣺyear.1.1-year.month.1
//		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			monthDays[1] += 1;
//		} 
//		for (int i = 0; i < month-1; i++) {
//			sumDays += monthDays[i];			
//		}			
//		sumDays += 1;
//		
//		//System.out.println(year+"��"+month+"��1�յ�������"+sum);
//
//		int wekDay = sumDays % 7; // ����year��month��1��Ϊ���ڼ�
//
//		System.out.println(year+"��  "+month+"��  1��  ����" + wekDay);
//
//		System.out.println("\t\t  "+year + "��" + month + "�µ��������£�");
//
//		System.out.println("��\tһ\t��\t��\t��\t��\t��\t");
//		int printDays = 0;
//		int dayCount = monthDays[month-1];			//���ڴ�ŵ���������
//		int prevDayCount = monthDays[(month-2+12)%12];	
//		
//		for (int i = prevDayCount-wekDay+1; i < prevDayCount+1; i++) {
//			System.out.print( i+"\t");
//			printDays++;
//		}
//
//		for (int i = 1; i <= dayCount; i++, wekDay++) {
//			System.out.print(i + "\t");
//			if ((wekDay + 1) % 7 == 0) {
//				System.out.println();
//			}
//			printDays++;
//		}
//		
//		for (int i = printDays; i%7!=0; i++) {
//			System.out.print((i-printDays+1) + "\t");
//		}
		
		//���ƴ����ǲ�����ĵ�һ��
		//д������������ɵ����һ�������۴�����
		//д���������˼����û�и��õķ������߸��õ�д������Ϊ������������ĸտ�ʼ
		//��Ƕȿ������⣬����ʹ�ø����֪ʶ���������
	}
}
