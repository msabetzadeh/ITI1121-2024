public class IntegerUtil {

	public static Integer[] sumRows (Integer[][] matrix) {
		if (matrix == null) {
			return null;
		}
		Integer[] result = new Integer[matrix.length];
		
		for (int i = 0; i < matrix.length; i++) {
			int temp = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				int toAdd = 0;
				if (matrix[i][j] != null) {
					toAdd = matrix[i][j];
				}
				temp += toAdd;
			}
			
			result[i] = temp;
		}
		
		return result;
	}

}