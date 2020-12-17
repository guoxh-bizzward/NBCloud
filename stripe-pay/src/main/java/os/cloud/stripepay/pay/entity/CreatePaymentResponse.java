package os.cloud.stripepay.pay.entity;

/**
 * @author guoxuehe
 * @date 2020/12/17 上午11:19
 * @desc
 **/
public class CreatePaymentResponse {
    private String clientSecret;

    public CreatePaymentResponse(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
