import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * Extending GraphicsProgram in ACM library 
 * It provides the core functionally for creating graphical application
 */
public class GraphicsApplication extends GraphicsProgram{
	private static final int RESOLUTION_HEIGHT = 675;
	private static final int RESOLUTION_WIDTH = 1200;
	private static final double ASPECT_RATIO = 16.0 / 9.0;
	
	protected Scene currentScene;
	protected Scene previousScene;
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
		
		// Add the ComponentListener to the content pane
		
	}
	
	@Override
	public void run() {
		add(label);
		addMouseListeners();
	}

	public void enforceAspectRatio() {
		Rectangle bounds = getGCanvas().getBounds();
		double currentWidth = bounds.getWidth();
		double currentHeight = bounds.getHeight();
		int newWidth;
		int newHeight;
		double currentAspectRatio = currentWidth / currentHeight;
		
		System.out.println("Current bounds - Width: " + currentWidth + "; Height: " + currentHeight);
		System.out.println("Current aspect ratio: " + currentAspectRatio);
		
		if (currentAspectRatio < ASPECT_RATIO) {
			newWidth = (int) currentWidth;
			newHeight = (int) (newWidth / ASPECT_RATIO);
		} else {
			newHeight = (int) currentHeight;
			newWidth = (int) (newHeight * ASPECT_RATIO);
		}
		
		setSize(newWidth, newHeight);
		getGCanvas().revalidate();
	    getGCanvas().repaint();
		
	}
	
	public static int getResolutionWidth() {
		return RESOLUTION_WIDTH;
	}
	
	public static int getResolutionHeight() {
		return RESOLUTION_HEIGHT;
	}
	
	public void switchSceneTo (Scene scene) {
		if (this.currentScene == null) {
			this.currentScene = scene;
			this.currentScene.showContents();
			System.out.println("Starting application!");
			System.out.println("Current scene: " + scene);
		} else {
			System.out.println("Switch scene to " + scene);
			this.previousScene = this.currentScene;
			this.currentScene.hideContents();
			this.currentScene = scene;
			this.currentScene.showContents();
		}
	}
	
	public static void main(String[] args) {
		GraphicsApplication application = new GraphicsApplication();
		application.start(); // kick off the program
		application.requestFocus();
	}
}
