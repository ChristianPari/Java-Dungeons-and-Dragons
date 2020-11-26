This repo contains each version of a Java [Liars Dice](https://en.wikipedia.org/wiki/Liar%27s_dice) game, the projects goal:<br>
- Create the game liars Dice a game where players start with 7 dice each and play continues until 
one player ends up with 2 dice or money is lost.

- Each turn:
    - Each player rolls their dice but keeps the results secret from the other player.
    - subRounds:
        - the lead player looks at their dice and picks a die value and amount of dice. They are claiming there are at least that many of that die is in play. The player does not have to have those dice to make the claim and the rules for following claims show why someone may want to raise a number.
            - example: Player1 dice: 1 2 2 3 3 5 6 Player 2 dice: 1 1 2 2 2 3 4
        - player one may claim 3 2s meaning he is stating there are AT LEAST three dice with a value of two in the game. Player 2 then decides if player 1 is lying or they make a new claim. Since they have 3 2s they know the player is not wrong. so subround moves to player 2s turn to make a claim.
        - Player 2s claim must follow the following rules.
            - player 2 must increase at least one of the two numbers. so either saying something like:
                - 4 2s, 5 2s, 2 3s, for example of a small move they may also go 3 3s and increase both numbers
            - however player 2 can not reduce any numbers so they cannot claim 2 1s or 1 3s.
        - subround continues until a player announces that the current claim is a lie.

    - when the lie is called the dice are shown. if the claimer was telling the truth then the caller looses one die from their hand. if the claimer was the liar then they loose a die.
- A player looses when they only have two dice left.

Currently `main` contains version 1 of this code which ... (fill in)
