package teacher.hospitalsys;

public class Item {
	public String itemNo;
	public String name;
	public String remark;
	public double price;
	
	public boolean equals(Object anObject){
		if(this == anObject){
			return true;
		}
		if(anObject instanceof Item){
			return this.itemNo.equals(((Item)anObject).itemNo);
		}
		return false;
	}
}
