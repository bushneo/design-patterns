package com.bushneo.structural.j_facade.demo1;

/**
 * 画家
 * @author bushneo
 * @create 2019-01-01 18:38
 */
public class Painter {

    private Painting landscapePainting;
    private Painting sketchPainting;

    public Painter() {
        this.landscapePainting = new LandscapePainting();
        this.sketchPainting = new SketchPainting();
    }

    public void drawLandscapePainting(){
        landscapePainting.draw();
    }
    public void drawSketchPainting(){
        sketchPainting.draw();
    }


}
