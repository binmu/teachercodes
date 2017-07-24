package niit.stringTest.base;

public class StringCopy {
	public char[] chars;
	
	public StringCopy(String srcString){
		this.chars = new char[srcString.length()];
		for(int count = 0;count<srcString.length();count++){
			this.chars[count] = srcString.charAt(count);
		}		
	}
	//���ҷ���
	public int indexOf(String targetString){
//		for(int count=0;count<this.chars.length-targetString.length();count++){
//			if(this.getStringByIndex(count, count+targetString.length()).equals(targetString)){				
//				return count;
//			}
//		}
//		return -1;
		StringCopy sc = new StringCopy(targetString);
		return StringCopy.indexOf(this.chars, 0, this.chars.length, sc.chars, 0
				, sc.chars.length, 0);
	}
	//���ҿ�ʼ�±�ͽ����±꣬����һ�����ַ���
	//args:
	//startIndex:��ʼ��ȡ�ַ������±�
	//endIndex��������ȡ�ַ������±�
	//return����ȡ�Ľ���ַ���
	//conditions��charsԴ�ַ�����ֱ��ͨ��this���з��ʼ���
	//
	public String getStringByIndex(int startIndex,int endIndex){
		if(startIndex < 0){
			return "";
		}
		if(startIndex >= this.chars.length){
			return "";
		}
		if(endIndex < 0){
			return "";
		}
		if(endIndex >= this.chars.length){
			return "";
		}
		String resultString = "";
		for(int count = startIndex; count < endIndex; count++){
			resultString = resultString + this.chars[count];
		}
		return resultString;
	}

	//source:Դ�ַ���
	//sourceOffset����ʼ���ҵ��±�
	//sourceCount:��ʼ���ҳ���
	//target:Ŀ���ַ���
	//targetOffset��Ŀ���ַ�����ʼ���ҵ��±�
	//targetCount:Ŀ���ַ�����ʼ���ҳ���
	//fromIndex:��ʲô�ط���ʼ����
	static int indexOf(char[] source, int sourceOffset, int sourceCount,
            char[] target, int targetOffset, int targetCount,
            int fromIndex){
		//abmd 1 2 bm
		char[] actSource = new char[sourceCount];
		for(int count=0;count<sourceCount;count++){
			actSource[count] = source[sourceOffset+count];
		}
		char[] actTarget = new char[targetCount];
		for(int count=0;count<targetCount;count++){
			actTarget[count] = target[targetOffset+count];
		}
		for(int count = fromIndex;count<actSource.length-targetCount;count++){
			boolean isSame = true;
			for(int comCount=0;comCount<targetCount;comCount++){				
				isSame = isSame && (actSource[count+comCount] == actTarget[comCount]);				
				if(!isSame){
					break;
				}
			}			
			if(isSame){
				return count;
			}			
		}
		return -1;
	 
	}

}
