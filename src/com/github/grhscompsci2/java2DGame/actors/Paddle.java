package com.github.grhscompsci2.java2DGame.actors;

public class Paddle extends Actor {
    private final static String sprite = "images/paddle.png";

    public Paddle() {
        super(sprite, 10, 20,50,Type.player);
    }

    public void act(double deltaTime){
        if (getY()+getDY() <0){
            setDY(0);
        }
        super.act(deltaTime);
        
    }

    @Override
    public void hitEdge() {
      // TODO Auto-generated method stub
      
    }

    @Override
    public void hitActor(Actor actor) {
      // TODO Auto-generated method stub
      
    }
}
