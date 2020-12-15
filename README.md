This repo contains each version of a Java Dungeons and Dragons attack simulator game, the projects goal:<br>
- Using the rules of D&D create an application that first determines if a player/enemy lands a hit (including potential criticals) then determine the damage dealt
    - Note that damage dice syntax for d&d is {x}d{y} the x stands for how many dice (if omitted then 1 die) and the y is for the sides of the dice example: 2d4 roll 2 4 sided dice. d10 = roll 1 10 sided die. 6d8 roll 6 8 sided dice.
    - D&D rules:
        - to determine if an attack results in a hit:
        - 1. roll a d20
        - 2. if a 20 is rolled this is considered an Natural 20 -> the attack lands and is considered critical (roll damage twice)
        - 3. if a 1 is rolled this is a natural 1 and is considered a critical miss.
        - 4. after the roll add the attack modifier
        - 5. if total is above targets AC + defense modifier then the attack lands and damage should be calculated by rolling the damage dice of the attack

    - create a Static Calculator class that has the attack method: it should accept the following:
        - (int ac, int defenseMod, int attackModifier, string damageDice)

    - it should print one of the following strings:
        - "Hit X damage delt"
        - "Miss 0 damage"
        - "Critical Hit! X + Y = Z damage"
        - "Critical Miss!"

    - and return the damage;
    
Breakdown of versions...
- v1.0 can roll a number between 1 and 20
- v1.1 can determine if critical hit or miss.
- v1.2 if not above can add attack and defense modifiers to determine hit
- v1.3 parse damage roll into number of standard dice.
- v1.4 parse damage roll into number of specified dice.
- v1.5 determine damage delt.
- v1.6 roll damage again if critical hit.
- v1.7 display correct results and return the damage amount.
    
Extra Challenge...
 - create a character class to store AC, Attack and defense modifiers, as well as a weapon and armor
 - weapon class: stores DamageDice and any additional attack modifiers.
 - armor class: stores AC modifier
 - update your calculator to accept two baseCharacters for the attack: the attacker and the target. update method to still work with this configuration. (consider overload provide raw data or the two baseCharacters.)
