public class Graphics {

	public static void displayAll(Displayable[] myArray) {
	
		for (int i = 0; i < myArray.length; i++) {
			myArray[i].display();
		}
	}

}