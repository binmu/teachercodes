import java.util.Scanner;

public class ArrayAdvance {

	public static void main(String[] args) {
//		int studentCount=5;
//		int[] scores =new int[studentCount];
//		//int��������������Ĭ��ֵΪ0
//		//�������;�û��Ĭ��ֵ
//		scores[0] = 95;
//		scores[2] = 89;
//		Scanner scan = new Scanner(System.in);
////		for(int count = 0;count<scores.length;count++){
////			System.out.println("�������"+(count+1)+"��ѧ���ĳɼ�");
////			scores[count] = scan.nextInt();
////		}
//		
//		for(int count = 0;count<scores.length;count++){
//			System.out.println(scores[count]);
//		}		
		//NullPointException:��ָ�����õ���������ڣ�ĳ������Ԫ��û�н�����Ӧ�ĳ�ʼ��
		//ArrayIndexOutOfBoundsException:�����±곬���߽��쳣,�±�Ϊ������������ĳ��ȶ���ΪԽ��
		//System.out.println(scores[5]);
		
		//��������м������͵Ĳ����������ӡ��޸ġ�ɾ�������ҡ�����
		//����������������������
		int[] prices = new int[5];
		prices[0] = 2;
		prices[1] = 3500;
		prices[2] = 10;
		prices[3] = 80;
		prices[4] = 500;
		//����ð�ݡ����롢���֡�ѡ��	
		//50:������ı����������淶�����Ժܶ��������ϸ��
		//60:���������ĿҪ��д����Ӧ����û������Ҳû��ʧ��
		//80:�����㣬�һ�����һ��
		//100:�Ƚ��������򷽷��������ƣ�����ռ������ʡ�Ч�ʡ�������ʲô�����������������ݸ��ʺϡ��ȶ���
		//120:Array.sort()Java��������
		//�����Լ������ԡ����ԣ�10 10��offer 8000 30% 1��offer
		//    A�ó��㡢B�����㡢C����/֪ʶ��
		//10:3 1.2
		//80:120 �������ӵ��A��ͬʱ��������ӵ��A
		//�Ӻ���ǰС������ð��ÿ�����򶼽�δ���򲻷ֵĵ�һС�������ŵ���ǰ��
		/*
		for(int sortCount = 0; sortCount <4;sortCount++){
			//0 1 2 3 4:4 3 2 1 0
			for(int comCount = prices.length-1; comCount >sortCount;comCount--){
				if(prices[comCount] < prices[comCount-1]){
					prices[comCount] = prices[comCount] + prices[comCount-1];
					prices[comCount-1] = prices[comCount] - prices[comCount-1];
					prices[comCount] = prices[comCount] - prices[comCount-1];
				}
			}
		}
		for(int count = 0; count <prices.length;count++){
			System.out.println(prices[count]);
		}*/
//		�������򣺼���һ������Ԫ���Ѿ�������ˣ���ô��δ����ĵ�һ��Ԫ�ز��뵽�����򲿷ֵ���ȷλ�ü���
		for(int sortCount = 0; sortCount <prices.length-1;sortCount++){
			//2 3500 10 80 500
			//2���������򲻷֣�3500��δ���򲿷ֵĵ�һ��Ԫ��
			//2 3500 10 80 500
			//2 3500���������򲻷�,10��δ���򲿷ֵĵ�һ��Ԫ��
			//2 10 3500 80 500
			for(int comCount = sortCount+1; comCount >0;comCount--){
				if(prices[comCount] < prices[comCount-1]){
					prices[comCount] = prices[comCount] + prices[comCount-1];
					prices[comCount-1] = prices[comCount] - prices[comCount-1];
					prices[comCount] = prices[comCount] - prices[comCount-1];
				}
			}	
		}
		for(int count = 0; count <prices.length;count++){
			System.out.println(prices[count]);
		}
	}
}
