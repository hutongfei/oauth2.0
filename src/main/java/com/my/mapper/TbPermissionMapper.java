package com.my.mapper;

import com.my.entity.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import java.util.List;

public interface TbPermissionMapper  extends Mapper<TbPermission>, MySqlMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}