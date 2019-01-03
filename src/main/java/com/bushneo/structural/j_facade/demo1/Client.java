package com.bushneo.structural.j_facade.demo1;

/**
 * @author bushneo
 * @create 2019-01-01 18:41
 */
public class Client {

    public static void main(String[] args) {
          Painter painter = new Painter();
          painter.drawLandscapePainting();
          painter.drawSketchPainting();
    }
}
