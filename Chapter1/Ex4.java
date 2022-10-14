/*
 Write a program that displays the following table:

  a a^2 a^3
  1  1   1
  2  4   8
  3  9   27
  4 16   64
*/

package practice;
import java.util.Formatter;

public class Ex1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4};
		Formatter fmt = new Formatter();
		fmt.format("%15s %15s %15s\n", "a","a^2","a^3");
		for(int i : num) {
			fmt.format("%15s %15s %17s\n", i,i*i,i*i*i);
		}
		System.out.println(fmt);
	}

}
