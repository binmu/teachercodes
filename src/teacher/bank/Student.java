package teacher.bank;


public class Student extends User {
	public int year;
	
	public String print(){
		String result  = "";
		
		result += "����" + this.userName + ";\n"; 
		result += "���֤�ţ�" + this.userCardNo + ";\n"; 
		result += "�Ա�" + this.sex + ";\n"; 
		result += "���ã�" + this.hobby + ";\n"; 
		result += "�꼶��" + this.year + ";\n"; 
		
		return result;
	}
}
