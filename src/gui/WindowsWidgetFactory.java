package gui;

import java.awt.*;

public class WindowsWidgetFactory extends WidgetFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WindowsTextArea();
    }
}
