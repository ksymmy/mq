package com.kai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author : wkcheng
 * @description:
 * @date : 2021/5/28 14:18
 **/
@Data
public class Student {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private Date birthDay;
}
