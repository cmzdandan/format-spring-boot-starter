package com.cmz.starter.format.impl;

import java.util.Objects;

import com.cmz.starter.format.FormatProcessor;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午4:11:09
 * @description String类型格式转换处理器
 */
public class StringFormatProcessor implements FormatProcessor {

	@Override
	public <T> String format(T t) {
		return "StringFormatProcessor: " + Objects.toString(t);
	}

}
