package os.cloud.stripepay.functional;

/**
 * @author guoxuehe
 * @date 2020/12/13 下午7:39
 * @desc
 **/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.model.Account;
import com.stripe.model.File;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;
import os.cloud.stripepay.BaseStripeTest;

public class AccountTest extends BaseStripeTest {
    /*
    {"business_profile":{"mcc":null,"name":null,"product_description":null,"support_address":null,"support_email":null,"support_phone":null,"support_url":null,"url":null},"business_type":null,"capabilities":{"card_payments":"active","transfers":"active"},"charges_enabled":false,"country":"US","created":1234567890,"default_currency":"usd","details_submitted":false,"email":"site@stripe.com","external_accounts":{"data":[{"account_holder_name":"Jane Austen","account_holder_type":"individual","bank_name":"STRIPE TEST BANK","country":"US","currency":"usd","customer":null,"fingerprint":"1JWtPxqbdX5Gamtz","id":"ba_1HbxcxIigeqZG9AmGJNgw1bl","last4":"6789","metadata":{},"object":"bank_account","routing_number":"110000000","status":"new"}],"has_more":false,"object":"list","url":"/v1/accounts/acct_123/external_accounts"},"id":"acct_123","metadata":{},"object":"account","payouts_enabled":false,"requirements":{"current_deadline":null,"currently_due":["business_profile.product_description","business_profile.support_phone","business_profile.url","external_account","tos_acceptance.date","tos_acceptance.ip"],"disabled_reason":"requirements.past_due","errors":[],"eventually_due":["business_profile.product_description","business_profile.support_phone","business_profile.url","external_account","tos_acceptance.date","tos_acceptance.ip"],"past_due":[],"pending_verification":[]},"settings":{"bacs_debit_payments":{},"branding":{"icon":null,"logo":null,"primary_color":null,"secondary_color":null},"card_payments":{"decline_on":{"avs_failure":true,"cvc_failure":true},"statement_descriptor_prefix":null},"dashboard":{"display_name":null,"timezone":"Etc/UTC"},"payments":{"statement_descriptor":null,"statement_descriptor_kana":null,"statement_descriptor_kanji":null},"payouts":{"debit_negative_balances":true,"schedule":{"delay_days":2,"interval":"daily"},"statement_descriptor":null}},"tos_acceptance":{"date":null,"ip":null,"user_agent":null},"type":"standard"}
     */
    @Test
    public void testDeserialize() throws Exception {
        final String data = getFixture("/v1/accounts/acct_123");
        final Account resource = ApiResource.GSON.fromJson(data, Account.class);
        assertNotNull(resource);
        assertNotNull(resource.getId());
    }

    @Test
    public void testDeserializeWithExpansions() throws Exception {
        final String[] expansions = {
                "settings.branding.icon", "settings.branding.logo",
        };
        final String data = getFixture("/v1/accounts/acct_123", expansions);

        final Account resource = ApiResource.GSON.fromJson(data, Account.class);
        assertNotNull(resource);
        assertNotNull(resource.getId());

        final File icon = resource.getSettings().getBranding().getIconObject();
        assertNotNull(icon);
        assertNotNull(icon.getId());
        assertEquals(resource.getSettings().getBranding().getIcon(), icon.getId());

        final File logo = resource.getSettings().getBranding().getLogoObject();
        assertNotNull(logo);
        assertNotNull(logo.getId());
        assertEquals(resource.getSettings().getBranding().getLogo(), logo.getId());
    }
}
