package ch09;

public class TestCount {

	public static void main(String[] args) {
		System.out.println("起始數量:" + Count.getTotalCount() + "\n");

		Count count1 = new Count();
		System.out.println("累計數量:" + Count.getTotalCount());
		System.out.println("序號:" + count1.getSerialNumber() + "\n");

		Count count2 = new Count();
		System.out.println("累計數量:" + Count.getTotalCount());
		System.out.println("序號:" + count2.getSerialNumber() + "\n");
	}

}
