package com.my.mapper;

import com.my.entity.TbPermission;
import com.my.entity.TbUser;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface TbUserMapper extends Mapper<TbUser>, MySqlMapper<TbUser> {
}