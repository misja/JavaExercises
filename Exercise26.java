	public class Exercise26 {
    public static void main(String arg[]) {
      // Checksum, Q1.3.33
      // The International Standard Book Number (ISBN) is a 10-digit code that uniquely
      // specifies a book. The rightmost digit is a checksum digit that can be uniquely
      // determined from the other 9 digits, from the condition that 
      // d1 + 2d2 +3d3 +... + 10d10 must be a multiple of 11 (here di denotes the 
      // ith digit from the right). The checksum digit di can be any value from 0 to 10.
      // The ISBN convention is to use the character 'X' to denote 10. 
      // Example: the checksum digit corresponding to 020131452 is 5 since 5 is the only
      // value of s between 0 and 10 for which
      //    10•0 + 9•2 + 8•0 + 7•1 + 6•3 + 5•1 + 4•4 + 3•5 + 2•2 + 1•s
      // is a multiple of 11.
      
      // Write a program that takes a 9-digit integer from user input, 
      // computes the checksum digit, and prints out the complete ISBN number.
      // Note that the right-most digit of the user input is actually d2 in the
      // formula above.

      System.out.print("Enter a partial ISBN (first 9 digits): ");
      String partialISBN = StdIn.readString();
      int N = Integer.parseInt(partialISBN));

      int sum = 0;
      // TODO: Add code here to compute the sum for the first 9 digits:
      //    2*digit1 +3*digit2 +... + 10*digit9
      // Hint: Use digit = N % 10 to get the right-most digit of N.
      // of N. And you can use N = N / 10 to discard the last digit of N 
      // (and also shifting all the digits over one place to the right).

      // Next, figure out how much extra needs to be added to the sum
      // so that it would be a multiple of 11. This is the value of the
      // checksum digit.
      int extra;
      if ((sum % 11) == 0)
        extra = 0; // no extra needed, because sum is a multiple of 11 already
      else
        extra = 11 - (sum % 11); // a little extra needed

      // TODO: add code here to decide what the last digit should be. If the
      // extra amount is 10, then the last digit is "X". Otherwise, the last
      // digit is just whatever the extra amount is.
      String last;

      // Finally, print the full ISBN with checksum.
      System.out.println("The full ISBN number is " + partialISBN + last);

    }
  }