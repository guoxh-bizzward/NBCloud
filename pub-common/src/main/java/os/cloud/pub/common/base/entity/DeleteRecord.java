package os.cloud.pub.common.base.entity;

/**
 * @author guoxuehe
 * @date 2020/12/13 下午4:15
 * @desc
 **/
public interface DeleteRecord {
    String DEFAULT_FILE_NAME = "dr";
    Integer DELETED = 1;
    Integer NORMAL = 0;

    Integer getDr();

    void setDr(Integer dr);
}
