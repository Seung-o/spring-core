package spring.core.scan.filter;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

public class ComponentFilterAppConfigTest {

    @Test
    void filterScan() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentFilterAppConfig.class);
        BeanA beanA = context.getBean(BeanA.class);
        Assertions.assertThat(beanA).isNotNull();
        org.junit.jupiter.api.Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> context.getBean(BeanB.class));
    }

    @Configuration
    @ComponentScan(includeFilters = @Filter(MyIncludeComponent.class),
            excludeFilters = @Filter(MyExcludeComponent.class))
    static class ComponentFilterAppConfig {

    }
}
