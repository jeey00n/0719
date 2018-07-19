package practice;

public class Main {

	public static void main(String[] args) {
		Object obj = new Object();
		//obj의 인스턴스의 toString 결과를 출력
		//풀력결과 java.lang.Object@해시코드
		System.out.println(obj);
		System.out.println(obj.toString());
		
		Integer i = 100;
		//toString의 결과 -> 저장하고 있는 데이터 100
		System.out.println(i);
		System.out.println(i.toString());
		
		//상위클래스 타입의 참조형 변수에 하위클래스 타입의 인스턴스 참조를 대입할 수 있다.
		Object str = "Hello World";
		//출력만 할 때는 형변환없이 사용해도 된다.
		//toString()은 Object가 가지고 있으므로 호출할 수 있기 때문이다.
		System.out.println(str);
		//Object 타입의 변수는 출력할 때를 제외하고는 아래처럼 원래의 자료형으로 강제 형변환해서 사용
		String imsi = (String)str;
		for(int j = 0; j<imsi.length(); j++) {
			
		}
	}
}
