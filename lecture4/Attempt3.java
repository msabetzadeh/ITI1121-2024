public class Attempt3 {
	

	public static void main(String[] args){

		// first point
		Point p1 = new Point(0,3);

		// second point
		Point p2 = new Point(1,1);
		System.out.println(p1.equal(p2));

		Point p3 = Point.add(p1,p2);
				
		System.out.println(p3);

	}
}
