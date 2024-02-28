public class MyArrayStack<E> extends ArrayStack<E> {

	public Stack<Pair<E>> pairUp() {
		
		Stack<Pair<E>> reverseOutput = new ArrayStack<Pair<E>>();
		Stack<E> reverseStack = new ArrayStack<E>();
		
		while (!this.isEmpty()) {
			E elem = pop();
			Pair<E> pair = new Pair<E>(elem, elem);
			reverseOutput.push(pair);
			reverseStack.push(elem);
		}
		
		while (!reverseStack.isEmpty()) {
			this.push(reverseStack.pop());
		}
		
		Stack<Pair<E>> output = new ArrayStack<Pair<E>>();
		
		while (!reverseOutput.isEmpty()) {
			output.push(reverseOutput.pop());
		}
		
		return output;
	
	}
}