package teacher.bank;


//userName:是由userCardNo直接决定的，而和cardNo之间的关系是间接的关系
//如果说我们对user的操作非常少的话，那么也就无所谓了，直接将userName来作为BankCard属性
//但是如果说我们对于user的操作非常多的话，那么就会有喧宾夺主的感觉，不适合将userName再直接写在里面
//单独做类
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
		
		result += "银行卡" + this.cardNo + ";\n"; 
		result += "用户信息：" + this.user.userName + this.user.userCardNo + ";\n"; 
		result += "余额：" + this.balance + ";\n"; 
		
		return result;
	}
}
