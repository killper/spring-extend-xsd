package com.lz.spring.extendxsd.bean;

public class Tag {
    private String name;
    private String other1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    @Override
    public String toString() {
        return "name:"+this.name+",other1:"+this.other1;
    }
}
