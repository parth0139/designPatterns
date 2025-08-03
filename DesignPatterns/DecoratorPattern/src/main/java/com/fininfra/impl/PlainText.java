package com.fininfra.impl;

import com.fininfra.intf.Text;

import java.util.logging.Level;

public class PlainText implements Text {
    String text;
    public PlainText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void render(){
       logger.log(Level.INFO, "Rendering text: {0}", text);
    }
}
