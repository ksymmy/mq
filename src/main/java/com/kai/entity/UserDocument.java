package com.kai.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDocument implements Serializable {
    private String id;
    private String name;
    private String sex;
    private Integer age;
    private String city;
}