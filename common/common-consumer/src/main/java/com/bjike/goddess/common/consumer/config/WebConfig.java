package com.bjike.goddess.common.consumer.config;

import com.bjike.goddess.common.consumer.interceptor.SecurityIntercept;
import com.dounine.japi.common.springmvc.CustomRequestMappingHandlerMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Author: [liguiqin]
 * @Date: [2017-01-15 10:10]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Component
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new SecurityIntercept()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

}
