package com.fininfra.impl;

import com.fininfra.intf.Text;
import com.fininfra.intf.TextDecorator;

public class BoldText extends TextDecorator{
    public BoldText(Text text) {
        super(new PlainText("\033[1m"+text.getText()));
    }
    public String getText(){
       return text.getText();
    }
    public void render() {
        text.render();
    }
}
