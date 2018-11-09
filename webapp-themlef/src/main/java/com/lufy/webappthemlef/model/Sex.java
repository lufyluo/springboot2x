package com.lufy.webappthemlef.model;

public enum Sex {
    male,female;
    public static Sex value(int value){
        return Sex.values()[value];
    }
}
