package os.cloud.stripepay.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import os.cloud.stripepay.pay.service.CheckPayService;

/**
 * @author guoxuehe
 * @date 2020/12/17 上午9:25
 * @desc
 **/
@RestController
@RequestMapping("/check")
public class CheckPayController {
    @Autowired
    private CheckPayService checkPayService;

    @PostMapping("/create-payment-intent")
    public Object customPaymentFlow(){

        checkPayService.customPaymentFlow("usd",1400L);
        return "SUCCESS";
    }
}
