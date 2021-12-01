
public class FibonocciEven {

	public static void main(String[] args) {
		int t1 = 1, t2 = 2, sum = 0, e = 0;
		for (int i = 0; i <= 28; i++) {
			sum = t2 + t1;
			t1 = t2;
			t2 = sum;
			if (sum % 2 == 0) {
				System.out.println(sum);
				e = e + sum;
			}
		}
		System.out.println("-------------");
		System.out.println(e);
	}
}
