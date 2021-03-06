/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Description:
 * FileName: Users
 * author：LH
 * date：Created in 2019/11/20
 * since 1.0.0
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.aliapy.pojo;

import java.io.Serializable;

/**
 * @author LH
 * @create 2019-11-20
 * @Description:com.aliapy.pojo
 * @Version:1.0
 */
public class Users implements Serializable {
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
