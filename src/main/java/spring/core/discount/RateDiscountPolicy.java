package spring.core.discount;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import spring.core.member.Grade;
import spring.core.member.Member;

@Service
@Primary
public class RateDiscountPolicy implements DiscountPolicy {

    private final int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }

        return 0;
    }
}
