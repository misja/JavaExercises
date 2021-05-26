	public class Exercise number 16 {
    public static void main() {
      // The following program has many bugs. Fix them all.
      
      long start = 1567605600000L; // Sept 4, 2019 at 11am EST
      long now = System.currentTimeMillis();

      long elapsed = now - stert;
      long days = elapsed / (24 x 60 x 60 x 1000);

      System.out.println("It has been more than " + days + " days since you" +
                  " started to learn Java!")
      System.out.print("How is it going so far? ");
      String response = StdIn.readString();

      System.out.println("I'm glad to hear it is going " + response + "!");

      System.out.print("On a scale of 1 to 10, how hard do you think it is? ");
      double hardness = StdIn.readDouble();
      if (hardness < 3) {
        System.out.println("Really, you think it is that easy?!");
      } else if (hardness > 7) {
        System.out.println("I hear you. Don't hesitate to go to office hours!");
      } else {
        System.out.println("Great!");
      }
    }
  }