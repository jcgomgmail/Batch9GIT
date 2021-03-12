package com.class8;

public class TExamples {

	public static void main(String[] args) {
		char ch;
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				if ((x == 1 && y == 1) || (x == 1 && y == 2) || (x == 2 && y == 1) || (x == 2 && y == 2)) {
					ch = ' ';
				} else {
					ch = '$';
				}
				System.out.print(ch);
			}
			System.out.println();
		}
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 10; j++) {
		// System.out.print(i);
		// System.out.println(j);
		// }
		// }

		// for (int hour = 0; hour < 24; hour++) {
		// for (int min = 0; min < 60; min++) {
		// if (hour < 10) {
		// System.out.print("0");
		// }
		// System.out.print(hour + ":");
		// if (min < 10) {
		// System.out.print("0");
		// }
		// System.out.println(min);
//
//			}
//		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);

			}
			System.out.println();
		}
		
		System.out.print("* * * *  *     *      * *      *    *        *       *     * *      * ");
		
		System.out.println();
		
		System.out.print("*        *     *    *     *    *  *           *     *    *     *    *     * ");
	
	System.out.println();

		System.out.print("*        *     *   *           * *             *   *    *       *   *     *");
	
		System.out.println();
	System.out.print("* * *    *     *   *           *                 *      *       *   *     *");
	
			System.out.println();
	
			System.out.print("* 	 *     *   *           * *               *      *       *   *     *");
	
	System.out.println();
		
			System.out.print("*         *   *     *     *    *  *              *       *     *     *   *");
	
			System.out.println();
	
	System.out.print("*          * *        * *      *    *            *         * *        * *");
		

	}
}
