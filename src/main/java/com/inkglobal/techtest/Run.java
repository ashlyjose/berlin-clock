package com.inkglobal.techtest;

public class Run {

	public static void main(String[] args) {

		BerlinClock berlinClock = new BerlinClock();
		String[] arr1 = berlinClock.convertToBerlinTime("00:00:00");
		String[] arr2 = berlinClock.convertToBerlinTime("13:17:01");
		String[] arr3 = berlinClock.convertToBerlinTime("23:59:59");
		String[] arr4 = berlinClock.convertToBerlinTime("24:00:00");
		
		System.out.print("\n\n 00:00:00 - " + arr1.toString());
		
		for (int index = 0; index < arr1.length; index++) {
            System.out.print(arr1[index] + " ");
        }
		
		System.out.print("\n\n 13:17:01 - " + arr2.toString());
		for (int index = 0; index < arr1.length; index++) {
            System.out.print(arr2[index] + " ");
        }
		
		System.out.print("\n\n 23:59:59 - " + arr3.toString());
		for (int index = 0; index < arr1.length; index++) {
            System.out.print(arr3[index] + " ");
        }
		
		System.out.print("\n\n 24:00:00 - " + arr4.toString());
		for (int index = 0; index < arr1.length; index++) {
            System.out.print(arr4[index] + " ");
        }
		
	}
	
	
	/*00:00:00 Y OOOO OOOO OOOOOOOOOOO OOOO
	13:17:01 O RROO RRRO YYROOOOOOOO YYOO
	23:59:59 O RRRR RRRO YYRYYRYYRYY YYYY
	24:00:00 Y RRRR RRRR OOOOOOOOOOO OOOO*/
	
}
