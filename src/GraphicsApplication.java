import acm.graphics.*;
import acm.program.*;

/*
 * Extending GraphicsProgram in ACM library 
 * It provides the core functionally for creating graphical application
 */
public class GraphicsApplication extends GraphicsProgram{
	private static final int RESOLUTION_HEIGHT = 675;
	private static final int RESOLUTION_WIDTH = 1200;
	private GLabel label = new GLabel ("TEST", 200, 200);
	
	@Override 
	public void init() {
		setSize(RESOLUTION_WIDTH, RESOLUTION_HEIGHT);
		requestFocus();
		/*
		 * requestFocus() is a method that asks the operating system to give focus 
		 * to the component that calls it. When a component has focus:
		 * It can receive user input events (like key presses or mouse events).
		 * It ensures the program interacts correctly with the user.
		 */
	}
	
	@Override
	public void run() {
		add(label);
		
	}
	
	public static int getResolutionWidth() {
		return RESOLUTION_WIDTH;
	}
	
	public static int getResolutionHeight() {
		return RESOLUTION_HEIGHT;
	}
	
	public static void main(String[] args) {
		GraphicsApplication application = new GraphicsApplication();
		application.start(); // kick off the program
		application.requestFocus();
	}
}
