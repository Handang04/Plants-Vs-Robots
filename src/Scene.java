import acm.graphics.*;

import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

interface  Interfaceable{
	public void showContents();
	public void hideContents();
	public void mousePressed(MouseEvent e);
	public void mouseReleased(MouseEvent e);
	public void mouseClicked(MouseEvent e);
	public void mouseDragged(MouseEvent e);
}

public class Scene extends GraphicsApplication implements Interfaceable{
	/*
	 * To ensure there are no duplicate graphical objects, create a set of activeContents
	 * A HashSet is a specific implementation of Set interface, providng constant-time performance for basic operations
	 * like add(), remove(), and contains()
	 * it is unordered
	 */
	protected static Set<GObject> activeContents = new HashSet<>();
	
	public void addElement(GObject element) {
		this.activeContents.add(element);
	}
	
	public void removeElement(GObject element) {
		if (activeContents.contains(element)) {
			activeContents.remove(element);
		}
		return;
	}

	@Override
	public void showContents() {
		System.out.println("Show contents!");
		
	}

	@Override
	public void hideContents() {
		System.out.println("Hide contents!");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("MOUSE PRESSED");
	}
	
	@Override 
	public void mouseReleased(MouseEvent e) {
		System.out.println("MOUSE RELEASED");
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("MOUSE CLICKED");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("MOUSE DRAGGED");
	}

}
