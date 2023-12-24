package hust.soict.hedspi.javafx.painter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Iterator;

public class PainterController {

    @FXML
    private RadioButton penRadioButton;

    @FXML
    private RadioButton eraserButton;

    @FXML
    private AnchorPane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawAreaMouseDragged(MouseEvent event) {
        if (penRadioButton.isSelected()) {
            Circle circle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(circle);
        } else if (eraserButton.isSelected()) {
            Iterator<Node> iter = drawingAreaPane.getChildren().iterator();
            while (iter.hasNext()) {
                Node c = iter.next();
                if (c instanceof Circle circle) {
                    if (circle.getCenterX() <= event.getX() + 4 && circle.getCenterX() >= event.getX() - 4) {
                        if (circle.getCenterY() <= event.getY() + 4 && circle.getCenterY() >= event.getY() - 4) iter.remove();
                    }
                }
            }
        }
    }
}
