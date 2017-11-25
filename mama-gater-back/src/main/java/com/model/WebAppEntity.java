package com.model;

import io.swagger.annotations.ApiModelProperty;

public class WebAppEntity {
    @ApiModelProperty(notes = "id of the user")
    private int id;
    @ApiModelProperty(notes = "name of the user")
    private String name;

    public WebAppEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WebAppEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
