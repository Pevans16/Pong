package com.github.grhscompsci2.java2DGame.actors;

import com.github.grhscompsci2.java2DGame.Utility;

/**
 * This is an example bullet class that extends the Actor class. It only needs
 * to set the image, position and speed of the actor. The rest is handled in the
 * Board class.
 */
public class Ball extends Actor {
  public Ball() {
    super("ball.png", Utility.gameWidth, Utility.gameHeight/2, 100,Type.enemy);
    setDY(-1 * getSpeed());
    setDX(-1 * getSpeed());
  }
  public void act(double deltaTime){
    // create new changes in x and y
    // check where our dx and dy values will send us
    double futureY = getY() + getDY() * deltaTime;
    // Get half the height of the sprite
    double max =getHeight() / 2.0;
    // If the new position will send us off the screen, set the dx or dy to zero
    if (futureY < max || futureY > Utility.gameHeight - max) {
      setDY(-1*getDY());
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
