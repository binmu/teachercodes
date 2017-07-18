//Java类库就和宝库一样，里面很多工具很多类很多方法供我们使用
//很多工具应该如何组织？10000个工具应该如何组织和摆放？package
//在操作系统中，10000个文件你如何摆放？文件和文件夹做了一个很好的榜样
import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//循环的语法格式之一：while
		//while(boolean表达式){
		// codes;
		//}
		//第12行代码被执行了多少次 11   第13行代码被执行了多少次 10，上限-下限【多个等于号就要加个1】
//		int count = 0;			//声明一个变量，并赋初始值
//		while(count<10){        //执行循环，并判断条件是否为true，如果为true，就执行循环体，如果不为true，就跳出循环
//			System.out.println(count);//循环体的核心功能语句
//			count++;            //改变变量的数值，从而达到最终能够跳出循环的目的
//		}
		
		//你在控制台输入月份，可能会出现哪几种错误:1.输入的根本就不是数字，是字符串，那么就类型不匹配
		//2.输入的数字超出int的上限和表示范围，就报错
		//3.输入的数字应该在现实中正确的1-12，按你输入了其他数字
		//step1:input
		//当一段代码需要重复的时候，要么是循环，要么要重新架构类和对象
		/*
		int inputCount=0;	
		int year = 2017;
		int month = 0;
		int monthDay = 31;
		boolean isRight = false;
		Scanner sc = new Scanner(System.in);
		
		while(!isRight && inputCount<3){
			inputCount++;
			System.out.println("请输入一个1-12的数字，用来表示月份：");		
			month = sc.nextInt();
			//step2:check
			isRight = !(month < 1 || month > 12);
			if(isRight){
				System.out.println("你输入的月份完全不合情理");				
			}else{
				System.out.println(month);
			}
		}
		//step3：得出天数
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
		System.out.println("你输入的月份"+month+"月份有"+monthDay+"天");
		*/
		
		//累加：1-100的素数
		//1+2+3+4+5+6+7+8+9+10
		//1.求出第一个素数
		//2.求出1-100的所有素数
		//3.累加这些素数
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
		//累加：1-100的素数
		//1.求出第一个素数
		//2.求出1-100的所有素数
		//3.累加这些素数
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
				System.out.println(number + "是个素数");
				sumResult = sumResult + number;
			}	
			iniCount = 2;
			isSu = true;
			number++;
		}
		System.out.println("素数之和为"+sumResult );
		*/
		//while循环是先判断再循环，循环次数的范围从0到N
		//dowhile循环是先循环再判断，循环次数的范围从1到N
		/*
		int count = 0;			//声明一个变量，并赋初始值
		do{        //执行循环，并判断条件是否为true，如果为true，就执行循环体，如果不为true，就跳出循环
			System.out.println(count);//循环体的核心功能语句
			count++;            //改变变量的数值，从而达到最终能够跳出循环的目的
		}while(count<10);
		*/
		//1243243243243......2
//		for(表达式1;表达式2;表达式3){
//			codes4;
//		}
		//for什么都可以改变，但是执行顺序不会改变
		//for什么都可以省略，但是两个分号不能省略
		//1.声明一个变量，并赋初始值
		//2.执行循环，并判断条件是否为true，如果为true，就执行循环体，如果不为true，就跳出循环
		//4.循环体的核心功能语句
		//3.改变变量的数值，从而达到最终能够跳出循环的目的
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
		//1.先看两个变量之间的正反比关系：反比  -1（如果是正比是1）   正比 1
		//2.我大1，你小1：倍数关系是1  -1*rowCount             2 
		//3.补充常量：最大值5 1 -1    5-1-1*rowCount         2*rowCount+1
		
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
