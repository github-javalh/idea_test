/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Description:
 * FileName: UsersController
 * author：LH
 * date：Created in 2019/11/20
 * since 1.0.0
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.alipay.web.controller;

import com.aliapy.pojo.Users;
import com.alipay.web.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LH
 * @create 2019-11-20
 * @Description:com.alipay.web.controller
 * @Version:1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        System.out.println("username="+users.getUserName()+",password="+users.getPassword()+",age="+users.getAge());
        usersService.addUser(users);
        return "ok";
    }
    public void sayHi(){
        System.out.println("hello hangzhou");
    }

}
