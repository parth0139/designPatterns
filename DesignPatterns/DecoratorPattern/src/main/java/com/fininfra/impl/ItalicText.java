package com.fininfra.impl;

import com.fininfra.intf.Text;
import com.fininfra.intf.TextDecorator;

public class ItalicText extends TextDecorator{
    public ItalicText(Text text) {
        super(new PlainText("\033[3m" + text.getText() + "\033[0m"));
    }
    public String getText(){
        return text.getText();
    }
    public void render() {
        text.render();
    }
}
