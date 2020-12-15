package os.cloud.publogin.base.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;
import os.cloud.publogin.base.login.entity.SysUserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysPermissionService sysPermissionService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(StringUtils.isEmpty(username)){
            throw new RuntimeException("用户不能为空");
        }
        SysUserEntity sysUserEntity = sysUserService.selectByName(username);
        if(Objects.isNull(sysUserEntity)){
            throw new RuntimeException("用户不存在");
        }

        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        return new User(sysUserEntity.getAccount(),sysUserEntity.getPassword(),
                sysUserEntity.getEnabled(),sysUserEntity.getAccountNonExpired(),
                sysUserEntity.getCredentialsNonExpired(),sysUserEntity.getAccountNonLocked(),grantedAuthorityList);
    }
}
