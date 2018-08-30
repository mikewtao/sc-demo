package com.github.mikewtao.feignclient.userservice;

import com.github.mikewtao.pojo.userservice.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *  用户服务调用工具
 *
 */
@FeignClient("sc-userservice")
public interface UserServiceClientInterface {

    @RequestMapping("/user/getUserByLevel")
    List<User> getUserByLevel(@RequestBody Integer level);

}
