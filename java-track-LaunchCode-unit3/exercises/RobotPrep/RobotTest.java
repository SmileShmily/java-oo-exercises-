package RobotPrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void testRotateRight() {
		Robot r = new Robot("Chappy", 0, 0, 5, "North");
		r.Rotate("Right");
		assertTrue(r.getDirection() == "East");
	}

	@Test
	public void testRotateLeft() {
		Robot r = new Robot("Chappy", 0, 0, 5, "North");
		r.Rotate("Left");
		assertTrue(r.getDirection() == "West");
	}
	
	@Test
	public void testMoveY() {
		Robot r = new Robot("Chappy", 0, 0, 5, "North");
		r.Move();
		assertTrue(r.getyPos() == 5);
	}
	
	@Test
	public void testMoveNegY() {
		Robot r = new Robot("Chappy", 0, 0, 5, "South");
		r.Move();
		assertTrue(r.getyPos() == -5);
	}
	
	@Test
	public void testMoveX() {
		Robot r = new Robot("Chappy", 0, 0, 5, "East");
		r.Move();
		assertTrue(r.getxPos() == 5);
	}
	
	@Test
	public void testMoveNegX() {
		Robot r = new Robot("Chappy", 0, 0, 5, "West");
		r.Move();
		assertTrue(r.getxPos() == -5);
	}
	
	@Test
	public void testDistance() {
		Robot r = new Robot("Chappy", 0, 0, 5, "East");
		Robot r2 = new Robot("Wally", 3, 4, 10, "North");
		assertTrue(r.Distance(r2) == 5);
	}
}
