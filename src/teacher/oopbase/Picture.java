package teacher.oopbase;

//���Ե����ã��洢���ݣ����ʻ������ݴʻ�����
//���������ã�ʵ�ֹ���,���ʻ��߶�������


public class Picture {
	public int line;
	public String name;
	public String printString(int count,char c){
		String result = "";
		for(int i = 0;i<count;i++){
			result = result + c;
		}
		return result;
	}
	
	public String printAllString(int count,char c){
		String result = "";
		for(int tempLine = 0 ;tempLine<this.line;tempLine++){
			for(int i = 0;i<count;i++){
				result = result + c;
			}
			result = result + "\n";
		}		
		return result;
	}
}

