package com.bushneo.behavioral.m_iterator.demo1;

/**
 * 自定义迭代接口
 * @author bushneo
 * @create 2019-01-03 23:15
 */
public interface MyIterator {

    /**
     * 游标指向第一个元素
     */
    void first();

    /**
     * 游标指向下一个元素
     */
    void next();

    /**
     * 是否有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 是否是第一个元素
     * @return
     */
    boolean isFirst();

    /**
     * 是否是最后一个元素
     * @return
     */
    boolean isLast();

    /**
     * 获取当前元素对象
     * @return
     */
    Object getCurrentObj();
}
