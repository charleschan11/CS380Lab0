package packagetest;

public class CS380_Lab0 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("First Lab CS 380 \n");
			int x = 12345;
			int y = 0;
			System.out.println("Given Number " + x);
			while(x!=0) {
				int digit = x % 10;
				y = y * 10 + digit;
				x /= 10;
			}
			System.out.println("Reverse Number " + y);
			
		}
}