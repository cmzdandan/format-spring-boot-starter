package com.cmz.starter.format.impl;

import com.alibaba.fastjson.JSON;
import com.cmz.starter.format.FormatProcessor;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午4:11:35
 * @description Json格式类型转换器
 */
public class JsonFormatProcessor implements FormatProcessor {

	@Override
	public <T> String format(T t) {
		return "JsonFormatProcessor: " + JSON.toJSONString(t);
	}

}
