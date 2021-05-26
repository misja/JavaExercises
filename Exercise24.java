	public class Exercise24 {
    public static void main(String arg[]) {
      // "Binary numbers" are a way to represent integers as a sequence of 
      // zeros and ones. Write a program to convert a number x (between
      // 0 and 1023) into a 10-bit binary number, as follows:
      // Begin with b=512. If x is larger than or equal to 512, output a 1 and
      // subtract 512 from the number. Otherwise output a 0 and don't
      // change the number. Then do the same using b=256. Then do the
      // same using b=128. Each time, b is cut in half. Keep repeating
      // until (and including) b=1. When b=0, stop and don't print any
      // more results. For example, if the user inputs 152 for x, then:
      // 152 is less than 512, so first print a zero.
      // 152 is greater than or equal to 128, so print 1, set x=24 (which is 152-128).
      //  24 is less than 64, so print 0.
      //  24 is less than 32, so print 0.
      //  24 is greater than or equal to 16, so print 1, set x=8 (which is 24-16).
      //   8 is greater than or equal to 8, so print 1, set x=0 (which is 8-8).
      //   0 is less than 4, so print 0.
      //   0 is less than 2, so print 0.
      //   0 is less than 1, so print 0.
      // In all, the program should have printed "010011000". You can check
      // your work by searching onlie for "0b010011000 in decimal" to make
      // sure you get the same number the user started with.

      System.out.print("Enter a decimal number (0 to 1023): ");
      int x = StdIn.readInt();

    }
  }