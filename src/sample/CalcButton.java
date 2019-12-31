package sample;

import javafx.beans.NamedArg;
import javafx.scene.control.Button;

public class CalcButton extends Button {
    private char value;

    public CalcButton(@NamedArg("value") char value) {
        super();
        this.value = value;
    }

    public void setValue(char x){
        this.value = x;
    }

    public int getValue() {
        return value;
    }

}
