package os.cloud.publogin.base.login.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysUserEntity implements Serializable {
    private String account;
    private String password;
    private Boolean enabled;
    private Boolean accountNonExpired;
    private Boolean credentialsNonExpired;
    private Boolean accountNonLocked;
}
