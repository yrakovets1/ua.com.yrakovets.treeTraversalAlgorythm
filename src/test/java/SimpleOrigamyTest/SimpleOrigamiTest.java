package SimpleOrigamyTest;

import alg.OrigamyAlgorytm;
import org.junit.Test;
import structures.Line;
import structures.Point;

import java.util.Arrays;

public class SimpleOrigamiTest {

    @Test
    public void simpleTest(){
        OrigamyAlgorytm origamiAlgorytm = new OrigamyAlgorytm();

        origamiAlgorytm.field.crumpledPoints = Arrays.asList(new Point(0,0),
                new Point(1,0),
                new Point(1,1),
                new Point(0,1));
        origamiAlgorytm.field.crumpledLines = Arrays.asList(new Line(new Point(0,0), new Point(1,0)),
                new Line(new Point(0,0), new Point( 0,1)),
                new Line(new Point(1,0), new Point( 1,1)),
                new Line(new Point(0,1), new Point( 1,1))
                );


    }




}
