/*
Assume that a runner runs 24 miles in 1 hour, 40minutes, and 35 seconds. Write a program that displays the average speed in 
kilometers per hour. (Note 1 mile is equal to 1.6 kilometers）.
*/

package practice;

public class Ex1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double timetoh = (40*60 + 35)*1.0/3600;
		System.out.println(timetoh);
		double time = timetoh + 1;
		System.out.println(time);
		double average = (24 / time) * 1.6;
		
		System.out.println(average);
	}

}
