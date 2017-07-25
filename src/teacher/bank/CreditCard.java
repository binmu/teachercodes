package teacher.bank;

//���ÿ������Դ�Ǯ��͸֧���
public class CreditCard extends BankCard{
	public double limit;
	//get��set����дȨ�޷��롢ҵ�������Է�������
	public void setLimit(double limit){
		if(this.user == null){
			this.limit = limit;
		}else if(user instanceof Student){
			this.limit = 5000;
		}else if(user instanceof Employee){
			this.limit = 20000;
		}else if(user instanceof Teacher){
			this.limit = 50000;
		}else if(user instanceof User){
			this.limit = 10000;
		}		
	}
	
	public void takeMoney(double tmpCount){
		if(this.balance - tmpCount < -1*limit){
			return;
		}
		this.balance = this.balance - tmpCount;
	}
	
	public String print(){
		String result  = super.print();
		result +=  "��ȣ�" + this.limit + ";\n"; 
		return result;
	}
}
