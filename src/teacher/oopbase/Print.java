package teacher.oopbase;

//类的声明和实例化
//声明格式：访问修饰符 【其他修饰符】 class 类名
//{}表明类的开始和结束
public class Print {
	//打印：
	//打印很多空格和*
	//打印正方形
	//属性的作用：存储数据，名词或者形容词化名词
	//方法的作用：实现功能,动词或者动宾短语
	//如何来定义方法的声明部分(方法头部)	
	//方法的调用：方法的拥有者.方法名(对应参数)
	//其中对应参数必须和方法头部所声明的参数的数据类型、位置、顺序都保持一致
	//实例化方法：方法的拥有者是该方法所属的类的实例化对象
	//静态方法：方法的拥有者是该方法所属的类
	//这对大括号表示方法的始末，开始和结束
	
	//访问修饰符 【其他修饰符】 返回值类型 方法名(参数数据类型 参数名,参数数据类型 参数名.......){
	//	方法体；
	//}
	//不大不小:20-30,如果太少，代码过于简单，调用的感觉还不如直接写呢，如果过多，代码重用性大幅度降低
	//有进有出:外部给方法内部用的内容就叫做进（参数），他给外部的反馈，就叫做出（打印）。如果没有进，方法不够灵活，功能不够强大
	//如果没有出，方法有的时候功能有所缺失，外部无法判断方法执行是否成功
	//最简单的方法：打印1行5个星号
	public void printSimpleStar(){
		for(int i = 0;i<5;i++){
			System.out.print("*");
		}
		System.out.println("");
	}
	//功能：打印空格无数次
	public static void printSpace(int count){
		for(int i = 0;i<count;i++){
			System.out.print(" ");
		}
	}
	//功能：打印某个字符无数次
	public static String printString(int count,char c){
		String result = "";
		for(int i = 0;i<count;i++){
			result = result + c;
		}
		return result;
	}	
	
	public static void printStar(int count){
		for(int i = 0;i<count;i++){
			System.out.print("*");
		}
	}
}

