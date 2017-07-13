
public class Option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通常表达式的称呼是由表达式最核心的那个运算符或者最后进行运算的运算符；
		boolean flagLarge = 150>100;
		//flagLarge = 150>100赋值表达式
		//150>100条件表达式
		
		int age = 38;
		//当++放在操作数的后面，那么就相当于下句话再加
		//当++放在操作数的前面，那么就相当于先加再做其他任何操作
		int anotherAge = flagLarge ? 60 : age++;
		System.out.println(anotherAge);
		System.out.println(age);
		//运算符分类的维度不同，造成不同的称呼
		//功能 分类来称呼运算符：赋值运算符、算术运算符、逻辑运算符、条件运算符、
		//所需要的操作数来称呼运算符：绝大部分运算是双目运算符，也就是说两个操作数分列左右，但是还有一些特殊的
		//单目【++、--、!】和三目【?:】
		int score = 520;
		age = 12;
		String hometown = "JS";
		//分数必须高于500，年龄要大于18，本省的学生年龄无所谓
		boolean isCollege = score > 500 && (age > 18 || hometown == "JS");
		System.out.println(isCollege);
		
		//1.()
		//2.++ -- !
		//3.+-*/%
		//4.><==!=>=<=
		//5.&& ||
		//6.= ?:
		
	}

}
