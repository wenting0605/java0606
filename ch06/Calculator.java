package ch06;
/*
 * 建立方法並觀察參數傳遞與回傳值
 * 搭配TestCalculator.java一起使用
 */
public class Calculator {
	
	public int sum(int x, int y){
	     System.out.println("method-1");
	     return x + y;
	   }
	  
	  public float sum(float x, int y) {
	     System.out.println("method-2");
	     return x + y;
	  }
	  
	  public float sum(int x, float y) {
	    System.out.println("method-3");
	    return x + y;
	  }
	
}
