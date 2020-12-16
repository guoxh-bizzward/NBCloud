package os.cloud.publogin.base.login.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {
    @TableId
    private Long id;
    @TableField(value = "account")
    private String account;
    //@TableField(value = "account")
    private String userName;
   // @TableField(value = "account")
    private String password;
    @TableField(value = "last_login_time")
    private String lastLoginTime;
    //@TableField(value = "account")
    private Boolean enabled;
    @TableField(value = "account_non_expired")
    private Boolean accountNonExpired;
    @TableField(value = "credentials_non_expired")
    private Boolean credentialsNonExpired;
    @TableField(value = "account_non_locked")
    private Boolean accountNonLocked;
    @TableField(value = "create_time")
    private String createTime;
    @TableField(value = "update_time")
    private String updateTime;
    @TableField(value = "create_user")
    private String createUser;
    @TableField(value = "update_user")
    private String updateUser;
}
