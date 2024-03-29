package spring.core.xml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import spring.core.member.MemberService;

public class XmlAppContext {

    @Test
    void xmlAppContext() {
        ApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("appConfig.xml");
        MemberService memberService = genericXmlApplicationContext.getBean("memberService", MemberService.class);
        Assertions.assertInstanceOf(MemberService.class, memberService);
    }
}
