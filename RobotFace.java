/*
 * This code will produce a robot face.
 */



import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {


	private static final int HEAD_WIDTH = 300;
	private static final int HEAD_HEIGHT = 350;
	private static final int EYE_RADIUS = 30;
	private static final int MOUTH_WIDTH = 150;
	private static final int MOUTH_HEIGHT = 50;
	
	
	public void run() {
		robotsHead(getWidth() / 2, getHeight() / 2);
	}
	
	
	/*
	 * This adds all the parts of the Robot face together.
	 */
	private void robotsHead(double xcentered, double ycentered) {
		roboHead(xcentered, ycentered);
		lEye(xcentered - HEAD_WIDTH / 4, ycentered - HEAD_HEIGHT / 4);
		rEye(xcentered + HEAD_WIDTH / 4, ycentered - HEAD_HEIGHT / 4);
		roboMouth(xcentered, ycentered + HEAD_HEIGHT / 4);
	}
	
	
	/*
	 *  This method creates the Head of the Robot.
	 *  Even robots need heads
	 */
	
	private void roboHead(double xcentered, double ycentered) {
		double x = xcentered - HEAD_WIDTH / 2;
		double y = ycentered - HEAD_HEIGHT / 2;
		GRect roboHead = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		roboHead.setFilled(true);
		roboHead.setFillColor(Color.GRAY);
		add(roboHead);
	}
	
	
	/*
	 * This method creates the Left Eye so the Robot can see of course
	 */
	private void lEye(double xcentered, double ycentered) {
		double x = xcentered - EYE_RADIUS;
		double y = ycentered - EYE_RADIUS;
		GOval lEye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		lEye.setFilled(true);
		lEye.setColor(Color.YELLOW);
		add(lEye);
	}
	
	/*
	 * This method creates the Right Eye so the Robot can see of course
	 */
	private void rEye(double xcentered, double ycentered) {
		double x = xcentered - EYE_RADIUS;
		double y = ycentered - EYE_RADIUS;
		GOval rEye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		rEye.setFilled(true);
		rEye.setColor(Color.YELLOW);
		add(rEye);
	} 
	
	/*
	 * This method creates the Robots Mouth.
	 * Just in case he wants to talk to you. 
	 */
	
	private void roboMouth(double xcentered, double ycentered) {
		double x = xcentered - MOUTH_WIDTH / 2;
		double y = ycentered - MOUTH_HEIGHT / 2;
		GRect robomouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		robomouth.setFilled(true);
		robomouth.setColor(Color.WHITE);
		add(robomouth);
	}
}