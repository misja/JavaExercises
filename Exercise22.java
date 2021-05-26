	public class Exercise22 {
    public static void main(String arg[]) {
      // Go look at a 2020 calendar. You will see that 1 Jan 2020 happens to be a Wednesday,
      // 1 February 2020 happens to be a Saturday, 1 March 2020 is a Sunday, and so on.
      // Write a program that asks the user to input a day and month (e.g. 8 February)
      // and then prints out what day of the week that would be in 2020.

      System.out.print("Enter a date in 2020 (for example, \"8 February\"): ");
      int dayOfMonth = StdIn.readInt();
      String monthName = StdIn.readString();

      String nameOfDay;
      // Your code goes here


      System.out.println("That date will fall on a " + nameOfDay)
    }
  }