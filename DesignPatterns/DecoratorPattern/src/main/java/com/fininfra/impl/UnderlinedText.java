package com.fininfra.impl;

import com.fininfra.intf.Text;
import com.fininfra.intf.TextDecorator;

public class UnderlinedText extends TextDecorator{
    public UnderlinedText(Text text) {
        super(new PlainText("\033[4m" + text.getText() + "\033[0m"));
    }
    public String getText(){
        return text.getText();
    }
    public void render() {
        text.render();
    }
}
