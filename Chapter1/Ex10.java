/*
Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per 
hour. (Note 1 mile is equal to 1.6 kilometers).
*/

package practice;

/*
 mins must convert to second for 30s converting.
 Otherwise the denominator will approach to zero, which brings the rst to infinity. 
 */

public class Ex1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kmtom = 14/1.6;
		double mintos = 45 * 60;
		double stoh = (mintos + 30) /3600;
		
		double average = kmtom  /  stoh;
		System.out.println(average);
	}

}
