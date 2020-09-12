package com.my.service.impl;

import com.my.mapper.TbRoleMapper;
import com.my.service.TbRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}