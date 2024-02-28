public class Q1Test {
    public static void main(String[] args) {

        Integer[][] matrix10 = {{1}, null};
        
        Integer[][] matrix0 = null;
        
        Integer[][] matrix1 = {{1}};
        
        Integer[][] matrix2 = {{1, 2, 3}};

        Integer[][] matrix3 = {{1, 2, 3},
                               {1, 2, 3}, 
                               {1, 2, 3},
                               {1, 2, 3},
                               {1, 2, 3},
                               {1, 2, 3},
                               {1, 2, 3},
                               {1, 2, 3},
                               {1, 2, 3}};

        Integer[][] matrix4 = {{1, 2, 3, 4, 5, 6, 7},
                               {8, 9, 10, 0, 0, 0, 5}, 
                               {3, 3, 3, 3, 3, 3, 3}};

        Integer[][] matrix5 = {{null}};

        Integer[][] matrix6 = {{null, null, null},
                               {null, null, null}};
 

        Integer[][] matrix7 = {{1, null, 3},
                               {1, 2, null}, 
                               {null, 2, 3},
                               {1, null, null},
                               {null, 2, null},
                               {null, null, 3}};
        
        Integer[][] matrix8 = {{1, 2, null, 4, 5, 6, 7},
                               {null, 2, 3, 4, 5, 6, null}, 
                               {1, 2, 3, null, 5, 6, null}};
                               
        Integer[][] matrix9 = {{1},
                               {null}, 
                               {1},
                               {1}};

        System.out.print("Result for matrix10: ");
        printArray(IntegerUtil.sumRows(matrix10));

        System.out.print("Result for matrix0: ");
        printArray(IntegerUtil.sumRows(matrix0));
                               
        System.out.print("Result for matrix1: ");
        printArray(IntegerUtil.sumRows(matrix1));
        
        System.out.print("Result for matrix2: ");
        printArray(IntegerUtil.sumRows(matrix2));

        System.out.print("Result for matrix3: ");
        printArray(IntegerUtil.sumRows(matrix3));

        System.out.print("Result for matrix4: ");
        printArray(IntegerUtil.sumRows(matrix4));

        System.out.print("Result for matrix5: ");
        printArray(IntegerUtil.sumRows(matrix5));

        System.out.print("Result for matrix6: ");
        printArray(IntegerUtil.sumRows(matrix6));

        System.out.print("Result for matrix7: ");
        printArray(IntegerUtil.sumRows(matrix7));

        System.out.print("Result for matrix8: ");
        printArray(IntegerUtil.sumRows(matrix8));
 
        System.out.print("Result for matrix9: ");
        printArray(IntegerUtil.sumRows(matrix9));

    }
    
    public static void printArray(Integer[] array) {
    	if (array == null) {
    		System.out.println("null");
    		
    		return;
    	}
        
        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            
            System.out.print(array[i]);            
        }
        System.out.println("]");
    }
}