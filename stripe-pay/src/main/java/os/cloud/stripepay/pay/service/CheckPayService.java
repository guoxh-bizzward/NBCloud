package os.cloud.stripepay.pay.service;

import com.google.gson.Gson;
import com.stripe.Stripe;
import com.stripe.model.PaymentIntent;
import com.stripe.net.HttpClient;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import os.cloud.stripepay.pay.entity.CreatePayment;
import os.cloud.stripepay.pay.entity.CreatePaymentResponse;
import spark.Spark;

/**
 * @author guoxuehe
 * @date 2020/12/17 上午9:29
 * @desc
 **/
@Service
public class CheckPayService {

    @Value("${stripe.apiKey}")
    private String stripApiKey;

    public void customPaymentFlow(String currency,Long orderAmount){
        Stripe.apiKey = stripApiKey;
        Stripe.overrideApiBase("http://39.105.194.192:12111");
        Stripe.overrideUploadBase("http://39.105.194.192:12111");
        Gson gson = new Gson();
        Spark.post(Stripe.getApiBase()+"/create-payment-intent",(request, response) ->{
            response.type("application/json");
            CreatePayment postBody = gson.fromJson(request.body(),CreatePayment.class);
            PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
                    .setCurrency(currency)
                    .setAmount(orderAmount)
                    .build();
            PaymentIntent intent = PaymentIntent.create(createParams);

            CreatePaymentResponse paymentResponse = new CreatePaymentResponse(
                    intent.getClientSecret()
            );
            System.out.println(gson.toJson(paymentResponse));
            return gson.toJson(paymentResponse);
        });
    }

    public void stripClient(){
        HttpURLConnectionClient client = new HttpURLConnectionClient();
    }

}
