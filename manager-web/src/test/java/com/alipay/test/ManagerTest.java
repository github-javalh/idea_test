/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Description:
 * FileName: ManagerTest
 * author：LH
 * date：Created in 2019/11/20
 * since 1.0.0
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.alipay.test;

import com.aliapy.pojo.Users;
import com.alipay.mapper.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 @author LH
 @create 2019-11-20
 @Description:com.alipay.test
 @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void insertUser(){
        Users users = new Users();
        users.setUserName("hello");
        users.setPassword("123456");
        users.setAge(18);
        int rows = usersMapper.insertUser(users);
        System.out.println("rows="+rows);
    }

}
