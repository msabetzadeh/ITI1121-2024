public class Q2Test {

	public static void main(String[] args) {

		MyArrayStack<Integer> integerStack = new MyArrayStack<Integer>();
		integerStack.push(0);
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);

		System.out.println("Original Integer stack: " + integerStack);
		System.out.println("Result of pairUp(): " + integerStack.pairUp());
		System.out.println("Original Integer stack (after pairUp): " + integerStack);

		System.out.println();

		MyArrayStack<String> stringStack = new MyArrayStack<String>();
		stringStack.push("a");
		stringStack.push("b");
		stringStack.push("c");
		stringStack.push("d");
		stringStack.push("e");

		System.out.println("Original String stack: " + stringStack);		
		System.out.println("Result of pairUp(): " + stringStack.pairUp());
		System.out.println("Original String stack (after pairUp): " + stringStack);
	}
}
