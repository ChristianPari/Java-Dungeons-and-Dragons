package dungeons_dragons.game_source;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  // variables
  public List<Die> dice = new ArrayList<>();

  // constructors
  public Hand() {
    generateDice();
  }

  // methods
  private void generateDice() {
    for (var diceType : DiceTypes.values()) {
      int sides = Integer.parseInt(diceType.toString().substring(1));
      var die = new Die(sides);
      dice.add(die);
    }
  }

  public void roll(
      String dieType
  ) {
    int strLength = dieType.length();
    int dieSides = Integer.parseInt(dieType.substring(strLength - 1));
    for (var die : dice) {
      if (die.getSides() == dieSides) {
        die.roll();
      }
    }
  }

  // overrides
  @Override
  public String toString() {
    String output = "";
    for (var die : dice) {
      output += die.getValue() + " ";
    }
    return output.trim();
  }
}
