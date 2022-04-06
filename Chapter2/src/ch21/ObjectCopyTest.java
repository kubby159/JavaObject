package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		// 얕은 복사 : 같은 주소값을 가진 객체를 만듬
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

		// 깊은 복사 : 다른 주소값을 가진 객체를 만듬
		for (int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}

		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
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
