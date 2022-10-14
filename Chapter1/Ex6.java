/*
Write a program that displays the result of
  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
*/

package practice;

public class Ex1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <=9; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
