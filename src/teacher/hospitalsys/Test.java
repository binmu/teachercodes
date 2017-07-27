package teacher.hospitalsys;

public class Test {
	public static void main(String[] args){
		Hospital hos = new Hospital();
		Test.ini(hos);
		String checkName = "套餐A-B;项目001-003-010";
		String[] comboNames = checkName.substring(0,checkName.indexOf(";")).replace("套餐", "").split("-");
		
		Hospital targetHos = new Hospital();
		targetHos.comboCount = comboNames.length;
		for(int index = 0;index<targetHos.comboCount;index++){
			targetHos.combos[index] = hos.getComboByNo(comboNames[index]);
			System.out.println(hos.getComboByNo(comboNames[index]).price);
		}
		
		String[] itemNames = checkName.replaceAll( checkName.substring(0,checkName.indexOf(";")+1), "").replace("项目", "").split("-");
		targetHos.itemCount = itemNames.length;
		for(int index = 0;index<targetHos.itemCount;index++){
			targetHos.items[index] = hos.getItemByNo(itemNames[index]);
			System.out.println(hos.getItemByNo(itemNames[index]).price);
		}
	}
	
	public static void ini(Hospital hos){
		Item itemOne = new Item();
		itemOne.itemNo = "001";
		itemOne.name = "体重";
		itemOne.remark = "看出你的肥胖情况";
		itemOne.price = 5;
		Item itemTwo = new Item();
		itemTwo.itemNo = "002";
		itemTwo.name = "视力";
		itemTwo.remark = "看出你的高瞻远瞩";
		itemTwo.price = 10;
		Item itemThree = new Item();
		itemThree.itemNo = "003";
		itemThree.name = "脉搏";
		itemThree.remark = "看出你的心动指数";
		itemThree.price = 15;
		Item itemFour = new Item();
		itemFour.itemNo = "004";
		itemFour.name = "心电图";
		itemFour.remark = "看出你的内在心跳指数";
		itemFour.price = 20;
		Item itemFive = new Item();
		itemFive.itemNo = "005";
		itemFive.name = "抽血";
		itemFive.remark = "年纪轻轻三高带上了";
		itemFive.price = 100;
		Item itemSix = new Item();
		itemSix.itemNo = "006";
		itemSix.name = "验尿";
		itemSix.remark = "通过输出看输入";
		itemSix.price = 50;
		Item itemSeven = new Item();
		itemSeven.itemNo = "007";
		itemSeven.name = "CT";
		itemSeven.remark = "没事照一照身体更健康";
		itemSeven.price = 200;
		Item itemEight = new Item();
		itemEight.itemNo = "008";
		itemEight.name = "核磁共振";
		itemEight.remark = "CBA球员专属";
		itemEight.price = 550;
		Item itemNine = new Item();
		itemNine.itemNo = "009";
		itemNine.name = "色盲";
		itemNine.remark = "是盲还是狼测一测";
		itemNine.price = 15;
		Item itemTen = new Item();
		itemTen.itemNo = "010";
		itemTen.name = "胃镜";
		itemTen.remark = "很难受轻易不要尝试";
		itemTen.price = 300;
		Item itemEleven = new Item();
		itemEleven.itemNo = "011";
		itemEleven.name = "肠镜";
		itemEleven.remark = "照一照就知道你有多少花花肠子";
		itemEleven.price = 105;
		
		Combo comOne = new Combo();
		comOne.comboNo = "A";
		comOne.items[0] =itemOne;
		comOne.items[1] =itemThree;
		comOne.items[2] =itemFive;
		comOne.items[3] =itemSeven;
		comOne.items[4] =itemNine;
		comOne.items[5] =itemEleven;
		comOne.itemCount = 6;
		comOne.calPrice();
		
		Combo comTwo = new Combo();
		comTwo.comboNo = "B";
		comTwo.items[0] =itemTwo;
		comTwo.items[1] =itemFour;
		comTwo.items[2] =itemSix;
		comTwo.items[3] =itemEight;
		comTwo.items[4] =itemTen;
		comTwo.itemCount = 5;
		comTwo.calPrice();
		
		Combo comThree = new Combo();
		comThree.comboNo = "C";
		comThree.items[0] =itemTwo;
		comThree.items[1] =itemFour;
		comThree.items[2] =itemSeven;
		comThree.items[3] =itemNine;
		comThree.items[4] =itemEleven;
		comThree.itemCount = 5;
		comThree.calPrice();
		
		hos.comboCount = 3;
		hos.combos[0] =comOne;
		hos.combos[1] =comTwo;
		hos.combos[2] =comThree;
		hos.itemCount = 11;
		hos.items[0] =itemOne;
		hos.items[1] =itemThree;
		hos.items[2] =itemFive;
		hos.items[3] =itemSeven;
		hos.items[4] =itemNine;
		hos.items[5] =itemEleven; 
		hos.items[6] =itemTwo;
		hos.items[7] =itemFour;
		hos.items[8] =itemSix;
		hos.items[9] =itemEight;
		hos.items[10] =itemTen;
		
	}
}
