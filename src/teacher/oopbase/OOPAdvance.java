package teacher.oopbase;


public class OOPAdvance {

	public static void main(String[] args) {
		//1.建立类
		//2.建立实例化属性（成员变量-局部变量）
		//3.建立实例化方法（函数）
		//4.构造函数
		//5.静态属性
		//6.静态方法：一般出现在工具类，实体类中并不常见，例如Math
		//区分实例化还是静态的只有一个标准，静态成员永远只有一个，和类有关联，实例化成员可以0-N个，和对象有关系
		//实例化属性：名字，1个学生1个名字，5个学生5个名字。实例化对象应该能够能和现实中的物是一一对应的
		//静态属性：不管对象有多少，我只有1个
		//属性和方法都是类的成员
		//主要由于是构造函数的继承所造成的
		//StudentCopy scCopy = new StudentCopy();
		StudentCopy sc = new StudentCopy("xiapneg", "123");
		//静态属性要慎重，
		//       定义                                                             作用域                                                             生命周期
		//局部变量      方法内或者语句块内所声明的变量   从声明的哪一行起到方法或者语句块的结尾  如果是基本数据类型，在栈内存，直接清掉，如果是对象，还要等GC
		//成员变量     类的下面所声明的变量                        随着对象起起伏伏
		//静态变量      类的下面用static声明的变量      全领域，决定了错了很难找地方                      贯穿程序始终，程序开始时加载类，程序结束才消亡，时间跨度如此长，所以要慎重
		StudentCopy.studentCount++;
		sc.age++;
		//sc.iniStudentValue("xiapneg", "123");
//		sc.name = "xiapeng";
		//sc.setCardNo("123");
		System.out.println(sc.getCardNo());
	}

}

