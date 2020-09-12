package com.my.service;

import com.my.entity.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}