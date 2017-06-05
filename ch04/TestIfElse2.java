package ch04;

/*
 * 此範例說明Nested if - else流程觀念
 * 另使用equals進行比對字串示範
 */
public class TestIfElse2 {

	public static void main(String[] args) {
		int age = 29;
		String sex = "女"; // "男"

		if (age <= 29) 
			if (sex.equals("女"))
				System.out.println("我請妳看電影^_^");
			else
				System.out.println("謝謝再聯絡！");
		else
			System.out.println("謝謝再聯絡！");
		
		
		//可以改成以下寫法
		if (age <= 29 && sex.equals("女"))
			System.out.println("我請妳看電影^_^");
		else
			System.out.println("謝謝再聯絡！");

	}

}
