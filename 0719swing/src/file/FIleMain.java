package file;

import java.io.File;
import java.sql.Date;

public class FIleMain {

	public static void main(String[] args) {
		// ���Ͽ� ���� ������ Ȯ���� �� �ִ� Ŭ������ �ν��Ͻ��� ����
		File f = new File("C:\\Users\\503-20\\Documents\\������\\0702~�ڹ�\\16.IO.pptx");
		// ������ ���� ����
		System.out.println(f.exists());
		// ������ ũ��
		long size = f.length();
		System.out.println((size / 1024) + "KB");

		// ������ ���� �����ð�
		Date date = new Date(f.lastModified());
		System.out.println(date);

		File file = new File("C:\\Users\\503-20\\Documents\\������\\0702~�ڹ�\\16.IO.pptx");
		String parent = file.getParent();
		String filename = file.getName();
		// filename���� 15.�� ������ �κ��� ��������
		int idx = filename.indexOf('.');
		// .�� �����Ѵٸ� �ش� ��ġ�� ����.
		//������ ã���� �ϴ� �����Ͱ� ������ ������ ����.
		System.out.println(idx);
		if (idx >= 0) {
			// ���ڿ��� ��ġ�� ������ �ڸ��� �޼ҵ�� substring
			filename = filename.substring(idx + 1);
			//filename = filename.substring(�� ��ġ����, �� ��ġ�� �ٷ� �պκб��� �߶��ִ� ��);
			//��ȣ�� ������ �ڸ� �� split�� ����Ѵ�. ��ġ�� ����ϴ� ���� substring.
		}
		System.out.println(filename);
//		�̸��� ������ �ٲٱ�
//		String newFile = parent + filename;
//		file.renameTo(new File(parent, filename));

	}

}
