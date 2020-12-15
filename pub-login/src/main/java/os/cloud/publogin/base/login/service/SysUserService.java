package os.cloud.publogin.base.login.service;

import org.springframework.stereotype.Service;
import os.cloud.publogin.base.login.entity.SysUserEntity;

@Service
public class SysUserService {

    SysUserEntity selectByName(String name){
        return new SysUserEntity();
    }
}
