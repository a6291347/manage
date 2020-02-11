package com.aahh.dao;

import com.aahh.model.User;

import javax.annotation.Resource;

/**
 * @author hzh
 * @create 2020-02-07 18:45
 */
@Resource
public interface IUser {


    User getUserByID (int id);
}
