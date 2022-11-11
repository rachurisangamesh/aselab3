import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testjunit {
@Test
public void testTrignometry() {
	int angle = 41;
    double angleinr = 0;
    angleinr = angle * Math.PI/180;
   
    assertEquals(Math.sin(angle*Math.PI/180), trignometry.sin(angle), 0.01);
    assertEquals(Math.cos(angle*Math.PI/180), trignometry.cos(angle), 0.01);
    assertEquals(Math.tan(angle*Math.PI/180), trignometry.tan(angle), 0.01);
}
@Test
public void testRadian() {
	assertEquals(0.349,trignometry.toRadian(20), 0.01);
}
 }