package com.cninfo.designpattern.structural.bridge_composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatelog extends CatelogComponent {
    private String name;
    private Integer level;

    public CourseCatelog(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    private List<CatelogComponent> items = new ArrayList<>();

    @Override
    public void add(CatelogComponent catelogComponent) {
        items.add(catelogComponent);
    }

    @Override
    public void remove(CatelogComponent catelogComponent) {
        items.remove(catelogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        for (CatelogComponent item : items) {
            if (level != null) {
                for (Integer i = 0; i < level; i++) {
                    System.out.print(" ");
                }
            }
            item.print();
        }
    }
}
