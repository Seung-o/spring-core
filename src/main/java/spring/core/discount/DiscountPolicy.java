package spring.core.discount;

import spring.core.member.Member;

public interface DiscountPolicy {
    /**
     * @param member 할인 대상 회원
     * @param price  할인 대상 금액
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
