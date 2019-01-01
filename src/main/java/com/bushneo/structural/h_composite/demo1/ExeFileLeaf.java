package com.bushneo.structural.h_composite.demo1;

/**
 * exe文件（叶子组件）
 * @author bushneo
 * @create 2019-01-01 15:44
 */
public class ExeFileLeaf implements AbstractFileComponent {
    private String name;

    public ExeFileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀exe文件："+name);
    }

}
