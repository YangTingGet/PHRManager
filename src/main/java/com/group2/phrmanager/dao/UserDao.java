package com.group2.phrmanager.dao;


import com.group2.phrmanager.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TINGTINGTING
 * 用户功能持久层接口
 */
@Repository
@Mapper
public interface UserDao {

    boolean add(UserEntity user);

    boolean delete(String userName);

    UserEntity find(String userName);

    List<UserEntity> findAll();

    boolean update(UserEntity newInfo);

    String selectPassword(String userName);

    boolean updatePassword(String userName,String password);
}


















