public class ArrayContainer {
	String[] array;
	
	public ArrayContainer(String[] array) {
		this.array = array;
	}
	
	public boolean equals(Object o) {

		if (o == null) {
			return false;
		}
		
		if (this.getClass() != o.getClass()) {
			return false;
		}
	
		ArrayContainer other = (ArrayContainer) o;
		
		if (this.array == null && other.array == null) {
			return true;
		}
		
		if (this.array == null || other.array == null) {
			return false;
		}
		
		if (this.array.length != other.array.length) {
			return false;
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null && other.array[i] != null) {
				return false;
			}
			if (array[i] != null && !array[i].equals(other.array[i])) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main (String[] args) {
	
		String[] input0 = null;
		String[] input1 = {null, null, null};
		String[] input2 = {"a", null, "c"};
		String[] input3 = {"a", "b", "c"};
		String[] input4 = {"a", "b", "c"};
		String[] input5 = {"d", "e", "f"};
		String[] input6 = {"a", "b"};
		
		ArrayContainer array1, array2;
		
		array1 = new ArrayContainer(input0);
		array2 = new ArrayContainer(input0);
		System.out.println(array1.equals(array2)); // true
		
		array1 = new ArrayContainer(input3);
		array2 = new ArrayContainer(input4);
		System.out.println(array1.equals(array2)); // true
		
		array1 = new ArrayContainer(input0);
		array2 = new ArrayContainer(input1);
		System.out.println(array1.equals(array2)); // false
		
		array1 = new ArrayContainer(input2);
		array2 = new ArrayContainer(input3);
		System.out.println(array1.equals(array2)); // false

		array1 = new ArrayContainer(input4);
		array2 = new ArrayContainer(input5);
		System.out.println(array1.equals(array2)); // false

		array1 = new ArrayContainer(input4);
		array2 = new ArrayContainer(input6);
		System.out.println(array1.equals(array2)); // false
	}
}