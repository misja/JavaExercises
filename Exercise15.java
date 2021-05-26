	public class Exercise15 {
    public static void main(String arg[]) {
      // Write a program that prints out how many days, hours, minutes,
      // and seconds it has been since midnight on January 1, 1970. 
      // For this question, make use of the System.currentTimeMillis()
      // function in Java which will give you the number of milliseconds
      // since midnight on January 1, 1970.
      
      long n = System.currentTimeMillis();
      System.out.println("It has been " + n + " milliseconds since midnight Jan 1, 1970.");
      
      long d = ...; // add your code here, then click "run" to test it.
      long h  = ...;
      long m  = ...;
      double s  = ...;
      
      System.out.println("That is " + d + " days, " +
                             h + " hours, " +
                             m + " minutes, and " +
                             s + " seconds ago!");    
    }
  }