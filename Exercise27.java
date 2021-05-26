	public class Exercise27 {
    public static void main(String arg[]) {
      // Examine this code and predict what it will do. Then
      // run it to confirm your prediction. Next, modify it
      // so that it prints a multiplication table instead, like
      // this:
      //   Please enter a number: 6
      //   1  2  3  4  5  6
      //   2  4  6  8 10 12
      //   3  6  9 12 15 18
      //   4  8 12 16 20 24
      //   5 10 15 20 25 30
      //   6 12 18 24 30 36
      // Note: don't worry about the spacing and alignment of the output.

      System.out.print("Please enter a number: ");
      int N = StdIn.readInt();

      for (int row = 1; row <= N; row++ ) {

        // begin code for one row
        int col; 
        for (col = 1; col <= N; col++ ) {
          StdOut.print( row + " ");
        }
        StdOut.println();
        // end of code for one row

      }
      
    }
  }