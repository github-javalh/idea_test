package com.alipay.mapper;

import com.aliapy.pojo.Users;

import java.util.List;

/**
 * @author LH
 * @create 2019-11-20
 * @Description:com.alipay.mapper
 * @Version:1.0
 */
public interface UsersMapper {
    int insertUser(Users users);

    List<Users> selectAllUser();
}
