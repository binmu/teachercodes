package teacher.bank;
//�ӿ��������������������������Ѻ��ӿ�����
public class SonCard extends BankCard {
	public BankCard parentBc;
	
	public void saveMoney(double tmpCount){
		this.balance = this.balance + tmpCount;
		parentBc.balance = this.balance;
	}
	
	public void takeMoney(double tmpCount){
		if(this.balance <= tmpCount+1){
			return;
		}
		this.balance = this.balance - tmpCount;
		parentBc.balance = this.balance;
	}
}
