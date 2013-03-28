/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
  
	// You fill in this part
	
	public void run() {
		moveToNewspaper();
		pickItUp();
		returnToOriginal();
	}

	// Karel moves to newspaper.
	private void moveToNewspaper() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	// Karel picks up the newspaper.
	private void pickItUp() {
		pickBeeper();
	}
	
	// Karel returns to its starting point.
	private void returnToOriginal() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
	}
	
	// Karel turns right
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	// Karel turns around
	private void turnAround() {
		turnLeft();
		turnLeft();
	}

}
