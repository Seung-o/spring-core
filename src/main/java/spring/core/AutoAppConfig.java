package spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
// 보통 설정 정보를 컴포넌트 스캔 대상에서 제외하지 않지만, 기존 예제 코드를 최대한 유지하기 위해 제외함
public class AutoAppConfig {
}
