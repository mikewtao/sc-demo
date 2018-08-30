package com.github.mikewtao.userservice.controller;

import com.github.mikewtao.pojo.common.UserQueryParam;
import com.github.mikewtao.pojo.userservice.User;
import com.github.mikewtao.userservice.service.UserServiceQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * 用户服务--查询用户基本信息
 */
@RestController
public class QueryUserBasicInfoController {

    @Autowired
    private UserServiceQueryService userServiceQueryService;

    /**
     * 根据用户等级查询用户
     * 版本： 0.1
     * 维护者：mikewt
     * @param level 用户等级
     * @return 符合等级的用户列表
     */
    @RequestMapping("/user/getUserByLevel")
    public List<User> getUserByLevel(@RequestBody Integer level){
        if(level==null||level<0){
            throw new IllegalArgumentException("用户等级不合法");
        }
        UserQueryParam param=new UserQueryParam();
        param.setLevel(level);
        return userServiceQueryService.UserServiceQueryFromDb(param);
    }

    @RequestMapping("/user/checkUserStatus")
    public String checkUserStatus(){
        return "OK!";
    }
}
