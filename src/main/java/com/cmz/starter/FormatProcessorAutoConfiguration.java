package com.cmz.starter;
/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午4:43:53
 * @description 类型转换自动装载实现类
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.cmz.starter.format.FormatProcessor;
import com.cmz.starter.format.impl.JsonFormatProcessor;
import com.cmz.starter.format.impl.StringFormatProcessor;

@Configuration
public class FormatProcessorAutoConfiguration {

	@ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
	@Bean
	@Primary
	public FormatProcessor stringFormat() {
		return new StringFormatProcessor();
	}
	
	@ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
	@Bean
	public FormatProcessor jsonFormat() {
		return new JsonFormatProcessor();
	}
	
}
