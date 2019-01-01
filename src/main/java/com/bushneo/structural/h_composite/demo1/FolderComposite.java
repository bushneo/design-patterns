package com.bushneo.structural.h_composite.demo1;

/**
 * 容器组件
 * @author bushneo
 * @create 2019-01-01 15:46
 */
public interface FolderComposite extends AbstractFileComponent {

    void add(AbstractFileComponent component);

    void remove(AbstractFileComponent component);

    AbstractFileComponent getChild(int index);
}
