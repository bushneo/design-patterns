package com.bushneo.structural.h_composite.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bushneo
 * @create 2019-01-01 16:15
 */
public class Folder implements FolderComposite {

    private  String name;

    private List<AbstractFileComponent> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFileComponent component) {
        list.add(component);
    }

    @Override
    public void remove(AbstractFileComponent component) {
        list.remove(component);
    }

    @Override
    public AbstractFileComponent getChild(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文件夹："+name);
        for (AbstractFileComponent abstractFileComponent : list) {
            abstractFileComponent.killVirus();
        }
    }
}
