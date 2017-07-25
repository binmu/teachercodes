package teacher.bank;
//储蓄卡:余额不能小于1、可以存很多钱、不能透支
//可以的原因是：储蓄卡的功能和属性看做是所有银行卡所必须具备最基础的内容
//不可以的原因是：BankCard实体类、工具类、抽象类（不能实例化对象的类）
public class SaveCard extends BankCard{
	
	public void takeMoney(double tmpCount){
		if(this.balance <= tmpCount + 1){
			return;
		}
		this.balance = this.balance - tmpCount;
	}
}
