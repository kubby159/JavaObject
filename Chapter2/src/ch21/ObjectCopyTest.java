package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		// ���� ���� : ���� �ּҰ��� ���� ��ü�� ����
//		System.arraycopy(library, 0, copyLibrary, 0, 5);
//
//		System.out.println("== library ==");
//		for (Book bookTitle : library) {
//			bookTitle.showInfo();
//		}

		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();

		// ���� ���� : �ٸ� �ּҰ��� ���� ��ü�� ����
		for (int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}

		library[0].setAuthor("�ڿϼ�");
		library[0].setTitle("����");
		System.out.println("==  library ==");
		for (Book bookTitle : library) {
			System.out.println(bookTitle);
			bookTitle.showInfo();
		}

		System.out.println("== copy library ==");
		for (Book bookTitle : copyLibrary) {
			System.out.println(bookTitle);
			bookTitle.showInfo();
		}
	}

}
