package com.bank.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userFallBackMethod")
    public String userServiceFallBackMethod() {
        return "It seems that something went wrong with the User Service." +
                " Please try again later";
    }

    @GetMapping("/accountFallBackMethod")
    public String accountServiceFallBackMethod() {
        return "It seems that something went wrong with the Account Service." +
                " Please try again later";
    }

    @GetMapping("/loanFallBackMethod")
    public String loanServiceFallBackMethod() {
        return "It seems that something went wrong with the Loan Service." +
                " Please try again later";
    }

    @GetMapping("/investmentFallBackMethod")
    public String investmentServiceFallBackMethod() {
        return "It seems that something went wrong with the Investment Service." +
                " Please try again later";
    }

    @GetMapping("/emailFallBackMethod")
    public String emailServiceFallBackMethod() {
        return "It seems that something went wrong with the Email Service." +
                " Please try again later";
    }

}
