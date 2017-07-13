
public class OptionTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//算术运算符
		int numOne = 15;
		int numTwo = 10;
		double numThree = 15.0;
		double numFour = 10.0;
		System.out.println("numOne + numTwo =" + (numOne+numTwo));
		System.out.println("numOne - numTwo =" + (numOne-numTwo));
		System.out.println("numOne * numTwo =" + (numOne*numTwo));
		//numOne/numTwo:两个都是同一个数据类型在运算符的两侧，那么得到的结果也是原来这种数据类型	
		//经常会发生数据类型自动转换
		//同时需要在实际开发过程中善于使用运算符优先级最高的()，以提升开发效率，降低精力消耗
		System.out.println("numOne / numTwo =" + (numThree/numTwo));
		System.out.println("numOne % numTwo =" + (numOne%numTwo));
		//复合赋值运算符
		numTwo -= numOne;  //numTwo = numTwo - numOne;
		System.out.println("numTwo - numOne =" + numTwo);
		
		//Question1:给你两个数字，分别为numOne和numTwo，请将这两个调换并打印
		/*
		int middleNum = numOne;
		numOne = numTwo;
		numTwo = middleNum;
		System.out.println("numOne =" + numOne);
		System.out.println("numTwo =" + numTwo);
		*/
		//Question2:给你两个数字，分别为numOne和numTwo，请将这两个调换并打印(不允许使用第三方变量,上海群硕)
		/*
		numOne = numOne + numTwo;
		numTwo = numOne - numTwo;
		numOne = numOne - numTwo;
		System.out.println("numOne =" + numOne);
		System.out.println("numTwo =" + numTwo);
		*/
		
		//关系运算符：返回的是boolean， > <  == != >= <=
		//幼儿园入学条件：1.你所住小区的名字是“abc”2.你的入学年纪正好是5岁
		boolean flagArea = "abc" == "abc";
		boolean flagAge = 5 == 5;
		System.out.println("是否可以入学本幼儿园 =" + (flagArea && flagAge));
		
		
	}

}
