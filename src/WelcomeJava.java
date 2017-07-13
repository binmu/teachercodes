//公共 类 WelcomeJava
public class WelcomeJava {
	//格式和内容都是固定的，main是作为整个项目的唯一入口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//所有计算机的存储都是以二进制来作为最基本的运算单位，所以以2为倍数，往往运算效率更高
		//所以我们就会看到无论是容量、运算，大部分默认值都是以2的倍数来作为基准
		//byte   1   
		//short  2
		//int    4
		//long   8
		//float  4
		//double 8
		//数据类型的声明和初始化的最常见格式
		//method 1:Datatype varName = iniValue;
		//method 2:Datatype varName;声明变量，用数据类型,在内存中开辟了一段空间，并且给空间的首地址命名
		// varName = iniValue;赋初始值，给对应空间赋值
		//0X 846F变量名相当于给内存地址起别名
		//'\t'：使得前面的字符串占据固定长度8的整数倍
		//用于生成开发者文档的注释，可以通过Javadoc命令将该文档注释导入到开发者文档中去
		/**
		 * 关键字：Java规定好做特定用途的名字，比如说int，变色
		 * 标识符：自定义的表示一定含义的名字，顾名思义，合理合法
		 * 顾名思义:看到名字就知道含义，也就是说看到age就知道是年纪
		 * 合理合法：遵守约定俗成的一些规定和格式，同时还符合语法
		 * 组成部分：英文字母（a-z A-Z） 数字（0-9） 下划线（_） 特殊字符（$）
		 */
		//单行和多行注释：在编译过程都将会被自动忽略，在开发过程起到一个提示作用，比如说一段复杂代码的思路、一个关键性变量的含义、一个标志位的跳转、一个方法的开始、一个判断分支
		// specChar WelcomeJava		
		//常量：
		//char specChar = '\t';
		//目前变量的作用域：从声明的地方到该方法的大括号的结尾处
		//生存周期：从声明的时间到方法执行结束的时间
		//这里所指的变量基本是局部变量
		//the local variable
		char sex = 'M';		
		int age = 38 ;		
		double salaryMin = 5000.00;
		
		//System.out.println(age);
		System.out.println(sex);
		System.out.println("abcdefghijk");
		System.out.println(1+salaryMin+2);
		//运算符重载：当+号两边都连接的是数值类型的变量或者常量的话，那么就是数值相加，当其中有一边是字符，那么就是联接
		
		{
			//变量作用域：从声明的地方到语句块的结尾处
			//生存周期：从声明的时间到语句块执行结束的时间
			//这里所指的变量基本是范围更小的局部变量
			int increaseAge = 3;
			System.out.println(increaseAge);
		}
		
		//boolean布尔型：开关，要么开要么关，非此即彼（计算机用的二进制、生活中计算机及很多元器件都喜欢二选开关，消费最小，最方便）
		//真true 假false
		boolean isCollege = true;   //是否是大学毕业
		//boolean flag....
		//!取反，非此即彼。当！isCollege是true，最后出来的结果就是false
		//当！isCollege是false，最后出来的结果就是true
		System.out.println("是否大学了？"+!isCollege);
		//&&与，且， 
		//当两个都为真，才为真，只要一个为假，就都为假
		//Abool && Bbool    result
		//true  && true     true
		//true  && false     false
		//false  && true     false
		//false  && false     false
		//||或
		//只要一个为真，就都为真，当两个都为假，才为假
		//Abool || Bbool    result
		//true  || true     true
		//true  ||false     true
		//false  || true     true
		//false  || false     false
		
		boolean flagOne = true;
		boolean flagTwo = false;
		System.out.println(flagOne||flagTwo);
		

	}

}
