
/*Genesis Solutions Pvt Ltd. Phone no:27551578,27555985*/
/*Faculty: Mr.Neil Gogte*/

/* Program using TwoDimensional String arrays */ 

public class ArrayOfArraysDemo {
    public static void main(String[] args) {
        String[][] BooksDetail =
        {
	    { "Books", "Java", "Java Swing" , "J2ME", "J2EE"},
            { "Authours", "James","Gosling","Betty", "Bam" },
            { "Price(Rs)", "250", "300","350","400" },
        };

        for (int i = 0; i < BooksDetail.length; i++) {
	    System.out.print(BooksDetail[i][0] + ": ");
            for (int j = 1; j < BooksDetail[i].length; j++) {
	        System.out.print(BooksDetail[i][j] + " ");
	    }
	    System.out.println();
        }
    }
}
/*~Itsraj~*/