import java.util.Scanner;

public class ArrayAdvance {

	public static void main(String[] args) {
//		int studentCount=5;
//		int[] scores =new int[studentCount];
//		//int基本数据类型有默认值为0
//		//对象类型就没有默认值
//		scores[0] = 95;
//		scores[2] = 89;
//		Scanner scan = new Scanner(System.in);
////		for(int count = 0;count<scores.length;count++){
////			System.out.println("请输入第"+(count+1)+"个学生的成绩");
////			scores[count] = scan.nextInt();
////		}
//		
//		for(int count = 0;count<scores.length;count++){
//			System.out.println(scores[count]);
//		}		
		//NullPointException:空指针引用的问题就在于，某个数组元素没有进行相应的初始化
		//ArrayIndexOutOfBoundsException:数组下标超出边界异常,下标为负数或者数组的长度都视为越界
		//System.out.println(scores[5]);
		
		//针对数组有几种类型的操作：有增加、修改、删除、查找、排序
		//主键、索引、建立服务器
		int[] prices = new int[5];
		prices[0] = 2;
		prices[1] = 3500;
		prices[2] = 10;
		prices[3] = 80;
		prices[4] = 500;
		//排序：冒泡、插入、二分、选择	
		//50:最基本的变量命名不规范，忽略很多最基础的细节
		//60:按照你的题目要求写出相应程序，没有亮点也没有失误
		//80:有亮点，我会另外一种
		//100:比较两种排序方法的优劣势，比如空间利用率、效率、比如在什么类型数据下哪种数据更适合、稳定性
		//120:Array.sort()Java类库的排序
		//如何面对技术面试、笔试：10 10个offer 8000 30% 1个offer
		//    A擅长点、B正常点、C冷门/知识点
		//10:3 1.2
		//80:120 尽量多的拥有A，同时尽量的深拥有A
		//从后往前小的往上冒，每次排序都将未排序不分的第一小的数字排到最前面
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
//		插入排序：假设一个数组元素已经排序号了，那么将未排序的第一个元素插入到已排序部分的正确位置即可
		for(int sortCount = 0; sortCount <prices.length-1;sortCount++){
			//2 3500 10 80 500
			//2就是已排序不分，3500是未排序部分的第一个元素
			//2 3500 10 80 500
			//2 3500就是已排序不分,10是未排序部分的第一个元素
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
