package com.company.bpmdemo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public abstract class AbstractEntity extends StandardEntity {
    private static final long serialVersionUID = 634478746229198483L;
    @Column(name = "NAME")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}