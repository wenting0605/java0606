package ch05;

/*
 * 巢狀迴圈應用，寫九九乘法表
 */
public class NineNineLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++){
				System.out.print(i + "*" + j + "=" + i * j +"   ");}
				//System.out.print(i);
				//System.out.print(j);}
			  System.out.println();
		}
	}

}
