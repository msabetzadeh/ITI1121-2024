public class Test {

	public static void main (String[] args) {
	
		Account a1 = new Account (1, "Jane");	
		Account a2 = new Account (1, "John");	
		
		System.out.println(a1.equals(a2));
	}
}