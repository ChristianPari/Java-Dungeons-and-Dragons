package dungeons_dragons.game_source;

import java.util.Random;

public class Die {
  // variables
  private int sides = 6;
  private int dieValue = 0;

  // constructors
  public Die() {}
  public Die(int sides) { this.sides = sides; }

  // methods
  public void roll(Random random) {
    int numberRolled = random.nextInt(sides) + 1;
    dieValue = numberRolled;
  }

  // getters
  public int getValue() {
    if (dieValue == 0) {
      System.out.println("Die has not been rolled...");
      return dieValue;
    }

    return dieValue;
  }

}
