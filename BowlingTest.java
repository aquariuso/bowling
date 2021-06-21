package onepoint.bowling.test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import onepoint.bowling.Bowling;

public class BowlingTest {

    private Bowling bowling;

    /**
     * setUp
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    	bowling = new Bowling();
    }
    
    /**
     * testCalculateAllStricke for all spare
     */
    @Test
    public void testCalculateAllStricke() {

    	int score = 300;
		
    	String [] line = {"X","X","X","X","X","X","X","X","X","X","X","X"};
        assertEquals( score, bowling.calculate(line));
    }
    
    /**
     * testCalculateElevenSpare for eleven spare
     */
    @Test
    public void testCalculateElevenSpare() {

    	int score = 150;
		
    	String [] line = {"5/","5/","5/","5/","5/","5/","5/","5/","5/","5/","5/"};
        assertEquals( score, bowling.calculate(line));
    }
    
    /**
     * testCalculateTenMiss for ten miss
     */
    @Test
    public void testCalculateTenMiss() {

    	int score = 90;
		
    	String [] line = {"9-","9-","9-","9-","9-","9-","9-","9-","9-","9-"};
        assertEquals( score, bowling.calculate(line));
    }



}


