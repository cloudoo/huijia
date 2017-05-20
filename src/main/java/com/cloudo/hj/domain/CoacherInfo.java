package com.cloudo.hj.domain;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by cloudoo on 2017/5/14
 */
public class CoacherInfo implements Serializable{

    private Long id;
    private String account;
    private String name;
    private String description;
    private String tags;
    private String picDir;
    private Timestamp opTm;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public String getPicDir() {
        return picDir;
    }
    public void setPicDir(String picDir) {
        this.picDir = picDir;
    }

    public Timestamp getOpTm() {
        return opTm;
    }

    public void setOpTm(Timestamp opTm) {
        this.opTm = opTm;
    }
}
