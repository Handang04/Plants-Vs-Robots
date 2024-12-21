import acm.graphics.*;
import java.util.HashSet;
import java.util.Set;

public class Scene extends GraphicsApplication{
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

}
