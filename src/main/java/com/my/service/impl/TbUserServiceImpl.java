package com.my.service.impl;


import com.my.entity.TbUser;
import com.my.mapper.TbUserMapper;
import com.my.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * 实现自定义认证授权时可以通过数据库查询用户信息
 * Spring Security oAuth2 要求使用 username 的方式查询，提供相关用户信息后，认证工作由框架自行完成
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }
}