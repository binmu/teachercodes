package teacher.bank;


public class Test {

	public static void main(String[] args) {
		//抽象类一般会在更加复杂的业务模型中使用，专门设置一个类出来，不是为了去实例化对象，而仅仅是为了一批类的规则（抽象方法）和主体实现代码（其他代码）
		BankCard tmpBc = new SaveCard();
		//抽象类必须包含抽象方法，包含抽象方法的也必然是抽象类
		//作为抽象类的子类，要么来实现抽象类中的抽象方法，要么自己仍然是抽象类
		//如果去实现抽象类中的抽象方法的话，拿就直接复制方法头，去修改方法体实现{}
	
		
		User user = new User();
		user.userName = "张三";
		user.userCardNo = "320981199107250471";
		
		User userCopy = new User();
		userCopy.userName = "王五";
		userCopy.userCardNo = "520981199107250471";
		System.out.println(user.compareTo(userCopy));
		
		CreditCard tmpCC = new CreditCard();
		tmpCC.cardNo = "123456789123456789";
		tmpCC.balance = 1000;
		tmpCC.password = "159357";
		tmpCC.limit = 50000;
		tmpCC.user = user;
		
		
		CreditCard tmpCCCopy = new CreditCard();
		tmpCCCopy.cardNo = "123456789123456780";		
		tmpCCCopy.balance = 10000;		
		tmpCCCopy.password = "753951";
		tmpCCCopy.limit = 100000;		
		tmpCCCopy.user = user;
		
		if(tmpCC.user.equals(tmpCCCopy.user)){
			System.out.println("这是张三持有的两张卡");
		}
		//接口：BankCard下面写了Print CreditCard User Teacher
//		System.out.println(user.print());
//		System.out.println(tmpCC.print());
//		System.out.println(tmpCCCopy.print());
		//Print接口的意义在于
		//1.在于规定了所有打印必须实现的方法（而且在接口中只有一个方法头，并没有任何的方法体）
		//2.为其他类提供了规范
		//3.把一群有规范的类或者对象聚集起来，统一做一样的事情
		//接口是一把手术刀，短小精干，非常锐利，从一个方法的共同特性切入进去
		//抽象类更像是重型武器，考虑了所有，决定做一个所有类的共同特性的父类，不但考虑了该抽象方法，而且放了属性，放了很多实例化的方法
		//这两个技术往往经常互相替换
		//对于子类来言，他只能继承一个父类，但可以实现无数接口
		//User继承了父类Print
		//user is a print
		//bankcard is a print
		//user bankcard
		
		//接口和抽象类：
		//1.着眼点：接口主要考虑的是一个方法，抽象类主要考虑的是类的所有
		//2.在使用李氏替换原则的时候，更适用于抽象类，而不太适用于接口
		//3.继承只能一个，接口可以无数		
//		Print[] printers = new Print[3];
//		printers[0] = user;
//		printers[1] = tmpCC;
//		printers[2] = tmpCCCopy;
//		for(int index = 0;index<printers.length;index++){
//			System.out.println(printers[index].print());
//		}

	}

}
