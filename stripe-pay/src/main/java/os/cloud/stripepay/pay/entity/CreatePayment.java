package os.cloud.stripepay.pay.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author guoxuehe
 * @date 2020/12/17 上午11:19
 * @desc
 **/
@Data
public class CreatePayment {
    @SerializedName("item")
    Object[] items;
}
