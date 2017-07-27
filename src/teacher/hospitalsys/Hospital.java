package teacher.hospitalsys;

public class Hospital {
	public int itemCount;
	Item[] items = new Item[20];
	public int comboCount;
	Combo[] combos = new Combo[10];
	
	public Combo getComboByNo(String comboNo){
		Combo comCombo = new Combo();
		comCombo.comboNo = comboNo;
		for(int index = 0;index<this.comboCount;index++){
			
			if(this.combos[index].equals(comCombo)){
				return this.combos[index];
			}
		}
		return null;
	}
	
	public Item getItemByNo(String itemNo){
		Item comItem = new Item();
		comItem.itemNo = itemNo;
		for(int index = 0;index<this.itemCount;index++){
			if(this.items[index].equals(comItem)){
				return this.items[index];
			}
		}
		return null;
	}
}
