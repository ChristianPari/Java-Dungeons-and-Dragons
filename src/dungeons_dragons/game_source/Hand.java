package dungeons_dragons.game_source;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
  // variables
  private int numberOfDice;
  private int sidesOfDie;
  public List<Die> dice = new ArrayList<>();

  // constructors
  public Hand(
          int sidesOfDie,
          int numberOfDice
  ) {
    this.numberOfDice = numberOfDice;
    generateDice(sidesOfDie);
  }

  // methods
  private void generateDice(int sidesOnDie) {
    for (int count = 0; count < numberOfDice; count++) {
      dice.add(new Die(sidesOnDie));
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
