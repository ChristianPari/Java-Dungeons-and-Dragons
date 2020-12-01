package dungeons_dragons;

import dungeons_dragons.simulator_source.simulator.Simulator;
import dungeons_dragons.user_interface.DnD_CLI;

public class DungeonsAndDragons {
  public DungeonsAndDragons() {
    DnD_CLI.welcome();
    var simulator = new Simulator();
    simulator.runSimulation();
  }
}
