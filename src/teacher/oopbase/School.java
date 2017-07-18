package teacher.oopbase;


public class School {
	public int studentActCount = 0;
	public Student[] stus = new Student[3];
	public Teacher[] teas = new Teacher[3];
	public Result[] results = new Result[3];
	public School(){
		Result resultOne = new Result();
		resultOne.isRight = true;
		resultOne.resultNo = 10000;
		resultOne.resultContent = "千辛万苦来入学，你说结果呢";
		Result resultTwo = new Result();
		resultTwo.isRight = true;
		resultTwo.resultNo = 10001;
		resultTwo.resultContent = "年纪轻轻来入学，你说结果呢";
		Result resultThree = new Result();
		resultThree.isRight = true;
		resultThree.resultNo = 10002;
		resultThree.resultContent = "人满为患来入学，你说结果呢";
		this.results[0] = resultOne;
		this.results[1] = resultTwo;
		this.results[2] = resultThree;
	}
	
	
	public Result addStu(String name,int age,char sex){
		boolean isAdd = true;
		if(this.studentActCount >= this.stus.length){
			return this.results[2];
		}
		if(age < 18){
			return this.results[1];
		}
		Student stu = new Student();
		stu.name = name;
		stu.age = age;
		stu.sex = sex;
		this.studentActCount++;
		this.stus[this.studentActCount -1] =stu;
		return this.results[0];
	}
}

