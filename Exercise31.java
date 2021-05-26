	public class Exercise30 {
    public static void main(String arg[]) {
      // Make a random PIN generator. The program should take as input
      // a number N, and it should output a random PIN with N digits.
      // Each digit should be between 0 and 9.
      // Example:
      //   How many digits do you want in your pin? 5
      //   Your random PIN is: 1 3 6 1 9

      // Variation 1: Modify your code to ensure that no two
      // adjacent digits in the PIN are identical. So if
      // your code has just printed a 5, for example, the
      // next digit printed cannot also be a 5.
      // Hint: Use a variable to record the previous digit
      // printed, then repeatedly pick random digits until
      // you find one that isn't the same as the previous
      // digit.

      // Variation 2: Modify your code so that no single 
      // digit ever appears more than once in the PIN. For
      // example, once the the digit 5 is printed, then
      // your code must ensure that 5 isn't picked for
      // any of the remaining digits. This only works
      // for PINs that are no more than 10 digits, of course.
      // Hint: Use an array of booleans to keep track of
      // whether each digit has been printed yet.
      // Alternative hint: Keep track of P, the product
      // of all the digits printed so far. If P is
      // not zero and is divisible by x, then you 
      // would know that x has already been printed.
      // This trick doesn't work for the digit zero,
      // though, so you can handle that case with a
      // separate boolean variable, or use 10 in the
      // product to represent the digit 0.
      
    }
  }