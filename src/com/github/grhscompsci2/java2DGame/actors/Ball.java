package com.github.grhscompsci2.java2DGame;

/**
 * This is an example bullet class that extends the Actor class. It only needs
 * to set the image, position and speed of the actor. The rest is handled in the
 * Board class.
 */
public class Ball extends Actor {
  public Ball() {
    super("images/ball.png", Utility.gameWidth, Utility.gameHeight/2, 10);
    setDY(-1 * getSpeed());
    setDX(-1 * getSpeed());
  }
  public void act(){
    if (getY()+getDY() <getBounds().height/2||getY()+getDY() >Utility.gameHeight-getBounds().height/2){
      setDY(-1 * getDY());
  }
    super.act();
  }
}
