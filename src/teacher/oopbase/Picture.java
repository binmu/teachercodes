package teacher.oopbase;

//属性的作用：存储数据，名词或者形容词化名词
//方法的作用：实现功能,动词或者动宾短语


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

