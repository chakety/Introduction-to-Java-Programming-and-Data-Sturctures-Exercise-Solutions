/*
 p can be computed using the following formula:
p = 4 * (1 - 1/3+1/5 - 1/7+1/9 - 1/11+......)
Write a program that displays the result of 4 * (1 - 1/3+1/5 - 1/7+1/9 - 1/11)
  and 4 * (1 - 1/3+1/5 - 1/7+1/9 - 1/11+1/13). 
  Use 1.0 instead of 1 in your program.

*/

package practice;

public class Ex1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rst, rst1 = 0;
		rst = 4*(1.0 - 1.0/3 +1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
		rst1 = 4* (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 -1.0/11 +1.0/13);
		System.out.println(rst);
		System.out.println(rst1);
		
	}

}
