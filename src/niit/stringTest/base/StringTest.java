package niit.stringTest.base;

import java.util.Scanner;

import niit.packageTest.one.PackageTest;

public class StringTest {
	public static void main(String[] args){
//		PackageTest pt = new PackageTest();
		Scanner sc = new Scanner(System.in);
		//"ZhangSan":在堆内存中开辟一段空间，存入ZhangSan，同时设置结束标志
		//在栈内存中声明一段空间指向该空间的首地址
		String name = "ZhangSan";

		//int:开辟一块地址，直接N个字节
		//"ZhangSan"这个字符串常量已经在堆内存中存在了
		//在栈内存中声明一段空间指向该空间的首地址
//		String nameCopy = "ZhangSan";
//		//必须开辟空间
//		String nameObject = new String("ZhangSan");
//		System.out.println(nameObject == nameCopy);
//		
//		
//		name.indexOf(ch)
		
//		StringCopy testString = new StringCopy("Iamas");
//		
//		System.out.println(testString.indexOf("am"));
		String s = "I am a student!";
		//查找一下a这个字符的位置
		int index = -1;		
		//indexOf(int ch)
		//indexOf(String str)
		//indexOf(int ch,int fromIndex)
		//indexOf(String str,int fromIndex)
		//indexOf从前往后
		//lastIndexOf从后往前
//		index = s.lastIndexOf("a");
//		System.out.println("a字符出现在"+(index+1)+"位置");
		//查找所有的a的位置
		//是不是只有一个a
//		int resultCount = 0;
//		for(int count=0;count>=0;){
//			count = s.indexOf('a',count);
//			if(count>=0){
//				count++;
//				System.out.println("a字符出现在"+count+"位置");
//				resultCount++;
//			}			
//		}
//		System.out.println("a字符找到了"+resultCount+"次");
		//是不是只有一个a
		//substring 包含beginIndex但不包含endIndex
//		System.out.println(s.substring(1));
//		System.out.println(s.charAt(5));
//		System.out.println(s.substring(5,6));
//		
//		System.out.println(s.replace('a', 'b'));
//		System.out.println(s.concat("yor are right"));
//		System.out.println(s.length());
//		System.out.println(s.startsWith("I"));
//		System.out.println(s.endsWith("ent"));
//		s.indexOf("ent") == s.length()-"ent".length()-1;
//		s.indexOf("I")==0
//		s.equals(anObject)
		String strOne = "I am a Student!";
		String strTwo = "test";
		String strThree = new String("test");
		
		System.out.println(strOne ==  strTwo);
		System.out.println(strOne ==  strThree);
		System.out.println(strOne.equals(strThree));
		strTwo = "tes";
		System.out.println(strOne.compareTo(strTwo));
		//trim()去空格
		String[] words = strOne.split("a");
		System.out.println(strOne+ "这句话的单词如下");
		for(int count = 0; count<words.length;count++){
			System.out.println(words[count]);
		}
		System.out.println(strOne.toLowerCase());
		System.out.println(strOne.toUpperCase());
		
		//猜猜String的方法和属性
//		//增删改查
//		//find search lookup get
//		//查的方法：
//		//查找：一定在某个范围找什么，返回找到的位置
//		//有进：一定在某个范围(源，该String下的char[])找什么（目标）
//		//有出:返回找到的位置
		//indexOf
		//substring
	}
}
