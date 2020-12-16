package os.cloud.publogin.base.login.service;

import com.baomidou.mybatisplus.extension.service.IService;
import os.cloud.publogin.base.login.entity.SysUserEntity;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author jobob
 * @since 2020-12-15
 */
public interface ISysUserService extends IService<SysUserEntity> {

    SysUserEntity selectByName(String name);
}
