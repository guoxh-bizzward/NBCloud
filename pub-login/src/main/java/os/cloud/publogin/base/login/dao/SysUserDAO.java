package os.cloud.publogin.base.login.dao;

import os.cloud.publogin.base.login.entity.SysUserEntity;

public interface SysUserDAO {

    SysUserEntity selectByName(String name);
}
