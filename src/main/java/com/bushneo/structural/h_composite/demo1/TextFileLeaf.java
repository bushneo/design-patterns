package com.bushneo.structural.h_composite.demo1;

/**
 * 文本文件（叶子组件）
 * @author bushneo
 * @create 2019-01-01 15:44
 */
public class TextFileLeaf implements AbstractFileComponent {
    private String name;

    public TextFileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文本文件："+name);
    }
}
