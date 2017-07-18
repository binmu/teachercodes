import java.util.Scanner;

public class Exercise {
//	编程显示100以内能被9整除的正整数之和（要求两种方法起）
	public static void main(String[] args){
//		int number=1;
//		int sum=0;
//		No1 Method 2
//		boolean isRight = false;
//		for(number=1;number<=100;number+=isRight?9:1){
//			if(isRight || number%9==0){			
//				sum+=number;
//				isRight = true ;
//			}			
//		}
		//No2 Method 3
		/*int tempNum = 0;
		for(number=1;tempNum<=100;number++){
			tempNum = number * 9;		
			sum+=tempNum;
		}
		System.out.println(sum)*/;
//		有一分数序列:2/1,3/2,5/3,8/5…..,依次类推20项之和
//		double a=1;
//		double num=0;
//		double b=2;
////		double c=0;
//		int count=0;
//		for(count=0;count<20;count++){
//			num=b/a+num;
//			//a 1 b 2
//			b = a + b;	//a 1 b 3
//			a = b - a;  //a 2 b 3
////			c=b;
////			b=a+b;
////			a=c;
//		}
//		System.out.println(num);
		//输出四位自然数中各位数字之和为6并且各位数字互不相同的数，并统计个数
		//0123
		//3*3*2*1
//		int count = 0;
//		int gw = 0;
//		int sw = 0;
//		int bw = 0;
//		int qw = 0;
//		
//		for(int i=1000;i<6000;i++){
//			qw = i/1000;
//			bw = i%1000/100;
//			sw = i%100/10;
//			gw = i%10;
//			if(qw+bw+sw+gw!=6){
//				continue;
//			}
//			//&& || !
//			//短路逻辑运算符：当表达式结果已定，则后面不进行计算，比如与&来连接的表达式，如果&的左边已经false
//			//比如或|来连接的表达式，左边为true
//			if((qw-bw) == 0 | (qw-sw) == 0 | (qw-gw)*(bw-sw)*(bw-gw)*(sw-gw)==0){
//				continue;
//			}
//			System.out.println("各位数字之和为6并且各位数字互不相同的数为："+i);
//			count++;
//		}
//		System.out.println("符合要求的数有"+count+"个");
		
		//用1角、2角、5角来组成1元，列举出所有组合
//		int num=10;
//		int fiveCount=num/5; //2
//		int count = 0;
//		//2*5*10
//		for(int countFive=0;countFive<=fiveCount;countFive++){
//			for(int countTwo=0;countTwo<=(10-countFive*5)/2;countTwo++){				
//				if((countFive*5+countTwo*2)<=10){
//					count++;
//					System.out.println(count + ":" + (10-countFive*5-countTwo*2)+"个1角 + "+countTwo+"个2角 + "+countFive+"个5角 = 1元");
//				}				
//			}			
//		}
//		生活案例：.某数学竞赛中，参赛人数大约在380~450人之间。
//		比赛结果，全体考生的总平均分为76分，男生的平均分为75分，女生的平均分为80.1分，
//		求男女生各有多少人？
//		int boy;
//		//75 76 80.1
//		//1*4.1   4.1*1
//		//5.1*80
//		//408
//		for(int all=380;all<=450;all++)
//		{
//			for(boy=1;boy<all;boy++)
//			{
//				if((boy*75+(all-boy)*80.1)==all*76){
//					System.out.println("男生有"+boy+"个，"+"女生有"+(all-boy)+"个");
//					return;
//				}					
//			}
//		}
		//7		
//		for(int a=-3;a<=3;a++){	
//			for(int b=0;b<Math.abs(a);b++){
//				System.out.print(" ");
//			}				   
//			for(int c=0;c<7-2*Math.abs(a);c++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//生活案例：打印日历，效果如Window7所示，1900年1月1日是周一
		//1.本月有多少天
		//2.上月有多少天
		//3.本月第一天是星期几
		//3.1.1900.1.1周一
		//3.2.距离这个日子有多少天，然后计算有多少周多少天，星期几算出来了
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入你想查询的年份：");
//		int year = 2017;//sc.nextInt();
//		System.out.println("请输入你想查询的月份：");
//		int month = 7;//sc.nextInt();
//		int sumDays = 0;  //用于存放xxxx年xx月1日的总天数
//		//计算年份之间的天数差距：1900.1.1-year.1.1
//		sumDays += (year-1900)*365;
//		for (int i = 1900; i < year; i=i+4) {
//			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
//				sumDays += 1;
//			} 
//		}
//		//计算月份之间的天数差距：year.1.1-year.month.1
//		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			monthDays[1] += 1;
//		} 
//		for (int i = 0; i < month-1; i++) {
//			sumDays += monthDays[i];			
//		}			
//		sumDays += 1;
//		
//		//System.out.println(year+"年"+month+"月1日的总天数"+sum);
//
//		int wekDay = sumDays % 7; // 计算year年month月1日为星期几
//
//		System.out.println(year+"年  "+month+"月  1日  星期" + wekDay);
//
//		System.out.println("\t\t  "+year + "年" + month + "月的日历如下：");
//
//		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
//		int printDays = 0;
//		int dayCount = monthDays[month-1];			//用于存放当月总天数
//		int prevDayCount = monthDays[(month-2+12)%12];	
//		
//		for (int i = prevDayCount-wekDay+1; i < prevDayCount+1; i++) {
//			System.out.print( i+"\t");
//			printDays++;
//		}
//
//		for (int i = 1; i <= dayCount; i++, wekDay++) {
//			System.out.print(i + "\t");
//			if ((wekDay + 1) % 7 == 0) {
//				System.out.println();
//			}
//			printDays++;
//		}
//		
//		for (int i = printDays; i%7!=0; i++) {
//			System.out.print((i-printDays+1) + "\t");
//		}
		
		//复制代码是不合理的第一步
		//写完代码测试是完成的最后一步，无论代码多简单
		//写完代码请你思考有没有更好的方法或者更好的写法，因为这才是你提升的刚开始
		//多角度考虑问题，尽量使用更多的知识来解决问题
	}
}
