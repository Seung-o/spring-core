package spring.core.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.AppConfig;
import spring.core.member.MemberRepository;
import spring.core.member.MemberServiceImpl;
import spring.core.order.OrderServiceImpl;

public class ConfigurationSingletonTest {
    @Test
    void configurationTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberService = context.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl orderService = context.getBean("orderService", OrderServiceImpl.class);

        MemberRepository memberRepository1 = memberService.getMemberRepository();
        MemberRepository memberRepository2 = orderService.getMemberRepository();
        MemberRepository memberRepository3 = context.getBean(MemberRepository.class);

        System.out.println("memberRepository1 = " + memberRepository1);
        System.out.println("memberRepository2 = " + memberRepository2);
        System.out.println("memberRepository3 = " + memberRepository3);

        Assertions.assertSame(memberRepository1, memberRepository2);
    }
}
