package gui;

import java.awt.*;

public class MacOsWidgetFactory extends WidgetFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public TextArea createTextArea() {
        return null;
    }
}
