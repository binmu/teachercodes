package teacher.hospitalsys;

public class Combo {
	public String comboNo;
	public String name;
	public String remark;
	public double price;
	public int itemCount;
	Item[] items = new Item[10];
	
	public void calPrice(){
		this.price = 0;
		for(int index = 0;index<itemCount;index++){
			this.price += this.items[index].price;			
		}
		this.price = this.price * 0.8;
	}
	
	public boolean equals(Object anObject){
		if(this == anObject){
			return true;
		}
		if(anObject instanceof Combo){
			return this.comboNo.equals(((Combo)anObject).comboNo);
		}
		return false;
	}
}
