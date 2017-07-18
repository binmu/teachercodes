
public class ArrayBase {
	//Array数组的重要性：
	//1.数组是集合的基础，集合是我们后期要重点的一个知识点
	//2.数组的形成以及后面的集合，是很多数据机构和数据库学习的原型
	//3.数组现在所学位置是在循环之后，和循环之间可以形成很多经典的算法，将是面试的高发地
	public static void main(String[] args) {
		//实例化一个数组，用来存放班级的成绩，选取5个成绩即可，成绩自己自定义，请算出最高分--最低分和平均分，并重新排序
		//程序不再是帮我们解决的问题的工具，而看上去本身就是个麻烦
		//能够将逻辑含义相近的一组数据进行串联统一处理，而不是一个一个的孤立开来考虑
		int scoreOne = 50;
		int scoreTwo = 51;
		int scoreThree = 52;
		int maxScore = scoreOne;
		if(maxScore < scoreTwo){
			maxScore = scoreTwo;
		}
		if(maxScore < scoreThree){
			maxScore =scoreThree;
		}
		//数组的出现：1.一组逻辑含义相似的数据，比如一组同班同学的数学成绩，比如说一个公司所有员工的姓名，比如说一个城市的程序员的工资
		//2.因为逻辑含义相似，导致数据类型一致
		//声明、使用、操作等比单个变量要方便的多，往往我们要操作的就是一组数据，而不是某一个数据
		//定义格式：DataType[] arrayName = new DataType[arrayLength];
		//在堆内存中开辟了相应数量以及相应数据类型的连续空间，并将空间首地址存储到一个别名为scores的栈内存空间去
		
		//定义基本数据类型的变量：DataType varName;
		//直接根据数据类型开辟数量为1的栈内存空间，并用value存储到相应栈内存空间后方可使用；
		//初始化格式：arrayName[index] = value;
		//arrayName[index]:拿着别名，找到栈内存空间中所对应的位置，取出其中的内容就是堆内存的首地址，然后根据数据类型、首地址以及下标，找到对应地 数据进行相应的操作和访问
		//静态初始化arrayName = {50,51,52};
		int[] scores = {50,51,52};
		int[] scoresCopy = {59,51,52};
		scoresCopy[1] = scores[1];    //数组元素之间相互赋值，仍然是值的复制
		scoresCopy=scores;            //数组之间相互赋值，就是数组所对应的堆内存的首地址的复制，合二为一
		
		scoresCopy=scores;
		scoresCopy[1] = 59;
		maxScore = scores[0];
		for(int count = 1;count < scores.length;count++){
			if(maxScore < scores[count]){
				maxScore = scores[count];
			}
			System.out.println(scores[count]);
		}
		scores = null;
		System.out.println(maxScore);
		//JVM是我们Java程序能够在所有的操作系统上的关键，同时他也管理着我们Java的垃圾回收、资源分配等多方面的事宜
		//栈内存和堆内存都属于JVM统一管理的
		//栈内存：负责的是基本数据类型(int float double boolean byte)的变量的声明和存储
		//处理空间的方式：就是出了变量的作用域，立刻清理
		//堆内存：负责的是对象类型(数组，除了基本数据类型之外的所有类型)的变量的声明和存储
		//处理空间的方式：哪怕对象已经失去了所有的引用，沦为了垃圾，也要等待GC（垃圾回收机制）不定期回收
	}

}
