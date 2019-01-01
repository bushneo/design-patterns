package com.bushneo.structural.h_composite.demo1;

/**
 * 测试组合模式
 * @author bushneo
 * @create 2019-01-01 16:18
 */
public class Client {
    public static void main(String[] args) {
        Folder folder = new Folder("C盘");
        AbstractFileComponent file1, file2, file3;
        file1 = new TextFileLeaf("一个工程师的自我修养.txt");
        file2 = new ExeFileLeaf("idea.exe");
        file3 = new TextFileLeaf("Spring源码解读.txt");

        folder.add(file1);
        folder.add(file2);
        folder.add(file3);

        folder.killVirus();

    }

}
