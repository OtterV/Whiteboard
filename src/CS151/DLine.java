package CS151;

import java.awt.Point;
import java.util.Random;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

public class DLine extends DShape {

    private Line line;

    public DLine() {
	model = new DLineModel();
	line = new Line();
    }
    
    public void draw(){
	line.setStroke(model.getColor());
	double startX = ( (DLineModel) model).getStart().getX();
	double startY = ( (DLineModel) model).getStart().getY();
	double endX = ( (DLineModel) model).getEnd().getX();
	double endY = ( (DLineModel) model).getEnd().getY();
	line.setStartX(startX);
	line.setStartY(startY);
	line.setEndX(endX);
	line.setEndY(endY);
    }

    public Shape getShape() {
	return line;
    }

    public void randomize(int max) {
	model.randomize(max);
	Random rand = new Random();
	int startY = rand.nextInt(model.getHeight());
	int endY = rand.nextInt(model.getHeight());
	Point start = new Point(model.getX(), startY);
	Point end = new Point(model.getX() + model.getWidth(), endY);
	( (DLineModel) model).setStart(start);
	( (DLineModel) model).setEnd(end);
    }
}
