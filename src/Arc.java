import java.awt.Graphics;

public class Arc extends Shape {
	public Arc() {
		super();
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawArc(getMinX(), getMinY(), getWidth(), getHeight() * 2, 0, 180);
	}
}
