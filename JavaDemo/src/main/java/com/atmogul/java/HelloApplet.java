package com.atmogul.java;

import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {
    public void paint(Graphics g){
        g.drawString("Hello!",10,10);
        g.drawString("Welcome to Applet Programming!",30,30);
    }
}
