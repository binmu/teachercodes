package teacher.bank;


public class Test {

	public static void main(String[] args) {
		//������һ����ڸ��Ӹ��ӵ�ҵ��ģ����ʹ�ã�ר������һ�������������Ϊ��ȥʵ�������󣬶�������Ϊ��һ����Ĺ��򣨳��󷽷���������ʵ�ִ��루�������룩
		BankCard tmpBc = new SaveCard();
		//���������������󷽷����������󷽷���Ҳ��Ȼ�ǳ�����
		//��Ϊ����������࣬Ҫô��ʵ�ֳ������еĳ��󷽷���Ҫô�Լ���Ȼ�ǳ�����
		//���ȥʵ�ֳ������еĳ��󷽷��Ļ����þ�ֱ�Ӹ��Ʒ���ͷ��ȥ�޸ķ�����ʵ��{}
	
		
		User user = new User();
		user.userName = "����";
		user.userCardNo = "320981199107250471";
		
		User userCopy = new User();
		userCopy.userName = "����";
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
			System.out.println("�����������е����ſ�");
		}
		//�ӿڣ�BankCard����д��Print CreditCard User Teacher
//		System.out.println(user.print());
//		System.out.println(tmpCC.print());
//		System.out.println(tmpCCCopy.print());
		//Print�ӿڵ���������
		//1.���ڹ涨�����д�ӡ����ʵ�ֵķ����������ڽӿ���ֻ��һ������ͷ����û���κεķ����壩
		//2.Ϊ�������ṩ�˹淶
		//3.��һȺ�й淶������߶���ۼ�������ͳһ��һ��������
		//�ӿ���һ������������С���ɣ��ǳ���������һ�������Ĺ�ͬ���������ȥ
		//������������������������������У�������һ��������Ĺ�ͬ���Եĸ��࣬���������˸ó��󷽷������ҷ������ԣ����˺ܶ�ʵ�����ķ���
		//�����������������������滻
		//�����������ԣ���ֻ�ܼ̳�һ�����࣬������ʵ�������ӿ�
		//User�̳��˸���Print
		//user is a print
		//bankcard is a print
		//user bankcard
		
		//�ӿںͳ����ࣺ
		//1.���۵㣺�ӿ���Ҫ���ǵ���һ����������������Ҫ���ǵ����������
		//2.��ʹ�������滻ԭ���ʱ�򣬸������ڳ����࣬����̫�����ڽӿ�
		//3.�̳�ֻ��һ�����ӿڿ�������		
//		Print[] printers = new Print[3];
//		printers[0] = user;
//		printers[1] = tmpCC;
//		printers[2] = tmpCCCopy;
//		for(int index = 0;index<printers.length;index++){
//			System.out.println(printers[index].print());
//		}

	}

}
