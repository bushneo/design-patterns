package com.bushneo.structural.j_facade.demo1;

/**
 * 素描画
 * @author bushneo
 * @create 2019-01-01 18:32
 */
public class SketchPainting implements Painting {

    @Override
    public void draw() {
        System.out.println("素描画已经完成");
    }
}
