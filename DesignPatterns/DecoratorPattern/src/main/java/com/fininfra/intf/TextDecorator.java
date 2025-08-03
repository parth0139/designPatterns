package com.fininfra.intf;

public abstract class TextDecorator implements Text{
    protected Text text;
    protected TextDecorator(Text text) {
        this.text = text;
    }
}
