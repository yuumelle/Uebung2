package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 101, j = 8, k = -10;
		
		boolean t1 = i > j;
		boolean t2 = i > 200;
		boolean t3 = j > 100;

		if (t1 & !t2 & !t3) {
			k = 1;
		}else if (t1 & t2 & !t3) {
				k = 2;
		}else if (t1 & t2 & t3) {
					k = 3;
		}else if (!t1 & !t2 & !t3) {
						k = 4;

					}
				 else {
					k = -10;
				}
				System.out.println("k: " + k);
			}
		
	}

