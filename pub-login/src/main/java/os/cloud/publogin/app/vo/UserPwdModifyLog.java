package os.cloud.publogin.app.vo;

import lombok.Data;

/**
 * @author guoxuehe
 * @date 2020/12/13 下午3:52
 * @desc
 **/
@Data
public class UserPwdModifyLog {
    private Long id;
    private Long userId;
//    private String registerDate;
    private String password;
    private String pwdModifyTime;
    private String ip;
    private String modifyWay;
}
