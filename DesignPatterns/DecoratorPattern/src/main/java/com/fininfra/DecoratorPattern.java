package com.fininfra;

import com.fininfra.impl.BoldText;
import com.fininfra.impl.ItalicText;
import com.fininfra.impl.PlainText;
import com.fininfra.impl.UnderlinedText;
import com.fininfra.intf.Text;
import com.fininfra.intf.TextDecorator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DecoratorPattern {
    private static final Logger logger = Logger.getLogger(DecoratorPattern.class.getName());
    public static void run() {
        logger.log(Level.INFO, "Running Decorator Pattern...");

        Text plainText= new PlainText("Hi everyone, good morning");
        plainText.render();

        TextDecorator boldText = new BoldText(plainText);
        boldText.render();

        TextDecorator italicText = new ItalicText(boldText);
        italicText.render();

        TextDecorator underlinedText = new UnderlinedText(italicText);
        underlinedText.render();

        new ItalicText(new UnderlinedText(new BoldText(new PlainText("Hello World!")))).render();

        logger.log(Level.INFO, "Decorator Pattern Completed");
        logger.log(Level.INFO,"\n--------------------------------");
    }
}