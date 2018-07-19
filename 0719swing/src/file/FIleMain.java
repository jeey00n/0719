package file;

import java.io.File;
import java.sql.Date;

public class FIleMain {

	public static void main(String[] args) {
		// 파일에 대한 정보를 확인할 수 있는 클래스의 인스턴스를 생성
		File f = new File("C:\\Users\\503-20\\Documents\\정지윤\\0702~자바\\16.IO.pptx");
		// 파일의 존재 여부
		System.out.println(f.exists());
		// 파일의 크기
		long size = f.length();
		System.out.println((size / 1024) + "KB");

		// 파일의 최후 수정시간
		Date date = new Date(f.lastModified());
		System.out.println(date);

		File file = new File("C:\\Users\\503-20\\Documents\\정지윤\\0702~자바\\16.IO.pptx");
		String parent = file.getParent();
		String filename = file.getName();
		// filename에서 15.을 제거한 부분을 가져오기
		int idx = filename.indexOf('.');
		// .이 존재한다면 해당 위치를 리턴.
		//하지만 찾고자 하는 데이터가 없으면 음수를 리턴.
		System.out.println(idx);
		if (idx >= 0) {
			// 문자열을 위치를 가지고 자르는 메소드는 substring
			filename = filename.substring(idx + 1);
			//filename = filename.substring(이 위치부터, 이 위치의 바로 앞부분까지 잘라주는 것);
			//기호를 가지고 자를 땐 split을 사용한다. 위치를 사용하는 것은 substring.
		}
		System.out.println(filename);
//		이름을 실제로 바꾸기
//		String newFile = parent + filename;
//		file.renameTo(new File(parent, filename));

	}

}
