package dungeons_dragons.game_source;

public class Character {
  private String name;
  private String race;
  private String type;
  public int hp = 100;

  public Character(
      String name,
      String race,
      String type
  ) {
    this.name = name;
    this.race = race;
    this.type = type;
  }
}
