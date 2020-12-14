package os.cloud.publogin.app.vo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @author guoxuehe
 * @date 2020/12/13 下午3:45
 * @desc
 **/
@Data
@TableName(value = "pub_tenant_user")
public class PubTenantUser {
    @TableId(value = "user_id",type = IdType.ASSIGN_ID)
    private Long userId;
    @TableField(value = "user_code")
    private String userCode;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "tenant_id")
    private String tenantId;
    @TableField(value = "user_email")
    private String userEmail;
    @TableField(value = "user_mobile_country_code")
    private String userMobileCountryCode;
    @TableField(value = "user_mobile")
    private String userMobile;
    @TableField(value = "user_password")
    private String userPassword;
    @TableField(value = "salt")
    private String salt;
    @TableField(value = "register_date")
    private String registerDate;
    @TableField(value = "user_status")
    private Integer userStatus;
    @TableField(value = "user_avator")
    private String userAvator;
    @TableField(value = "pwd_start_time")
    private String pwdStartTime;
    @TableField(value = "ts")
    @Version
    private String ts;
    @TableField(value = "dr")
    @TableLogic
    private Integer dr;

    @TableField(value = "system_id")
    private String systemId;
    @TableField(value = "source_id")
    private String sourceId;
    @TableField(value = "out_date")
    private String outDate;

}
