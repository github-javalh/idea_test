package com.alipay.web.service.impl;

import com.aliapy.pojo.Users;
import com.alipay.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author LH
 * @create 2019-11-20
 * @Description:com.alipay.web.service.impl
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext-dao.xml", "classpath:spring/applicationContext-service.xml" , "classpath:spring/springmvc.xml" })
public class UsersServiceImplTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUser(){
        Users users = new Users();
        users.setUserName("admin");
        users.setPassword("123456");
        users.setAge(20);
        int rows = usersMapper.insertUser(users);
        System.out.println("rows="+rows);
    }


}