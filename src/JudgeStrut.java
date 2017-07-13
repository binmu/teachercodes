
public class JudgeStrut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//程序控制语句：
		//1.顺序：按书写顺序执行相应程序
		//2.判断分支：根据判断决定是否执行相应程序
		//3.循环：根据判断决定执行多少次相应程序
		//最简单的判断分支A
		//if(表达式B【能够返回boolean的任何形式的常量变量表达式】){
		//	codes;
		//}
		/*
		int height = 177;
		if(height >= 175){
			System.out.println("原来我和高富帅还是沾边的");
		}
		*/
		//判断分支B
		//if(表达式B【能够返回boolean的任何形式的常量变量表达式】){
		//	codesA;
		//}else{
		//	codesB;
		//}
		
		/*
		int height = 173;
		int weight = 180;
		if(height >= 175){
			System.out.println("原来我和高富帅还是沾边的");
		}else{
			System.out.println("矮也不是我们的错");
		}
		*/
		//当身高高于175，原来我和高富帅还是沾边的
		//当身高低于175，就看你的体重，体重大于180，举足轻重；体重小于180，轻于鸿毛
		//判断分支B
		//if(表达式B【能够返回boolean的任何形式的常量变量表达式】){
		//	codesA;
		//}else{
		//	codesB;
		//}
		/*
		int height = 173;
		int weight = 200;
		if(height >= 175){
			System.out.println("原来我和高富帅还是沾边的");
		}else{
			if(weight>180){
				System.out.println("我举足轻重，不容忽视");
			}else{
				System.out.println("我轻于鸿毛，潜力巨大");
			}
		}
		*/
		//逻辑互斥性
		/*
		int height = 173;
		int weight = 150;
		if(height >= 175){
			System.out.println("原来我和高富帅还是沾边的");
		}else if(weight>180){
			System.out.println("我举足轻重，不容忽视");
		}else{
			System.out.println("我轻于鸿毛，潜力巨大");
		}
		*/
		/*
		int height = 173;
		int weight = 150;
		if(height >= 175){
			System.out.println("原来我和高富帅还是沾边的");
		}
		if(height < 175 && weight>180){
			System.out.println("我举足轻重，不容忽视");
		}
		if(!(height < 175 && weight>180)){{
			System.out.println("我轻于鸿毛，潜力巨大");
		}
		*/
		//范围判断 > < >= <=
		//点值判断==ABCD
		char scoreClass = 'F';
		/*
		if(scoreClass == 'A'){
			System.out.println("会当凌绝顶，一览众山小");
		}else if(scoreClass == 'B'){
			System.out.println("上课总是轻松愉快，作业也这么容易");
		}else if(scoreClass == 'C'){
			System.out.println("不掉队才是硬道理，作业能不能做出来我就无法控制了");
		}else if(scoreClass == 'D'){
			System.out.println("我怎么听不懂");
		}
		*/
		switch(scoreClass){
		case 'A':
			System.out.println("会当凌绝顶，一览众山小");
			break;
		case 'B':
			System.out.println("上课总是轻松愉快，作业也这么容易");
			break;
		case 'C':
			System.out.println("不掉队才是硬道理，作业能不能做出来我就无法控制了");
			break;
		case 'D':
			System.out.println("我怎么听不懂");
			break;
		default:
			System.out.println("我居然没有成绩，什么情况");
			break;
		}
	}

}
