/*
 * @Author  : 有勇气的牛排
 * @FileName: UserEntity.java
 * desc     :
 * */

package com.couragesteak.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cs")
public class UserEntity {
    private String name;
    private String star;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getstar() {
        return star;
    }

    public void setstar(String star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", star='" + star + '\'' +
                '}';
    }
}
