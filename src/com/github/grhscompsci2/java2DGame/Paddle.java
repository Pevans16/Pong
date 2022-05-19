package com.github.grhscompsci2.java2DGame;

import java.awt.event.KeyEvent;

public class Paddle extends Actor {
    private final static String sprite = "images/paddle.png";

    public Paddle() {
        super(sprite, 10, 20);
    }

    /**
     * Adds on to the Actor keyPressed method by updating the sprite to be facing
     * the
     * direction it is travelling.
     * 
     * @param e the KeyEvent
     */
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        super.setDX(0);
    }

    /**
     * Adds on to the Actor keyReleased method. It will cycle the firing flag to
     * ensure only one bullet is fired per key press.
     * 
     * @param e the KeyEvent
     */
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        
    }

    public void act(){
        if (getY()+getDY() <0){
            setDY(0);
        }
        super.act();
        
    }
}
