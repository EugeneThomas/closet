// Eugene Thomas
// APCS1 pd3
// HW38 -- Arrays of Arrays 
// 2016-12-1


// Objective: To create various methods that test our knowledge of two-dimensional arrays. 

public class TwoDimArray {

   
    // print1 (int[][] a): A method that utilizes two for-loops to print out all elements in a two-dimensional array. 

    public static void print1( int[][] a ) 
    { 
	String retStr = ""; 
	for (int i = 0; i < a.length; i++) { 
	    for (int n = 0; n < a[i].length; n++) { 
	        retStr += a[i][n] + " "; 
	    } 
	    retStr += "\n"; } 
	System.out.println(retStr); 
    }

    // print2 (int[][] a); A method that utilizes one for-loop and a for-each loop to print all elements in a two-dimensional array. 
	
    public static void print2( int[][] a ) 
    {  
        for (int i = 0; i < a.length; i++) { 
	    for (int n: a[i]) { 
		System.out.print(n + " "); 
	    } 
	    System.out.print("\n"); 
	} 
	System.out.println();
    }

    // sum1: A method that returns the sum of all elements in a two-dimensional array. 

    public static int sum1( int[][] a )
    { 
	int counter = 0; 
	   for (int i = 0; i < a.length; i++) { 
	    for (int n: a[i]) { 
		counter += n; 
	    } 
	} 
	    return counter; 
    }


    // sumRow: Returns the sum of a one-dimensional array (a helper function for sum2). 
	
    public static int sumRow (int[] a) { 
	    int counter = 0; 
	    for (int i: a) { 
		    counter += i; 
	    } 
	    return counter; 
    } 
	
    // sum2: Utilizes sumRow to return the sum of all elements in a two-dimensional array. 

    public static int sum2( int [][] m ) 
    { 
	int counter = 0; 
	for (int[] a: m) { 
		counter += sumRow(a); 
	} 
	return counter; 
    }

	

    // sumRow(int r, int[][] a): An overwriting of sumRow for inputs of a specific row and a two-dimensional array to return all elements within the given row. 

    public static int sumRow( int r, int[][] a ) 
    { 
	int counter = 0; 
	for (int i = 0; i < a[r].length; i++) { 
		counter += a[r][i]; 	
	} 
	return counter; 
    }


    // sumRow2 (int r, int[][] m): returns the sum of a given row of a two-dimensional array using a for-each loop. 

    public static int sumRow2( int r, int[][] m ) 
    { 
	int counter = 0; 
	for (int i: m[r]) { 
		counter += i; 
	} 
	return counter; 
    }


    // sumCol: returns the sum of all elements within a given column. 

    public static int sumCol( int c, int[][] m ) 
    { 
	int counter = 0; 
	for (int i = 0; i < m.length; i++) { 
	    counter += m[i][c]; 
	} 
	return counter; 
    }


    // MAIN 

    public static void main( String [] args ) 
    {
       
	int [][] m1 = new int[4][2];
	int [][] m2 = { {2,4,6}, {3,5,7} };
	int [][] m3 = { {2}, {4,6}, {1,3,5} };
	print1(m1);
	print1(m2);
	print1(m3);
	print2(m1);
	print2(m2);
	print2(m3);
	System.out.print("testing sum1...\n");
	System.out.println("sum m1 : " + sum1(m1)); // 0
	System.out.println("sum m2 : " + sum1(m2)); // 27
	System.out.println("sum m3 : " + sum1(m3)); // 21
	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1)); // 0 
	System.out.println("sum m2 : " + sum2(m2)); // 27
	System.out.println("sum m3 : " + sum2(m3)); // 21
	System.out.println(sumRow(1, m2)); // 15
	System.out.println(sumRow2(2, m3)); // 9
	System.out.println(sumCol(1, m2)); //9
	System.out.println(sumCol(0, m3)); // 7


    }

}//end class TwoDimArray
