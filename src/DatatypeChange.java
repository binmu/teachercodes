
public class DatatypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数据类型转换：分为两种：自动转换、强制转换
		//当运算符的两边数据类型不一致的时候,有可能需要转换
		int age = 38;				//两边数据类型一致，无需转换，直接赋值
		int height = (int) 1.73;    //两边数据类型不一致，就需要转换,就必须写代码，这就是强制转换
		byte testSalary = 125;
		int salaryMin = testSalary; //两边数据类型不一致，就需要转换,没有写代码，就需要自动转换
		System.out.println(testSalary);
		System.out.println(salaryMin);
	}

}
