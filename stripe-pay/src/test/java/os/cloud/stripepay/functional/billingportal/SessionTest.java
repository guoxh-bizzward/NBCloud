package os.cloud.stripepay.functional.billingportal;

import com.stripe.exception.StripeException;
import com.stripe.model.billingportal.Session;
import com.stripe.net.ApiResource;
import com.stripe.param.billingportal.SessionCreateParams;
import org.junit.jupiter.api.Test;
import os.cloud.stripepay.BaseStripeTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author guoxuehe
 * @date 2020/12/14 上午9:28
 * @desc
 **/
public class SessionTest extends BaseStripeTest {
    public static final String SESSION_ID = "bps_123";

    /*
    <com.stripe.model.billingportal.Session@848958019 id=> JSON: {
  "created": 1234567890,
  "customer": "cus_123",
  "id": "bps_Fqse2eoStCxpP4E",
  "livemode": true,
  "object": "billing_portal.session",
  "return_url": "https://stripe.com/return",
  "url": "https://billing.stripe.com/session/{SESSION_SECRET}"
}
     */
    @Test
    public void testCreate() throws StripeException {
        SessionCreateParams params = SessionCreateParams.builder()
                .setCustomer("cus_123")
                .setReturnUrl("https://stripe.com/return")
                .build();
        final Session session = Session.create(params);
        verifyRequest(
                ApiResource.RequestMethod.POST,
                String.format("/v1/billing_portal/sessions"),
                params.toMap()
        );
        assertNotNull(session);

    }
}
