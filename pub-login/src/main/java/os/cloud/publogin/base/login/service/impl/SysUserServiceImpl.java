package os.cloud.publogin.base.login.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import os.cloud.publogin.base.login.dao.SysUserMapper;
import os.cloud.publogin.base.login.entity.SysUserEntity;
import os.cloud.publogin.base.login.service.ISysUserService;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUserEntity> implements ISysUserService {

    @Override
    public SysUserEntity selectByName(String name) {
        return new SysUserEntity();
    }
}
