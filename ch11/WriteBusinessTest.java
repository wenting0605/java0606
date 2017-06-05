package ch11;

public class WriteBusinessTest {
	public static void main(String[] args) {
		WorkWithPens business1 = new WorkWithPens();
		business1.setPencil(new Pencil());
		business1.writeWithPencil();
		
		WorkWithPens business2 = new WorkWithPens();
		business2.setInkBrush(new InkBrush());
		business2.writeWithInkBrush();
	}
}
