package SampleReport;

public class Compare {

	public static void main(String[] args) {
		int  a = 9;
		String b = "10";
		int x = Integer.parseInt(b);
		System.out.println(x-a);
		
		System.out.println(x);
		//System.out.println(y);
		if(!(a==x)) {
			System.out.println("a!=b");
		}
		System.out.println(x>a);
		
//		if(a.compareTo(b)==1) {
//			System.out.println("in loop");
//		
//		
//		}
		
	}
}
