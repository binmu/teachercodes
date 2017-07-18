package teacher.oopbase;

//需求分析：
//1.每一个时间点同时在校生
//2.所有员工的基本信息
//3.记录每个班级的大事情：开班、阶段结束、90%就业时间点
//4.记录老师上课的录像上传
//5.记录同学们日常作业的一些情况
//面向对象思考问题的步骤：
//1.寻找重要的名词：学生 员工 班级 【大事情 】录像 作业
//2.寻找名词的描述特征
//3.做了其中一个功能：新增学生，入学
//3.1把大量代码写在主函数，只将学生和学校类作为实体类来承担信息装载的功能
//3.2学校内中新增学生入学的方法，也是合情合理的，所以移植到School类
//3.3boolean不足以返回太多的信息，我们就返回了字符串（功能和打印分离，功能应该分布在各个类中，打印应该在主函数中)
//3.4考虑到大型商业开发，错误提示应该有统一的规定和风格，故而生成了Result类来记录各种类型的结果的提示和编号等，模仿SQLServer错误提示系统

//属性+方法
//封装：程序移植性好不好的重要标志
//继承:面向对象复杂的业务模型精简的重要方式
//多态:实现精简的这个技术
public class SchoolSys {
	public static void main(String[] args){
		
		School sch = new School();
		System.out.println("欢迎使用学校管理系统");
		System.out.println("请选择你要使用的功能");
		System.out.println("1.学生管理");
//		if(sch.addStu("xiapeng", 18, 'M')){
//			System.out.println("入学成功");
//		}else{
//			System.out.println("入学失败");
//		}
		System.out.println(sch.addStu("xiapeng", 18, 'M').resultContent);
//		Student stu = new Student();		
//		stu.name = "xiapeng";
//		stu.age = 18;
//		stu.cardNo = "320981199909190471";
//		stu.sex = 'M';
//		stu.studentNo = "CZ2017QD032";
//		stu.subjectName = "Java";
//		sch.studentActCount++;
//		sch.stus[sch.studentActCount-1] = stu;
//		System.out.println("入学成功");
//		sch.stus[sch.studentActCount-1].name = "wangpeng";
		//引用类型的对象进行赋值的时候，就是将引用类型对象得首地址赋值给对方，让对方和自己共同指向同一块内存地址
		//故而发现，修改以后，两边都发生了变化
		//而基本数据类型声明的变量就不是如此，所以我们也将变量称之为值类型的变量，因为他们赋值等等操作都是针对的数值，而不是地址
		//sch.stus[sch.studentActCount-1] = stu;
		//0x66的地址赋值给了这个数组的第一个元素
//		stu = new Student();
//		System.out.println(stu.name);
//		System.out.println(sch.stus[sch.studentActCount-1].name);
		
		System.out.println("2.员工管理");
		System.out.println("3.班级管理");
		System.out.println("4.录像上传功能");
		System.out.println("5.作业查看功能");
	}
}

