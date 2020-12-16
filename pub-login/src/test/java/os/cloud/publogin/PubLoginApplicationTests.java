package os.cloud.publogin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import os.cloud.publogin.base.login.dao.SysUserMapper;
import os.cloud.publogin.base.login.entity.SysUserEntity;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class PubLoginApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    public void sysUserTest(){
        List<SysUserEntity> userEntityList = sysUserMapper.selectList(null);
        System.out.println(userEntityList.size());
    }

}
