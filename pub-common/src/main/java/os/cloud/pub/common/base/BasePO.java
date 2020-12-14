package os.cloud.pub.common.base;

import os.cloud.pub.common.base.entity.DeleteRecord;
import os.cloud.pub.common.base.entity.Idetifier;
import os.cloud.pub.common.base.entity.TenantIdentifier;
import os.cloud.pub.common.base.entity.Timestamp;

import java.io.Serializable;
import java.util.Date;

/**
 * @author guoxuehe
 * @date 2020/12/13 下午4:01
 * @desc
 **/
public class BasePO<T extends Serializable> implements Idetifier, TenantIdentifier, Timestamp<Date>,DeleteRecord {
    private T id;
    private String tenantId;
    private Date ts;
    private Integer dr;

    @Override
    public Integer getDr() {
        return dr;
    }

    @Override
    public void setDr(Integer dr) {
        this.dr = dr;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public void setId(Serializable serializable) {
        this.id = id;
    }

    @Override
    public String getTenantId() {
        return tenantId;
    }

    @Override
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public Date getTs() {
        return ts;
    }

    @Override
    public void setTs(Date ts) {
        this.ts = ts;
    }
}
