package dungeons_dragons.game_source;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

      if (sides == 10) {
        // DnD usually has 2 d10 dice
        dice.add(die);
      }
      dice.add(die);
    }
  }

  public void roll(Random random) {
    for (var die : dice) {
      die.roll(random);
    }
  }

  // MIGHT CHANGE DUE TO HOW DICE ARE CONSIDERED IN DnD
  public void roll(Random random, List<Integer> dieNumbers) {
    for (int dieNumber: dieNumbers) {
      var die = dice.get(dieNumber - 1);
      die.roll(random);
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
