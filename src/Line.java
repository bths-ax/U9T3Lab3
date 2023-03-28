import java.awt.Graphics;
import java.awt.Point;

public class Line extends Shape {
	public Line() {
		super();
	}

	@Override
	public void draw(Graphics g) {
		Point p1 = getP1();
		Point p2 = getP2();

		g.setColor(getColor());
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
	}
}
