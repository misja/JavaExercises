	public class Exercise29 {
    public static void main(String arg[]) {
      // Simulate brownian motion of a particle being bounced around a number line,
      // as follows. Start with the particle at x=0.0. Then pick a random number
      // between -1.0 and +1.0, and add that to x. Repeat N times. During the
      // process, keep track of the position of the particle, and the largest
      // distance d away from 0.0 ever reached by the particle.
      // At the end, print out three numbers: the final position x of the particle, the
      // furthest distance d away from 0.0 ever achieved by the particle, and
      // lastly print the square root of N.
      // Try your program for various values of N, such as N=10, N=1000, and
      // N = 1000000.
      // You should find that the particle rarely ever moves further than sqrt(N)
      // distance away from 0.0, even after N steps. To confirm, you can
      // try two other experiments:
      //   Instead of taking N as an input from the user, run your code
      //   for every value of N, starting from N=10, up to N=1million.
      //   For each value of N, start with x=0.0, do the simulation for
      //   N steps, then print out the results. You should see that
      //   most of the results for d are below sqrt(N). You might even
      //   print the results only if the distance reached was further than
      //   sqrt(N), in which case you should see that very few results get
      //   printed.
      //
      //   Alternatively, use a single value of N chosen by the user, but
      //   repeat the simulation a few thousand times. Print out how
      //   many times the simulation resulted in d being larger than sqrt(N).
      //   It should be only a few out of the thousands of experiments.

      System.out.print("How many steps do you want to go? ");
      int N = StdIn.readInt(); 

      double x = 0.0; // current position of the particle
      double d = 0.0; // farthest from 0.0 ever reached so far

      // your code here

    }
  }