package com.test04;

public class StarPrn {

	public void prn01() {
		// ＊
		// ＊＊
		// ＊＊＊
		// ＊＊＊＊
		// ＊＊＊＊＊

		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < i + 1; j++) {
			
				System.out.print("* ");
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------");

	}
	

	public void prn02() {
		// ＊＊＊＊＊
		// ＊＊＊＊
		// ＊＊＊
		// ＊＊
		// ＊

		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5 - i; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------");

	}

	
	public void prn03() {
		//         ＊
		//       ＊＊
		//     ＊＊＊
		//   ＊＊＊＊
		// ＊＊＊＊＊
		
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print("  ");
			}
				
			for (int k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("--------------------------------");
	}
	
	public void prn04() {
		// ＊＊＊＊＊
		//   ＊＊＊＊
		//     ＊＊＊
		//       ＊＊
		//         ＊

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
				
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("--------------------------------");
	}

	
	public void prn05() {
		//         ＊
		//       ＊＊＊
		//     ＊＊＊＊＊
		//   ＊＊＊＊＊＊＊
		// ＊＊＊＊＊＊＊＊＊
		
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print("  ");
			}

			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		
	}

}
