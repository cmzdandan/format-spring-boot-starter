package com.cmz.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cmz.starter.format.FormatProcessor;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午4:54:09
 * @description FormatTemplate自动装配的实现类
 */
@Import(FormatProcessorAutoConfiguration.class)
@Configuration
public class FormatTemplateAutoConfiguration {

	@Bean
	public FormatTemplate formatTemplate(FormatProcessor formatProcessor) {
		return new FormatTemplate(formatProcessor);
	}
	
}
