package niit.stringTest.base;

import java.util.Scanner;

import niit.packageTest.one.PackageTest;

public class StringTest {
	public static void main(String[] args){
//		PackageTest pt = new PackageTest();
		Scanner sc = new Scanner(System.in);
		//"ZhangSan":�ڶ��ڴ��п���һ�οռ䣬����ZhangSan��ͬʱ���ý�����־
		//��ջ�ڴ�������һ�οռ�ָ��ÿռ���׵�ַ
		String name = "ZhangSan";

		//int:����һ���ַ��ֱ��N���ֽ�
		//"ZhangSan"����ַ��������Ѿ��ڶ��ڴ��д�����
		//��ջ�ڴ�������һ�οռ�ָ��ÿռ���׵�ַ
//		String nameCopy = "ZhangSan";
//		//���뿪�ٿռ�
//		String nameObject = new String("ZhangSan");
//		System.out.println(nameObject == nameCopy);
//		
//		
//		name.indexOf(ch)
		
//		StringCopy testString = new StringCopy("Iamas");
//		
//		System.out.println(testString.indexOf("am"));
		String s = "I am a student!";
		//����һ��a����ַ���λ��
		int index = -1;		
		//indexOf(int ch)
		//indexOf(String str)
		//indexOf(int ch,int fromIndex)
		//indexOf(String str,int fromIndex)
		//indexOf��ǰ����
		//lastIndexOf�Ӻ���ǰ
//		index = s.lastIndexOf("a");
//		System.out.println("a�ַ�������"+(index+1)+"λ��");
		//�������е�a��λ��
		//�ǲ���ֻ��һ��a
//		int resultCount = 0;
//		for(int count=0;count>=0;){
//			count = s.indexOf('a',count);
//			if(count>=0){
//				count++;
//				System.out.println("a�ַ�������"+count+"λ��");
//				resultCount++;
//			}			
//		}
//		System.out.println("a�ַ��ҵ���"+resultCount+"��");
		//�ǲ���ֻ��һ��a
		//substring ����beginIndex��������endIndex
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
		//trim()ȥ�ո�
		String[] words = strOne.split("a");
		System.out.println(strOne+ "��仰�ĵ�������");
		for(int count = 0; count<words.length;count++){
			System.out.println(words[count]);
		}
		System.out.println(strOne.toLowerCase());
		System.out.println(strOne.toUpperCase());
		
		//�²�String�ķ���������
//		//��ɾ�Ĳ�
//		//find search lookup get
//		//��ķ�����
//		//���ң�һ����ĳ����Χ��ʲô�������ҵ���λ��
//		//�н���һ����ĳ����Χ(Դ����String�µ�char[])��ʲô��Ŀ�꣩
//		//�г�:�����ҵ���λ��
		//indexOf
		//substring
	}
}
