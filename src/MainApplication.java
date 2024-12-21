import java.awt.event.MouseEvent;

public class MainApplication extends Scene{
	public void init() {
		setSize(GraphicsApplication.getResolutionWidth(), GraphicsApplication.getResolutionHeight());
		requestFocus();
	}
	
	public void run() {
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (this.currentScene != null) {
			this.currentScene.mousePressed(e);
		}
	}
	
	@Override 
	public void mouseReleased(MouseEvent e) {
		if (this.currentScene != null) {
			this.currentScene.mouseReleased(e);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (this.currentScene != null) {
			this.currentScene.mouseClicked(e);
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if (this.currentScene != null) {
			this.currentScene.mouseDragged(e);
		}
	}
	
	public static void main(String[] args) {
		MainApplication mainApp = new MainApplication();
		mainApp.start();
		mainApp.requestFocus();
	}
}
