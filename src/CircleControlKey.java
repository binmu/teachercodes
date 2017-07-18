
public class CircleControlKey {

	public static void main(String[] args) {
		//break     打破，一般都是放在循环中，那么break循环终止执行，直接执行该循环后的其他代码
		//continue  继续，一般都是放在循环中，那么这一次循环终止执行，直接进入到判断部分，后面就正常判断正常执行
		//return    返回，方法，作用就是结束程序
		//System.out.println("循环开始");
		for(int count = 0; count < 10; count++){
			if(count == 5){
				//return;
			}
			//System.out.println(count);			
		}
		//System.out.println("循环结束");
		
		//ifelse和switch结构的时候说了适用场景：ifelse范围选择switch点值判断
		//for适合有限的次数循环，while适合无限的次数循环，dowhile适合起码执行一次的循环
		//排序、查找、删除等算法随之而来，这些算法都很重要的，第一就是无论是面试和笔试，这都是重要的高频发生的事情
		//第二，在这里找了这些算法，有利于我们对于未来数据库和软件开发的一些理解
		//数组：why存在
		// 起名字：统一叫一个名字，然后用下标来区分
		// 遍历和操作非常方便，有利于我们进行各种操作
		//PS:1.逻辑含义不相同2.数据类型不相同
		//小区一栋楼房：好看的房子，从0号开始编排，到长度-1结束
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
