package com.bushneo.behavioral.n_mediator.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * 总裁
 * @author bushneo
 * @create 2019-01-05 12:31
 */
public class President implements Mediator{

    private Map<String,Department> map = new HashMap();

    @Override
    public void register(String name, Department department) {
        map.put(name,department);
    }

    @Override
    public void command(String name) {
        map.get(name).handleByMyself();
    }
}
