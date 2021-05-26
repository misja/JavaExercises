	public class Exercise30 {
    public static void main(String arg[]) {
      // Simulate brownian motion of a particle being bounced around a a flat surface.
      // This is nearly the same as Exercise29, but in two dimensions. The position
      // is recorded using two numbers, x and y. At each step, the position should
      // change by adding two random numbers dx and dy, respectively, each of
      // which is a random number between -1.0/sqrt(2) and +1.0/sqrt(2).
      // 
      // Try the same experiments as in Exercise29 to see if the distance
      // reached is usually less than sqrt(N).
      //
      // Note: In the above description, the particle can move at most
      // 1.0/sqrt(2) in the x direction and 1.0/sqrt(2) in the y direction
      // on each single step. In other words, it can move at most 1.0
      // diagonally, but it would never move 1.0 directly to the right 
      // or directly up, or down, or left). Try modifying your code so
      // that the particle moves in a more "balanced" way: first pick
      // a random angle between 0 and 2*pi. Then move an amount sin(angle)
      // in the x direction, and cos(angle) in the y direction. This will
      // ensure the particle always moves exactly 1.0 distance in some
      // random direction.
      // Or, you can do the same, but also pick a random distance between
      // 0.0 and 1.0, and move d*sin(angle) in the x direction and d*cos(angle)
      // in the y direction. That means moving a random distance in a
      // random direction.
      
      
    }
  }