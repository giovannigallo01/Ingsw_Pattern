package prototype;

import java.awt.Graphics;

public abstract class Shape implements Cloneable{

	private String id;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	abstract void draw(Graphics g);

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
