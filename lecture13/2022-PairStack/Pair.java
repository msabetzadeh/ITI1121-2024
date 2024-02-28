public class Pair<X> {
	private X first;
	private X second;
	
	public Pair(X first, X second) {
		this.first = first;
		this.second = second;
	}
	
	public X getFirst() {
		return first;
	}
	
	public X getSecond() {
		return second;
	}
	
	public String toString() {
		return "(" + first + "," + second + ")";
	}
}