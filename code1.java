public class Prep1 {
	int x=10;
	void meth1() {
		if(x > 0) {
			System.out.println("x is positive");
		}
		else {
			System.out.println("x is negative");
		}
	}
	public static void main(String[] args) {
		new Prep1().meth1();
	}
}
