/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Methods and classes
 * Lecture  : http://youtu.be/ogNt7tkJoM8
 * Tutorial : http://youtu.be/DEMjd4LmsSU
 * License  : None.  Do with it as you wish! :)
 */

public class Main {
	public static void main (String[] args) {
		float edge1 = 4.0f;
		float edge2 = 3.0f;
		float edge3 = 2.0f;
		float edge4 = 3.0f; //not needed
		float edge5 = 2.0f;
		float edge6 = 6.0f;
		float edge7 = 8.0f; // not needed
		float edge8 = 6.0f;
		
		float area1 = multiply2Numbers(edge1, edge8);
		
		float edge9 = edge8 - edge2;
		float area2 = multiply2Numbers(edge9, edge3);
		
		float area3 = multiply2Numbers(edge5, edge6);
	
		float area1AndArea2 = add2Numbers(area1, area2);
		float totalArea = add2Numbers(area3, area1AndArea2);

		System.out.println(totalArea);
	}
	
	public static float add2Numbers(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float multiply2Numbers(float num1, float num2) {
		return num1 * num2;
	}
}
