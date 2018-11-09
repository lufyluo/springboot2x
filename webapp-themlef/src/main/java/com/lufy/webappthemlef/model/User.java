package com.lufy.webappthemlef.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull(message = "id不能为空")
    private Integer id;
    @NotNull(message = "name不能为空")
    private String name;
    @Min(value = 0,message = "最小值0")
    @Max(value = 100,message= "最大值100")
    private int age;
    @Size(min = 5,max = 20,message = "字符串长度在5-20")
    private String address;

    public User(Integer id, String name, int age, String address) {
        this.id=id;
        this.name = name;
        this.age= age;
        this.address = address;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
