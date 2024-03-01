package spring.core.discount;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PolicyController {
    private final DiscountPolicy discountPolicy;

    public PolicyController(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    @PostMapping("/policy")
    public void policy() {
        discountPolicy.discount(null, 0);
    }
}
