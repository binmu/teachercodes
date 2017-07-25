package teacher.bank;


public class Student extends User {
	public int year;
	
	public String print(){
		String result  = "";
		
		result += "姓名" + this.userName + ";\n"; 
		result += "身份证号：" + this.userCardNo + ";\n"; 
		result += "性别：" + this.sex + ";\n"; 
		result += "爱好：" + this.hobby + ";\n"; 
		result += "年级：" + this.year + ";\n"; 
		
		return result;
	}
}
