package com.my.service.impl;

import com.my.entity.TbPermission;
import com.my.mapper.TbPermissionMapper;
import com.my.service.TbPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Autowired
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        tbPermissionMapper.selectByUserId(userId);
        return tbPermissionMapper.selectByUserId(userId);
    }
}