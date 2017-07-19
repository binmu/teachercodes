package teacher.oopbase;


public class StudentCopy {
	//构造函数与方法之间的区别
	//1.定义不同：
	//	A.构造函数的名字是确定的就是类名，方法的名字是自己自定义的
	//  B.返回值类型不同，方法的返回值类型也是可以自定义的，但是构造函数根本就没有返回值，
	//     因为构造函数的目的就是为了初始化对象中的各个属性
	//2.调用不同：
	//     new一个对象自动调用，普通方法是用对象名.方法名来调用的
	//void iniStudentValue=StudentCopy
	//刚才方法的调用是不是就在new一个对象之后
	public StudentCopy(){
		this.name = "zhangsan";
		this.cardNo = "123456789";
	}
	public StudentCopy(String name,String cardNo){
		this.name = name;
		this.cardNo = cardNo;
	}
	
	public void iniStudentValue(String name,String cardNo){
		this.name = name;
		this.cardNo = cardNo;
	}
	public static  int studentCount;
	public String name;
	public int age;
	private String cardNo;
	public char sex;
	public String studentNo;
	//方法封装属性的意义：
	//1.将属性的读写权限分离
	//2.检测属性的业务逻辑
	
	//cardNo身份证号，一旦输入了之后不允许再变化
	//不考虑第一次输入的话，我们一定要能够将查看和修改这两件事情分开才可以
	//查看的方法，就是用返回值返回给外界，留给外界进行操作
	public String getCardNo(){
		return this.cardNo;
	}
	//设置的方法
	//this这个，this是个对象，谁调用这个方法，谁就是这个方法里面的this
//	public void setCardNo(String cardNo){
//		this.cardNo = cardNo;
//	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		if(age<18){
			System.out.println("年纪不能过小，必须超过18岁");
			return;
		}
		this.age = age;
	}
	
	public String displayStu(){
		String name = this.name;
		for(int count=0;count<5;count++){
			System.out.println(count);
		}
		return name;
	}
}

