package os.cloud.pub.common.base.entity;

import java.io.Serializable;

/**
 * @author guoxuehe
 * @date 2020/12/13 下午4:14
 * @desc
 **/
public interface Timestamp<T extends Serializable> {
    String DEFAULT_FILE_NAME = "ts";
    String DEFAULT_CREATETIME_FILE_NAME = "gmt_create";
    String DEFAULT_DELETE_FILE_NAME = "dr";

    T getTs();

    void setTs(T ts);
}
