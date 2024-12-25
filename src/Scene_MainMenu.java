import acm.graphics.*;

public class Scene_MainMenu extends Scene{
	public static final String IMG_FILENAME_PATH = "media/";
	public static final String IMG_EXTENSION = ".png";
	private GImage imageBackground;
	
	public Scene_MainMenu (MainApplication mainApp) {
		super(mainApp);
	}
	
	public void drawBackground() {
		String filename = IMG_FILENAME_PATH + "backgroundMainMenu" + IMG_EXTENSION;
		this.imageBackground = new GImage (filename);
		this.imageBackground.setLocation(0, 0);
		mainApplication.add(imageBackground);
	}
	
	public void scaleBackground() {
		if (imageBackground != null) {
			double width = mainApplication.getWidth();
			double height = mainApplication.getHeight();
			imageBackground.setSize(width, height);
		}
	}
	
	@Override 
	public void showContents() {
		drawBackground();
		activeContents.add(imageBackground);
	}
	
	@Override 
	public void hideContents() {
		
	}
}
