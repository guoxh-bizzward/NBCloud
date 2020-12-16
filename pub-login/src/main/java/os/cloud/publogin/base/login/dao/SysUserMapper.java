package os.cloud.publogin.base.login.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import os.cloud.publogin.base.login.entity.SysUserEntity;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-12-15
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {

}
