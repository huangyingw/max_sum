public class MaxSum {
	public static int max_sum_subsequence(int[] seq) {
		int maxsofar = 0;
		int maxendinghere = 0;
		for (int s : seq) {
			maxendinghere = Math.max(maxendinghere + s, 0);
			System.out.println(maxendinghere);
			maxsofar = Math.max(maxsofar, maxendinghere);
			System.out.println(maxsofar);
			System.out.println();
		}
		return maxsofar;
	}

	public static void main(String[] args) {
		int[] data = { 0, 1, 2, -3, 3, -1, 0, -4, 0, -1, -4, 2, 4, 1, 1, 3, 1,
				0, -2, -3, -3, -2, 3, 1, 1, 4, 5, -3, -2, -1 };
		System.out.println(max_sum_subsequence(data));
	}
}
