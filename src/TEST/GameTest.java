package TEST;

import org.junit.Assert;
import classes.*;
import static org.junit.Assert.*;


public class GameTest {

int score=0;
    @org.junit.Test
    public void allOnes_Score20 ()throws Exception {

        Game g= new Game();
        for (int n=0;n<20; n++)
        {
            g.roll(1);

        }
        score=g.score();
        Assert.assertEquals(score, 20);
    }

    @org.junit.Test
    public void oneSpareAllnextZero_Score19 ()throws Exception {
        Game g= new Game();
        g.roll(1);
        g.roll(9);

        g.roll(4);
        g.roll(1);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);
        g.roll(0);

        score=g.score();
        Assert.assertEquals(score, 19);
    }

    @org.junit.Test
    public void oneStrikeAllnextZero_Score28 ()throws Exception {
        Game g= new Game();
        g.roll(10);

        g.roll(4);
        g.roll(5);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);
        g.roll(0);

        score=g.score();
        Assert.assertEquals(score, 28);
    }

    @org.junit.Test
    public void allStrike_Score300 ()throws Exception {
        Game g= new Game();
        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);
        g.roll(10);
        g.roll(10);

        score=g.score();
        Assert.assertEquals(score, 300);
    }

    @org.junit.Test
    public void nineStrikewithFinalSpare_score270 ()throws Exception {
        Game g= new Game();
        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(0);
        g.roll(10);
        g.roll(10);

        score=g.score();
        Assert.assertEquals(score, 270);
    }

    @org.junit.Test
    public void allSpare_Score119 ()throws Exception {
        Game g= new Game();

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);

        g.roll(1);
        g.roll(9);
        g.roll(10);

        score=g.score();
        Assert.assertEquals(score, 119);
    }

    @org.junit.Test
    public void AllZero_score0 ()throws Exception {
        Game g= new Game();

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        score=g.score();
        Assert.assertEquals(score, 0);
    }

    @org.junit.Test
    public void fiveStrikesAndfiveSpares_Score210 ()throws Exception {
        Game g= new Game();

        g.roll(9);
        g.roll(1);

        g.roll(7);
        g.roll(3);

        g.roll(7);
        g.roll(3);

        g.roll(8);
        g.roll(2);

        g.roll(8);
        g.roll(2);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);
        g.roll(0);
        g.roll(0);

        score=g.score();
        Assert.assertEquals(score, 210);
    }

    @org.junit.Test
    public void NineStrikesAndZeros_Score240 ()throws Exception {
        Game g= new Game();
        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(10);

        g.roll(0);
        g.roll(0);


        score=g.score();
        Assert.assertEquals(score, 240);
    }


    @org.junit.Test
    public void FirtsFrame0_10SecondFrame1_1_AllnextZero_Score13 ()throws Exception {
        Game g= new Game();
        g.roll(0);
        g.roll(10);

        g.roll(1);
        g.roll(1);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);

        g.roll(0);
        g.roll(0);


        score=g.score();
        Assert.assertEquals(score, 13);
    }
}

