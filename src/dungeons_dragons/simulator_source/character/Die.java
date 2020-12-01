package dungeons_dragons.simulator_source.character;

import java.util.Random;

public class Die {
  // variables
  private int sides;
  private int dieValue = 0;
  private final Random random = new Random();

  // constructors
  public Die(int sides) { this.sides = sides; }

  // methods
  public void roll() {
    int numberRolled = random.nextInt(sides) + 1;
    dieValue = numberRolled;
  }

  // getters
  public int getSides() { return sides; }

  public int getValue() {
    if (dieValue == 0) {
      System.out.println("Die has not been rolled...");
      return dieValue;
    }

    return dieValue;
  }

}
