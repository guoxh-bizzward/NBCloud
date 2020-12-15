package os.cloud.publogin.base.login.dao;

import os.cloud.publogin.base.login.entity.SysPermissionEntity;

import java.util.List;

public interface SysPermissionDAO {
    List<SysPermissionEntity> selectListByUser(String userId);
}
