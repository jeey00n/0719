package practice;

public class Main {

	public static void main(String[] args) {
		Object obj = new Object();
		//obj�� �ν��Ͻ��� toString ����� ���
		//Ǯ�°�� java.lang.Object@�ؽ��ڵ�
		System.out.println(obj);
		System.out.println(obj.toString());
		
		Integer i = 100;
		//toString�� ��� -> �����ϰ� �ִ� ������ 100
		System.out.println(i);
		System.out.println(i.toString());
		
		//����Ŭ���� Ÿ���� ������ ������ ����Ŭ���� Ÿ���� �ν��Ͻ� ������ ������ �� �ִ�.
		Object str = "Hello World";
		//��¸� �� ���� ����ȯ���� ����ص� �ȴ�.
		//toString()�� Object�� ������ �����Ƿ� ȣ���� �� �ֱ� �����̴�.
		System.out.println(str);
		//Object Ÿ���� ������ ����� ���� �����ϰ�� �Ʒ�ó�� ������ �ڷ������� ���� ����ȯ�ؼ� ���
		String imsi = (String)str;
		for(int j = 0; j<imsi.length(); j++) {
			
		}
	}
}
