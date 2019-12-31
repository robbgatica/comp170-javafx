package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    private double total = 0, current = 0;
    private boolean isReadyForNew = false, isFresh = true;
    private Operator op;
    @FXML private TextField text;

    @FXML
    public void numberButtonClicked(ActionEvent e) {
       if (isReadyForNew) {
          text.clear();
       }
            String digit = ((CalcButton) e.getSource()).getText();
            text.appendText(digit);
            isReadyForNew = false;
    }

    @FXML
    public void plusButtonClicked(ActionEvent e) {
        current = Double.parseDouble(text.getText());
        if (isFresh) {
            total = current;
            text.setText(Double.toString(total));
            isReadyForNew = true;
            isFresh = false;
            op = Operator.ADD;
            return;
        }
        total = total + current;
        text.setText(Double.toString(total));
        op = Operator.ADD;
        isReadyForNew = true;
    }

    @FXML
    public void minusButtonClicked(ActionEvent e) {
            current = Double.parseDouble(text.getText());
        if (isFresh) {
            total = current;
            text.setText(Double.toString(total));
            isReadyForNew = true;
            isFresh = false;
            op = Operator.SUBTRACT;
            return;
        }
            total = total - current;
            text.setText(Double.toString(total));
            op = Operator.SUBTRACT;
            isReadyForNew = true;
    }

    @FXML
    public void multButtonClicked(ActionEvent e) {
        current = Double.parseDouble(text.getText());
        if (isFresh) {
            total = current;
            text.setText(Double.toString(total));
            isReadyForNew = true;
            isFresh = false;
            op = Operator.MULTIPLY;
            return;
        }
        total = total * current;
        text.setText(Double.toString(total));
        op = Operator.MULTIPLY;
        isReadyForNew = true;
    }

    @FXML
    public void divButtonClicked(ActionEvent e) {
        current = Double.parseDouble(text.getText());
        if (isFresh) {
            total = current;
            text.setText(Double.toString(total));
            isReadyForNew = true;
            isFresh = false;
            op = Operator.DIVIDE;
            return;
        }
        total = total / current;
        text.setText(Double.toString(total));
        op = Operator.DIVIDE;
        isReadyForNew = true;
    }

    @FXML
    public void equalsButtonClicked(ActionEvent e) {
        current = Double.parseDouble(text.getText());
        if (op == Operator.ADD) {
            total = total + current;
            text.setText(Double.toString(total));
        } else if (op == Operator.SUBTRACT) {
            total = total - current;
            text.setText(Double.toString(total));
        } else if (op == Operator.MULTIPLY) {
            total = total * current;
            text.setText(Double.toString(total));
        } else if (op == Operator.DIVIDE) {
            total = total / current;
            text.setText(Double.toString(total));
        }
        isReadyForNew = false;
        isFresh = true;
    }

    @FXML
    public void clearButtonClicked(ActionEvent e) {
        total = 0;
        current = 0;
        text.clear();
        isReadyForNew = false;
        isFresh = true;
    }
}

 enum Operator {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
