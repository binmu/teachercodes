
public class CircleControlKey {

	public static void main(String[] args) {
		//break     ���ƣ�һ�㶼�Ƿ���ѭ���У���ôbreakѭ����ִֹ�У�ֱ��ִ�и�ѭ�������������
		//continue  ������һ�㶼�Ƿ���ѭ���У���ô��һ��ѭ����ִֹ�У�ֱ�ӽ��뵽�жϲ��֣�����������ж�����ִ��
		//return    ���أ����������þ��ǽ�������
		//System.out.println("ѭ����ʼ");
		for(int count = 0; count < 10; count++){
			if(count == 5){
				//return;
			}
			//System.out.println(count);			
		}
		//System.out.println("ѭ������");
		
		//ifelse��switch�ṹ��ʱ��˵�����ó�����ifelse��Χѡ��switch��ֵ�ж�
		//for�ʺ����޵Ĵ���ѭ����while�ʺ����޵Ĵ���ѭ����dowhile�ʺ�����ִ��һ�ε�ѭ��
		//���򡢲��ҡ�ɾ�����㷨��֮��������Щ�㷨������Ҫ�ģ���һ�������������Ժͱ��ԣ��ⶼ����Ҫ�ĸ�Ƶ����������
		//�ڶ���������������Щ�㷨�����������Ƕ���δ�����ݿ�����������һЩ���
		//���飺why����
		// �����֣�ͳһ��һ�����֣�Ȼ�����±�������
		// �����Ͳ����ǳ����㣬���������ǽ��и��ֲ���
		//PS:1.�߼����岻��ͬ2.�������Ͳ���ͬ
		//С��һ��¥�����ÿ��ķ��ӣ���0�ſ�ʼ���ţ�������-1����
		int score = 60;
		
		int[] scores = {45,40,60,60,95};
		int searchNumber = 60;
		int findCount = 0;
		for(int count = 0;count<5-findCount;count++){
			if(scores[count] == searchNumber){
				findCount++;
				System.out.println(scores[count]+";"+count);
				for(int moveCount = 0;moveCount<5-1-count;moveCount++){
					scores[count+moveCount] = scores[count+moveCount] + scores[count+moveCount+1];
					scores[count+moveCount+1] = scores[count+moveCount] - scores[count+moveCount+1];
					scores[count+moveCount] = scores[count+moveCount] - scores[count+moveCount+1];
				}
				count--;
			}			
		}
		for(int count = 0;count<5;count++){
			System.out.println(scores[count]);
		}
	}
}
