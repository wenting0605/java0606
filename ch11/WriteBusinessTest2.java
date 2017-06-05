package ch11;

public class WriteBusinessTest2 {

	public static void main(String[] args) {
		WorkWithPens2 business1 = new WorkWithPens2();
		business1.setWritable(new Pencil2());
		business1.writeWithPens();
		
		WorkWithPens2 business2 = new WorkWithPens2();
		business2.setWritable(new InkBrush2());
		business2.writeWithPens();
	}

}
