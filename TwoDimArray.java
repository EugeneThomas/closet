// Eugene Thomas
// APCS1 pd3
// HW38 -- Arrays of Arrays 
// 2016-12-1

public class TwoDimArray {

    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a ) 
    { 
	for (int i = 0; i < a.length; i++) { 
	    for (int n = 0; n < a[i].length; n++) { 
		System.out.println(a[i][n] + " ") 
	    } 
	System.out.println("\n"); } 
    }


    //postcond: prints each row of 2D integer array a on its own line
    //          uses a FOREACH loop
	
    public static void print2( int[][] a ) 
    { 
        for (int i = 0; i < a.length; i++) { 
	    for (int n: a[i]) { 
		System.out.println(n + " "); 
	    } 
	    System.out.println("\n"); 
	} 
    }


    //postcond: returns sum of all items in 2D integer array a
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


    //postcond: returns sum of all items in 2D integer array a
    //          * uses helper fxn sumRow
	
    public static int sumRow (int[] a) { 
	    int counter = 0; 
	    for (int i: a) { 
		    counter += i; 
	    } 
	    return counter; 
    } 
	
    public static int sum2( int [][] m ) 
    { 
	int counter = 0; 
	for (int[] a: m) { 
		counter += sumRow(a); 
	} 
	return counter; 
    }

	

    //postcond: returns sum of all items on row r of 2D integer array 
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a ) 
    { 
	int counter = 0; 
	for (int i = 0; i < a[r].length; i++) { 
		counter += a[r][i]; 	
	} 
	return counter; 
    }


    //postcond: returns sum of all items on row r of 2D integer array 
    //          uses a FOREACH loop
    public static int sumRow2( int r, int[][] m ) 
    { 
	int counter = 0; 
	for (int i: a[r]) { 
		counter += i; 
	} 
	return counter; 
    }


    //postcond: returns sum of all items in column c of 2D integer array 
    public static int sumCol( int c, int[][] m ) 
    { 
	int counter = 0; 
	for (int i = 0; i < m.length; i++) { 
		counter += a[i][0]; 
	} 
	return counter; 
    }


    public static void main( String [] args ) 
    {
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
	System.out.println("sum m1 : " + sum1(m1));
	System.out.println("sum m2 : " + sum1(m2));
	System.out.println("sum m3 : " + sum1(m3));
	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1));
	System.out.println("sum m2 : " + sum2(m2));
	System.out.println("sum m3 : " + sum2(m3));
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }

}//end class TwoDimArray
