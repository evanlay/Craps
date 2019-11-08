package com.company;

// Implements the game of Craps logic

public class CrapsGame
{
    private int point = 0;

    /**
     *  Calculates the result of the next dice roll in the Craps game.
     *  The parameter total is the sum of dots on two dice.
     *  point is set to the saved total, if the game continues,
     *  or 0, if the game has ended.
     *  Returns 1 if player won, -1 if player lost,
     *  0 if player continues rolling.
     */
    public int processRoll(int total)
    {
        int result = 0;
        if (point == 2 || point == 3 || point == 12) {
            total = 0;
            result = result - 1;
        }
        else if (point == 7 || point == 11) {
            total = 0;
            result = result + 1;
        }
        else {
            total = point;
            if (point == 7 || point == 11) {
                total = 0;
                result = result - 1;
            }
            else if (point == total) {
                total = 0;
                result = result + 1;
            }
        }
        return result;
    }

    /**
     *  Returns the saved point
     */
    public int getPoint()
    {
        return point;
    }
}