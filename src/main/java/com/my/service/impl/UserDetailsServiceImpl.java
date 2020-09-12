package com.my.service.impl;

import com.my.entity.TbPermission;
import com.my.entity.TbUser;
import com.my.service.TbPermissionService;
import com.my.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sun.security.provider.PolicyParser;

import java.util.ArrayList;
import java.util.List;

/**
 *  * 自定义用户认证与授权
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser user = tbUserService.getByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(user.getId());
        tbPermissions.forEach(permission -> {
            if (permission != null) {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                grantedAuthorities.add(grantedAuthority);
            }
        });
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
