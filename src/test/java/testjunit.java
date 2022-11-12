import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testjunit {
	@Test
	public void testPower() {
		assertEquals(Math.pow(-4, 2), trignometry.power(-4,2), 0.01);
	}
		
	@Test

	public void testRadian() {
			assertEquals(20.6*Math.PI/180,trignometry.toRadian(20.6), 0.01);
		}

	@Test
	public void testFactorial() {
		assertEquals(5040,trignometry.factorial(7), 0.01);
	}
		
	@Test
	public void testTrignometrySin() {
//		  First Quadrant
	    assertEquals(Math.sin(37.5*Math.PI/180), trignometry.sin(37.5), 0.01);
	    assertEquals(Math.sin(22*Math.PI/180), trignometry.sin(22), 0.01);
	    assertEquals(Math.sin(89*Math.PI/180), trignometry.sin(89), 0.01);
//	    Second Quadrant
	    assertEquals(Math.sin(115*Math.PI/180), trignometry.sin(115), 0.01);
	    assertEquals(Math.sin(98*Math.PI/180), trignometry.sin(98), 0.01);
	    assertEquals(Math.sin(140*Math.PI/180), trignometry.sin(140), 0.01);
//	    Third Quadrant
	    assertEquals(Math.sin(225*Math.PI/180), trignometry.sin(225), 0.01);
	    assertEquals(Math.sin(198*Math.PI/180), trignometry.sin(198), 0.01);
	    assertEquals(Math.sin(260*Math.PI/180), trignometry.sin(260), 0.01);
//	    Fourth Quadrant
	    assertEquals(Math.sin(280*Math.PI/180), trignometry.sin(280), 0.01);
	    assertEquals(Math.sin(292*Math.PI/180), trignometry.sin(292), 0.01);
	    assertEquals(Math.sin(343*Math.PI/180), trignometry.sin(343), 0.01);
	}

	@Test
	public void testTrignometryCos() {
//		First Quadrant
	    assertEquals(Math.cos(15*Math.PI/180), trignometry.cos(15), 0.01);
	    assertEquals(Math.cos(29*Math.PI/180), trignometry.cos(29), 0.01);
	    assertEquals(Math.cos(72*Math.PI/180), trignometry.cos(72), 0.01);
	    assertEquals(Math.cos(85*Math.PI/180), trignometry.cos(85), 0.01);
//	    Second Quadrant
	    assertEquals(Math.cos(115*Math.PI/180), trignometry.cos(115), 0.01);
	    assertEquals(Math.cos(97*Math.PI/180), trignometry.cos(97), 0.01);
	    assertEquals(Math.cos(169*Math.PI/180), trignometry.cos(169), 0.01);
	    assertEquals(Math.cos(180*Math.PI/180), trignometry.cos(180), 0.01);
//	    Third Quadrant
	    assertEquals(Math.cos(225*Math.PI/180), trignometry.cos(225), 0.01);
	    assertEquals(Math.cos(197*Math.PI/180), trignometry.cos(197), 0.01);
	    assertEquals(Math.cos(230*Math.PI/180), trignometry.cos(230), 0.01);
	    assertEquals(Math.cos(215*Math.PI/180), trignometry.cos(215), 0.01);
//	    Fourth Quadrant
	    assertEquals(Math.cos(343*Math.PI/180), trignometry.cos(343), 0.01);
	    assertEquals(Math.cos(295*Math.PI/180), trignometry.cos(295), 0.01);
	    assertEquals(Math.cos(300*Math.PI/180), trignometry.cos(300), 0.01);
	    assertEquals(Math.cos(322*Math.PI/180), trignometry.cos(322), 0.01);
	}

	@Test
	public void testTrignometryTan() {

//		First Quadrant
	    assertEquals(Math.tan(5*Math.PI/180), trignometry.tan(5), 0.01);
	    assertEquals(Math.tan(27*Math.PI/180), trignometry.tan(27), 0.01);
	    assertEquals(Math.tan(77*Math.PI/180), trignometry.tan(77), 0.01);
	    assertEquals(Math.tan(89*Math.PI/180), trignometry.tan(89), 0.01);
//	    Second Quadrant
	    assertEquals(Math.tan(115*Math.PI/180), trignometry.tan(115), 0.01);
	    assertEquals(Math.tan(99*Math.PI/180), trignometry.tan(99), 0.01);
	    assertEquals(Math.tan(122*Math.PI/180), trignometry.tan(122), 0.01);
	    assertEquals(Math.tan(174*Math.PI/180), trignometry.tan(174), 0.01);
//	    Third Quadrant
	    assertEquals(Math.tan(225*Math.PI/180), trignometry.tan(225), 0.01);
	    assertEquals(Math.tan(198*Math.PI/180), trignometry.tan(198), 0.01);
	    assertEquals(Math.tan(200*Math.PI/180), trignometry.tan(200), 0.01);
	    assertEquals(Math.tan(268*Math.PI/180), trignometry.tan(268), 0.01);
//	    Fourth Quadrant
	    assertEquals(Math.tan(343*Math.PI/180), trignometry.tan(343), 0.01);
	    assertEquals(Math.tan(283*Math.PI/180), trignometry.tan(283), 0.01);
	    assertEquals(Math.tan(325*Math.PI/180), trignometry.tan(325), 0.01);
	    assertEquals(Math.tan(290*Math.PI/180), trignometry.tan(290), 0.01);
	}

	@Test
	public void testTrignometrynegative() {
		assertEquals(99999.0, trignometry.sin(-1), 0.01);
		assertEquals(99999.0, trignometry.cos(-1), 0.01);
		assertEquals(99999.0, trignometry.tan(-1), 0.01);
	}
	@Test
	public void testTrignometryGreat() {
		assertEquals(99999.0, trignometry.sin(361), 0.01);
		assertEquals(99999.0, trignometry.cos(361), 0.01);
		assertEquals(99999.0, trignometry.tan(361), 0.01);
	}
 }