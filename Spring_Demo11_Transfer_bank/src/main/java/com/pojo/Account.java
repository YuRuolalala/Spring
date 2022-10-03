package com.pojo;

public class Account {
    private Integer id;
    private String name;
    private Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoneyl() {
        return money;
    }

    public void setMoneyl(Integer moneyl) {
        this.money = moneyl;
    }

    public Account() {
    }

    public Account(Integer id, String name, Integer moneyl) {
        this.id = id;
        this.name = name;
        this.money = moneyl;
    }
}
