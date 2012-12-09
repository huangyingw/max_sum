import java.io.IOException;

public class MaxSum {
	private Log log;

	public MaxSum() throws IOException {
		super();
		this.log = new Log("log.txt");
	}

	public int max_sum_subsequence(int[] seq) throws IOException {
		int maxsofar = 0;
		int maxendinghere = 0;
		for (int s : seq) {
			maxendinghere = Math.max(maxendinghere + s, 0);
			maxsofar = Math.max(maxsofar, maxendinghere);
		}
		return maxsofar;
	}

	public int max_sum(int[] seq) throws IOException {
		int maxsofar = 0;
		int maxendinghere = 0;
		for (int s : seq) {
			maxendinghere = Math.max(maxendinghere + s, 0);
			maxsofar = Math.max(maxsofar, maxendinghere);
		}
		return maxsofar;
	}

	public static void main(String[] args) throws IOException {
		MaxSum mSum = new MaxSum();
		int[] data = { 0, 1, 2, -3, 3, -1, 0, -4, 0, -1, -4, 2, 4, 1, 1, 3, 1,
				0, -2, -3, -3, -2, 3, 1, 1, 4, 5, -3, -2, -1 };
		data = new int[] { 0, 1, 2, -3, 3, -1, 0, -4, 0, -1, -4, 2, 4, 1, 1, 3,
				1, 0, -2, -3, -3, -2, 3, 1, 1, 4, 5, -3, -2, -1 };
		System.out.println(mSum.max_sum_subsequence(data));

		data = new int[] { -1, -2, 1, 1, -3, 5 };
		System.out.println(mSum.max_sum_subsequence(data));

		data = new int[] { 0, 1, 2, -3, 3, -1, 0, -4, 0, -1, -4, 2, 4, 1, 1, 3,
				1, 0, -2, -3, -3, -2, 3, 1, 1, 4, 5, -3, -2, -1 };
		System.out.println(mSum.max_sum(data));

		data = new int[] { -1, -2, 1, 1, -3, 5 };
		System.out.println(mSum.max_sum(data));

		data = new int[] { -1 };
		System.out.println(mSum.max_sum(data));

		data = new int[] { -1, -1, -1 };
		System.out.println(mSum.max_sum(data));

		data = new int[] { 1, 1, 1 };
		System.out.println(mSum.max_sum(data));
	}
}
