package com.github.mikewtao.userservice.dao;

import com.github.mikewtao.pojo.userservice.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserServiceQueryMapper {

    @Select("select cnickid userid from tb_user where iopen=#{level}")
    List<User> queryUserByLevelFromDb(@Param("level") Integer level);

}
