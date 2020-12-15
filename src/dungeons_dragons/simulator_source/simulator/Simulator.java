package dungeons_dragons.simulator_source.simulator;

import dungeons_dragons.simulator_source.character.Character;
import dungeons_dragons.user_interface.DnD_CLI;

import java.util.List;

public class Simulator {
  // variables
  private Character attacker;
  private Character enemy;

  // constructors
  public Simulator(
  ) {
    List<Character> characters = DnD_CLI.createSimulation();
    attacker = characters.get(0);
    enemy = characters.get(1);
  }

  // methods
  public void runSimulation() {
    System.out.println("\nSimulation results...");
    Calculator.attack(attacker, enemy);
  }
}
