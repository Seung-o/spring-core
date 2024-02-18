package spring.core.discount;

import org.springframework.stereotype.Component;
import spring.core.annotation.SubDiscountPolicy;
import spring.core.member.Grade;
import spring.core.member.Member;

@Component
@SubDiscountPolicy
public class FixDiscountPolicy implements DiscountPolicy {

    private final int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }

        return 0;
    }
}
