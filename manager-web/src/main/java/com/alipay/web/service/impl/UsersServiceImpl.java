/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Description:
 * FileName: UsersServiceImpl
 * author：LH
 * date：Created in 2019/11/20
 * since 1.0.0
 * History:
 * <author>          <date>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.alipay.web.service.impl;

import com.aliapy.pojo.Users;
import com.alipay.mapper.UsersMapper;
import com.alipay.web.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 @author LH
 @create 2019-11-20
 @Description:com.alipay.web.service.impl
 @Version:1.0
 */
@Service("userService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
      usersMapper.insertUser(users);
    }
}
