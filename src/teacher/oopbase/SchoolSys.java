package teacher.oopbase;

//���������
//1.ÿһ��ʱ���ͬʱ��У��
//2.����Ա���Ļ�����Ϣ
//3.��¼ÿ���༶�Ĵ����飺���ࡢ�׶ν�����90%��ҵʱ���
//4.��¼��ʦ�Ͽε�¼���ϴ�
//5.��¼ͬѧ���ճ���ҵ��һЩ���
//�������˼������Ĳ��裺
//1.Ѱ����Ҫ�����ʣ�ѧ�� Ա�� �༶ �������� ��¼�� ��ҵ
//2.Ѱ�����ʵ���������
//3.��������һ�����ܣ�����ѧ������ѧ
//3.1�Ѵ�������д����������ֻ��ѧ����ѧУ����Ϊʵ�������е���Ϣװ�صĹ���
//3.2ѧУ��������ѧ����ѧ�ķ�����Ҳ�Ǻ������ģ�������ֲ��School��
//3.3boolean�����Է���̫�����Ϣ�����Ǿͷ������ַ��������ܺʹ�ӡ���룬����Ӧ�÷ֲ��ڸ������У���ӡӦ������������)
//3.4���ǵ�������ҵ������������ʾӦ����ͳһ�Ĺ涨�ͷ�񣬹ʶ�������Result������¼�������͵Ľ������ʾ�ͱ�ŵȣ�ģ��SQLServer������ʾϵͳ

//����+����
//��װ��������ֲ�Ժò��õ���Ҫ��־
//�̳�:��������ӵ�ҵ��ģ�;������Ҫ��ʽ
//��̬:ʵ�־�����������
public class SchoolSys {
	public static void main(String[] args){
		
		School sch = new School();
		System.out.println("��ӭʹ��ѧУ����ϵͳ");
		System.out.println("��ѡ����Ҫʹ�õĹ���");
		System.out.println("1.ѧ������");
//		if(sch.addStu("xiapeng", 18, 'M')){
//			System.out.println("��ѧ�ɹ�");
//		}else{
//			System.out.println("��ѧʧ��");
//		}
		System.out.println(sch.addStu("xiapeng", 18, 'M').resultContent);
//		Student stu = new Student();		
//		stu.name = "xiapeng";
//		stu.age = 18;
//		stu.cardNo = "320981199909190471";
//		stu.sex = 'M';
//		stu.studentNo = "CZ2017QD032";
//		stu.subjectName = "Java";
//		sch.studentActCount++;
//		sch.stus[sch.studentActCount-1] = stu;
//		System.out.println("��ѧ�ɹ�");
//		sch.stus[sch.studentActCount-1].name = "wangpeng";
		//�������͵Ķ�����и�ֵ��ʱ�򣬾��ǽ��������Ͷ�����׵�ַ��ֵ���Է����öԷ����Լ���ָͬ��ͬһ���ڴ��ַ
		//�ʶ����֣��޸��Ժ����߶������˱仯
		//�������������������ı����Ͳ�����ˣ���������Ҳ��������֮Ϊֵ���͵ı�������Ϊ���Ǹ�ֵ�ȵȲ���������Ե���ֵ�������ǵ�ַ
		//sch.stus[sch.studentActCount-1] = stu;
		//0x66�ĵ�ַ��ֵ�����������ĵ�һ��Ԫ��
//		stu = new Student();
//		System.out.println(stu.name);
//		System.out.println(sch.stus[sch.studentActCount-1].name);
		
		System.out.println("2.Ա������");
		System.out.println("3.�༶����");
		System.out.println("4.¼���ϴ�����");
		System.out.println("5.��ҵ�鿴����");
	}
}

