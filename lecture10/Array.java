public class Array {
	public static void sort2 (Comparable[] myArray) {
	
		if (myArray[0].compareTo(myArray[1]) > 0) {
			Comparable temp;
			temp = myArray[0];
			myArray[0] = myArray[1];
			myArray[1] = temp;
		}
	}
}