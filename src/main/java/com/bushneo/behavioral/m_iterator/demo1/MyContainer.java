package com.bushneo.behavioral.m_iterator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义容器（具体类）
 * @author bushneo
 * @create 2019-01-03 23:33
 */
public class MyContainer implements Container {
    private List list = new ArrayList();

    public void addObject(Object obj) {
        this.list.add(obj);
    }

    public void removeObject(Object obj) {
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public MyIterator getIterator() {
        return new MyContainerIterator();
    }

    private class MyContainerIterator implements MyIterator {

        //游标，记录遍历的位置
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0 ? true : false;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size() - 1) ? true : false;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
