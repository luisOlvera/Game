package TEST;

import org.junit.Assert;
import classes.*;
import static org.junit.Assert.*;


public class GameTest {

int score=0;
    @org.junit.Test
    public void gameTestUnsolopino ()throws Exception {

        Game g= new Game();
        for (int n=0;n<20; n++)
        {
            g.roll(1);

        }
        score=g.score();
        Assert.assertEquals(score, 20);
    }

    @org.junit.Test
    public void gameTestSpare ()throws Exception {

        Game g= new Game();


        g.roll(1);
        g.roll(9);
        g.roll(4);
        g.roll(1);

        score=g.score();
        Assert.assertEquals(score, 19);
    }
    @org.junit.Test
    public void gameTestStrike ()throws Exception {

        Game g= new Game();


        g.roll(10);
        g.roll(0);
        g.roll(4);
        g.roll(5);


        score=g.score();
        Assert.assertEquals(score, 28);
    }

    @org.junit.Test
    public void gameTestPerfect ()throws Exception {

        Game g= new Game();


        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(10);
        g.roll(10);

        score=g.score();
        Assert.assertEquals(score, 300);
    }

    @org.junit.Test
    public void gameTestultimoFramespark ()throws Exception {
        Game g= new Game();

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(10);
        g.roll(0);

        g.roll(0);
        g.roll(10);
        g.roll(10);

        score=g.score();
        Assert.assertEquals(score, 270);
    }

    @org.junit.Test
    public void gameTestPuroSpare ()throws Exception {
        Game g= new Game();

        g.roll(1);
        g.roll(9);
//11
        g.roll(1);
        g.roll(9);
 //22
        g.roll(1);
        g.roll(9);
//33
        g.roll(1);
        g.roll(9);
//44
        g.roll(1);
        g.roll(9);
//55
        g.roll(1);
        g.roll(9);
//66
        g.roll(1);
        g.roll(9);
//77
        g.roll(1);
        g.roll(9);
//88
        g.roll(1);
        g.roll(9);
//99
        g.roll(1);
        g.roll(9);
        g.roll(10);
//119
        score=g.score();
        Assert.assertEquals(score, 119);
    }
}