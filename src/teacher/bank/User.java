package teacher.bank;
//BankCard:abstract class
//abstract method
//the inherited abstract method Print.print()
public class User implements Print,Comparable {
	public String userCardNo;
	public String userName;
	public int age;
	public char sex;
	public String hometown;
	public String hobby;
	
	public boolean equals(Object anObject){
		if(this == anObject){
			return true;
		}
		if(anObject instanceof User){
			User tmp = ((User)anObject);
			//if(this.userCardNo.equals(((User)anObject).userCardNo)){
			if(this.userCardNo.equals(tmp.userCardNo)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	public String print(){
		String result  = "";
		
		result += "姓名" + this.userName + ";\n"; 
		result += "身份证号：" + this.userCardNo + ";\n"; 
		result += "性别：" + this.sex + ";\n"; 
		result += "爱好：" + this.hobby + ";\n"; 
	
		return result;
		
	}
	
	public int compareTo(Object anObject){
		if(anObject instanceof User){
			return this.userCardNo.compareTo(((User)anObject).userCardNo);
		}
		return 0;		
	}
	
}
