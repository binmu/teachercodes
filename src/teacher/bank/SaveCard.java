package teacher.bank;
//���:����С��1�����Դ�ܶ�Ǯ������͸֧
//���Ե�ԭ���ǣ�����Ĺ��ܺ����Կ������������п�������߱������������
//�����Ե�ԭ���ǣ�BankCardʵ���ࡢ�����ࡢ�����ࣨ����ʵ����������ࣩ
public class SaveCard extends BankCard{
	
	public void takeMoney(double tmpCount){
		if(this.balance <= tmpCount + 1){
			return;
		}
		this.balance = this.balance - tmpCount;
	}
}
