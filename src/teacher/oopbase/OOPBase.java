package teacher.oopbase;

//�������˼ά����Ҫ�ԣ�
//1.���������һ����Ŀ����ͼܹ�ʦ������������ߺ��Ļ��߹Ǹɵĳ���Ա�ı�־�Բ��
//2.�������������������߿������տ�ܵĹؼ�
//3.�������Ҳ���ִ���ҵ���������ɱ���Ҫ���յ�˼�룬Ҳ������

//�������Ϊ�������ѧ��
//1.�����������������Ը���ҵ��ҵ������������޵Ļ���������󻹲��������������ˬ
//2.����ǳ����󣬳���˼ά���������Ͳ�����

//3w1h:how why when where
//ѧϰ�׶�:
//1.��ȫ������
//2.һ֪��⣬��Щģ��
//3.����������������ҵδ�ػ���
//4.��ҵҲ���������������Ҳ��ὲ��
//5.��Ϊ�Լ�����
//6.����
//5.6.����ѭ����ˮƽҲ����ѭ���Ĵ���Ҳ�ڲ�������

//����ĺ�������OOP����Ҫ��ԶԶ���ڴ������ȷ��
//������̱����ʵ���������ı�̣�֮ǰ���ǵĲ���
//�����������ʵ���������ĳ��Ź��̵ı�̣�������ʱ�����ǽ����ֻ���Ǻ����ԣ�������Ҫ���ǵķ��ࡢ���ԡ�������֮��Ķ���
public class OOPBase {
	public static void main(String[] args) {		
		//��ӡͼ�񣺹�����-��̬��Math		
		//������̣����ǿ���ͼ��Ĺ����ԣ�Ȼ���ô���չʾ������ɣ�����ʵ�ֹ���
		//������󣺾��ǿ���ͼ�εı��ʣ���ӡ�ַ����к��У�ʵ�ֱ����ԵĹ��ܣ�����ͨ�����ú��������ͼ�δ�ӡ����
		//ģ�����и��ֿ��İ���ͽ��ˣ�
		//������̣�����һ���˵��������û������룬���в�ͬ����Ӧ������ѡ��ҵ��Ĳ�ͬ��ȥ�߲�ͬ�����̣���ATM��ҵ��ִ�й���һ��
		//������󣺻����ȿ�����ʵ��������Ҫʵ��Ӧ�þ߱������Ժ͹��ܣ�
//		OOPBase.print();
		//���ʵ����
		//int number = 3;
		//int[] numbers= new int[3];
		//�û�����������������һ������
		//��һ����������һ������
		
//		Print testP = new Print();
//		Math.abs(0.0);
//		String s= new String();
//		testP.printSimpleStar();
//		Print.printString(5, 'A');
		Picture tempPic = new Picture();
		tempPic.line = 5;
		tempPic.name = "������";
		System.out.println(tempPic.printAllString(tempPic.line, '*'));
	}
	
	public static void print(){
		int count = 5;
		for(int line = 0;line<5;line++){
//			for(int spaceCount = 5-line-1;spaceCount>0;spaceCount--){
//				System.out.print(" ");
//			}
			Print.printString(5-line-1,' ');
			Print.printString(2*line+1,'*');
//			Print.printSpace(5-line-1);
////			for(int starCount = 0;starCount<2*line+1;starCount++){
////				System.out.print("*");
////			}
//			Print.printStar(2*line+1);
			System.out.println("");
		}
	}
}

