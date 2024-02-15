public class Test {

	public static void main (String[] args) {
		Circle t1 = new Circle (0, 0, 5);
		Time t2 = new Time();
		
		Pair<Shape,Time> p = new Pair<Shape,Time> (t1, t2);
		
		Shape t = p.getFirst();	
		Pair<Integer, String> p1 = new Pair<Integer, String>(123, "John Doe");
			
		String[] a1 = {"string1"};
		String[] a2 = {"string2"};
				
		Pair<String[],String[]> p3 = new Pair<String[], String[]>(a1, a2);
		
/*
		Shape c = new Circle (0, 0, 5);
		System.out.println(c.compareTo(t));
		
		System.out.println(((Circle)c).getRadius());


		Rectangle r1 = new Rectangle (2, 4, 10, 15);
		Circle c1 = new Circle (0, 0, 5);
		
		Shape[] array = new Shape[2];
		array[0] = r1;
		array[1] = c1;
		
		System.out.println("Before");
		Graphics.displayAll(array);
		
		Array.sort2(array);
		
		System.out.println("After");
		Graphics.displayAll(array);
*/
	}
}