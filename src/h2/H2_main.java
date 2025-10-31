package h2;

public class H2_main {
	public static void main(String[] args) {
		int i, j, k, min, max;
		i = 1;
		j = 2;
		k = 3;
		min = 0;
		max = 5;
		if (i < j & i < k) {
			min = i;
		} else if (j < k & j < i) {
			min = j;
		} else if (k < j & k < i) {
			min = k;
		}
		System.out.println("i:"+i+ " j:"+j+ " k:"+k );
		System.out.println("Minimum:" + min);

		if (i > j & i > k) {
			max = i;
		} else if (j > k & j > i) {
			max = j;
		} else if (k > j & k > i) {
			max = k;
		}
		System.out.println("i:"+i+ " j:"+j+ " k:"+k );
		System.out.println("Maximum:" + max);

	}
}
