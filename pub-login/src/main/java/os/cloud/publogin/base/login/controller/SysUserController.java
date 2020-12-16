package os.cloud.publogin.base.login.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import os.cloud.publogin.base.login.service.ISysUserService;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "用户管理模块")
@RestController
@RequestMapping("/sysuser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation("用户列表查询")
    @GetMapping("/list")
    public Object list(HttpServletRequest request){
        return sysUserService.list();
    }
}
