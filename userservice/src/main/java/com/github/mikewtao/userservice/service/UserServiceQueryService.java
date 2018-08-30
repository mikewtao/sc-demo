package com.github.mikewtao.userservice.service;

import com.github.mikewtao.pojo.common.UserQueryParam;
import com.github.mikewtao.pojo.userservice.User;
import com.github.mikewtao.userservice.dao.UserServiceQueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceQueryService {

    @Autowired
    private UserServiceQueryMapper userServiceQueryMapper;

    /**
     * 用户查询通用服务
     * @param param 查询基础参数的封装对象
     * @return
     */
    public List<User> UserServiceQueryFromDb(UserQueryParam param){
        List<User> users =new ArrayList<>();
        try {
            users=userServiceQueryMapper.queryUserByLevelFromDb(param.getLevel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
