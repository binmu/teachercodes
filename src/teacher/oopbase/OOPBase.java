package teacher.oopbase;

//面向对象思维的重要性：
//1.面向对象是一个项目经理和架构师区别与优秀或者核心或者骨干的程序员的标志性差别
//2.面向对象真正深刻理解或者快速掌握框架的关键
//3.面向对象也是现代商业开发所不可避免要掌握的思想，也是主流

//面向对象为何如此难学：
//1.面向对象优势在于面对复杂业务，业务能力理解有限的话，面向对象还不如面向过程来的爽
//2.本身非常抽象，抽象思维能力本来就不容易

//3w1h:how why when where
//学习阶段:
//1.完全听不懂
//2.一知半解，有些模糊
//3.基本听懂，但是作业未必会做
//4.作业也基本会做，但是我不会讲解
//5.以为自己懂了
//6.不懂
//5.6.不断循环，水平也随着循环的次数也在不断提升

//代码的合理性在OOP的重要性远远大于代码的正确性
//面向过程编程其实是面向结果的编程，之前考虑的步骤
//面向对象编程其实才是真正的冲着过程的编程，根本暂时不考虑结果，只考虑合理性，现在主要考虑的分类、属性、方法这之类的东西
public class OOPBase {
	public static void main(String[] args) {		
		//打印图像：工具类-静态类Math		
		//面向过程：就是考虑图像的规律性，然后用代码展示这个规律，最终实现功能
		//面向对象：就是考虑图形的本质，打印字符、行和列，实现本质性的功能，最终通过调用合理化的类把图形打印出来
		//模拟银行各种卡的办理和结账：
		//面向过程：先做一个菜单，根据用户的输入，进行不同的响应，根据选择业务的不同，去走不同的流程，像ATM的业务执行过程一样
		//面向对象：会优先考虑现实世界中重要实体应该具备的属性和功能，
//		OOPBase.print();
		//类的实例化
		//int number = 3;
		//int[] numbers= new int[3];
		//用基本数据类型来定义一个变量
		//用一个类来定义一个对象
		
//		Print testP = new Print();
//		Math.abs(0.0);
//		String s= new String();
//		testP.printSimpleStar();
//		Print.printString(5, 'A');
		Picture tempPic = new Picture();
		tempPic.line = 5;
		tempPic.name = "正方形";
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

