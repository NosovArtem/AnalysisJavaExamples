package com.company.Patterns.Decorator.decorators;

import com.company.Patterns.Decorator.objects.Button;
import com.company.Patterns.Decorator.objects.Component;
import com.company.Patterns.Decorator.objects.TextView;
import com.company.Patterns.Decorator.objects.Window;

public class Start {

    private static Component window;
    private static Component textView;
    private static Component button;

    public static void main(String[] args) {

/*
        Component c = new ColorDecorator(new Window());

        c.draw();*/

        boolean showBorder = true;

        if (!showBorder) {
            window = new Window();
            textView = new TextView();
            button = new Button();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }


        window.draw();
        textView.draw();
        button.draw();

    }

}
