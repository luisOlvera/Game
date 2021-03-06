package classes;

/**
 * Created by root on 5/02/15.
 */
public class Game {

    int[] rolls = new int[21];
    int shot =0;
    int score =0;

     public void roll (int pins){
        rolls[shot++] = pins;
        if ( (shot-1)%2 ==0 && isStrike(shot-1) && shot<18)
        shot ++;
 }


    public int score () {
        int counterRoll =0;
        for (int counterFrame =0; counterFrame <10; counterFrame++) {
             scoreByFrame(counterRoll, counterFrame);
           counterRoll +=2;
        }
        return score;
    }

    public void scoreByFrame(int indexRoll, int indexFrame) {
        if (isStrike(indexRoll))
               score +=  addStrikeBono(indexRoll, indexFrame);
           else if(isSpare(indexRoll))
               score += addSpareBono(indexRoll);
               else
               score += addWithoutBono(indexRoll);
    }


    public boolean isStrike(int indexRoll){
        return rolls[indexRoll] ==10;
    }

    public boolean isSpare(int indexRoll)
    {
        return rolls[indexRoll] + rolls[indexRoll +1] >=10 ;
    }

    public  int addStrikeBono(int indexRoll, int indexFrame) {
        if (isFinalframe(indexFrame))
            return addFinalFrameWithStrike(indexRoll);
        else
            return addFrameWithStrike(indexRoll);
    }

    public int addFinalFrameWithStrike(int indexRoll) {
        return 10+rolls[indexRoll +1] +  rolls[indexRoll +2];
    }

    public int addFrameWithStrike(int indexRoll) {
        if (isStrike(rolls[indexRoll + 2]))
            return 10+ rolls[indexRoll +2]+ rolls[indexRoll +4];
        else
            return  10+ rolls[indexRoll +2] + rolls[indexRoll +3];
    }

    public boolean isFinalframe (int indexFrame){
        return indexFrame ==9;
    }

    public int addWithoutBono(int indexRoll){
        return rolls[indexRoll] + rolls[indexRoll +1];
    }

    public  int addSpareBono(int indexRoll){
        return  10 +rolls[indexRoll +2];
    }


}
