import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;

public class MainApplication extends GraphicsApplication{
	public Scene_MainMenu MainMenuScene;
	
	public void init() {
		setSize(GraphicsApplication.getResolutionWidth(), GraphicsApplication.getResolutionHeight());
		requestFocus();
		
		getGCanvas().addComponentListener(new ComponentAdapter() {
	        @Override
	        public void componentResized(ComponentEvent e) {
	            enforceAspectRatio();
	            if (currentScene instanceof Scene_MainMenu) {
		        	((Scene_MainMenu) currentScene).scaleBackground();
		        }
	        }
	    });
		
		this.MainMenuScene = new Scene_MainMenu(this);
	}
	
	public void run() {
		addMouseListeners();
		switchSceneTo(MainMenuScene);
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
		new MainApplication().start();
	}
}
