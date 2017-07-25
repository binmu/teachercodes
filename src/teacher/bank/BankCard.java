package teacher.bank;


//userName:����userCardNoֱ�Ӿ����ģ�����cardNo֮��Ĺ�ϵ�Ǽ�ӵĹ�ϵ
//���˵���Ƕ�user�Ĳ����ǳ��ٵĻ�����ôҲ������ν�ˣ�ֱ�ӽ�userName����ΪBankCard����
//�������˵���Ƕ���user�Ĳ����ǳ���Ļ�����ô�ͻ������������ĸо������ʺϽ�userName��ֱ��д������
//��������
public abstract class BankCard implements Print {
	public String cardNo;
	public User user;
	public double balance;
	public String password;
	
	public void saveMoney(double tmpCount){
		this.balance = this.balance + tmpCount;
	}
	
	public abstract void takeMoney(double tmpCount);
	
	public String print(){
		String result  = "";
		
		result += "���п�" + this.cardNo + ";\n"; 
		result += "�û���Ϣ��" + this.user.userName + this.user.userCardNo + ";\n"; 
		result += "��" + this.balance + ";\n"; 
		
		return result;
	}
}
