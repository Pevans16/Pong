package com.github.grhscompsci2.java2DGame.actors;

import com.github.grhscompsci2.java2DGame.Utility;

public class Paddle extends Actor {
  private final static String sprite = "paddle.png";

  public Paddle() {
    super(sprite, 10, 40, 50, Type.player);
  }

  public void act(double deltaTime) {
    // create new changes in x and y
    double dx = 0;
    double dy = 0;
    if (Utility.UP_ARROW) {
      dy = -1 * getSpeed();
    }
    if (Utility.DOWN_ARROW) {
      dy = getSpeed();
    }

    // check where our dx and dy values will send us
    double futureY = getY() + dy * deltaTime;
    // Get half the height of the sprite
    double max =getHeight() / 2.0;
    // If the new position will send us off the screen, set the dx or dy to zero
    if (futureY < max || futureY > Utility.gameHeight - max) {
      dy = 0;
    }
    // update the dx and dy officially
    setDX(dx);
    setDY(dy);

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
