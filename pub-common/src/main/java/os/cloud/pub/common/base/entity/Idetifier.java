package os.cloud.pub.common.base.entity;

import java.io.Serializable;

/**
 * @author guoxuehe
 * @date 2020/12/13 下午4:03
 * @desc
 **/
public interface Idetifier<T extends Serializable> {
    String DEFAULT_FILE_NAME = "id";

    T getId();
    void setId(T t);
}
