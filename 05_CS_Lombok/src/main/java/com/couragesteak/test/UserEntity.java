/*
 * @Author  : 有勇气的牛排
 * @FileName: UserEntity.java
 * desc     :
 * */

package com.couragesteak.test;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class UserEntity {

    private Integer id;
    private String userName;
    private Integer age;

    public UserEntity() {
    }

    public UserEntity(Integer id, String userName, Integer age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity(1,"有勇气的牛排",20);
        System.out.println(userEntity.toString());
        System.out.println(userEntity.getUserName());
    }
}
