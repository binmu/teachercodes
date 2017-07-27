package teacher.hospitalsys;

public class Test {
	public static void main(String[] args){
		Hospital hos = new Hospital();
		Test.ini(hos);
		String checkName = "�ײ�A-B;��Ŀ001-003-010";
		String[] comboNames = checkName.substring(0,checkName.indexOf(";")).replace("�ײ�", "").split("-");
		
		Hospital targetHos = new Hospital();
		targetHos.comboCount = comboNames.length;
		for(int index = 0;index<targetHos.comboCount;index++){
			targetHos.combos[index] = hos.getComboByNo(comboNames[index]);
			System.out.println(hos.getComboByNo(comboNames[index]).price);
		}
		
		String[] itemNames = checkName.replaceAll( checkName.substring(0,checkName.indexOf(";")+1), "").replace("��Ŀ", "").split("-");
		targetHos.itemCount = itemNames.length;
		for(int index = 0;index<targetHos.itemCount;index++){
			targetHos.items[index] = hos.getItemByNo(itemNames[index]);
			System.out.println(hos.getItemByNo(itemNames[index]).price);
		}
	}
	
	public static void ini(Hospital hos){
		Item itemOne = new Item();
		itemOne.itemNo = "001";
		itemOne.name = "����";
		itemOne.remark = "������ķ������";
		itemOne.price = 5;
		Item itemTwo = new Item();
		itemTwo.itemNo = "002";
		itemTwo.name = "����";
		itemTwo.remark = "������ĸ�հԶ��";
		itemTwo.price = 10;
		Item itemThree = new Item();
		itemThree.itemNo = "003";
		itemThree.name = "����";
		itemThree.remark = "��������Ķ�ָ��";
		itemThree.price = 15;
		Item itemFour = new Item();
		itemFour.itemNo = "004";
		itemFour.name = "�ĵ�ͼ";
		itemFour.remark = "���������������ָ��";
		itemFour.price = 20;
		Item itemFive = new Item();
		itemFive.itemNo = "005";
		itemFive.name = "��Ѫ";
		itemFive.remark = "����������ߴ�����";
		itemFive.price = 100;
		Item itemSix = new Item();
		itemSix.itemNo = "006";
		itemSix.name = "����";
		itemSix.remark = "ͨ�����������";
		itemSix.price = 50;
		Item itemSeven = new Item();
		itemSeven.itemNo = "007";
		itemSeven.name = "CT";
		itemSeven.remark = "û����һ�����������";
		itemSeven.price = 200;
		Item itemEight = new Item();
		itemEight.itemNo = "008";
		itemEight.name = "�˴Ź���";
		itemEight.remark = "CBA��Աר��";
		itemEight.price = 550;
		Item itemNine = new Item();
		itemNine.itemNo = "009";
		itemNine.name = "ɫä";
		itemNine.remark = "��ä�����ǲ�һ��";
		itemNine.price = 15;
		Item itemTen = new Item();
		itemTen.itemNo = "010";
		itemTen.name = "θ��";
		itemTen.remark = "���������ײ�Ҫ����";
		itemTen.price = 300;
		Item itemEleven = new Item();
		itemEleven.itemNo = "011";
		itemEleven.name = "����";
		itemEleven.remark = "��һ�վ�֪�����ж��ٻ�������";
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
