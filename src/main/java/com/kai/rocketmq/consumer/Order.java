package com.kai.rocketmq.consumer;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : wkcheng
 * @description:
 * @date : 2021/5/25 8:58
 **/
public class Order implements Serializable {

    private Long id;

    private String name;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order(Long id, String name, Date createTime) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
