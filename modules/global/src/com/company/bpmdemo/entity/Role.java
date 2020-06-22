package com.company.bpmdemo.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Role implements EnumClass<String> {

    CUSTOMER("CUSTOMER"),
    COMPANY_OWNER("COMPANY_OWNER"),
    ADMINISTRATOR("ADMINISTRATOR");

    private String id;

    Role(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Role fromId(String id) {
        for (Role at : Role.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}