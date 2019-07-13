package com.cmz.starter;
/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午4:25:12
 * @description 对外提供使用的入口template
 */

import com.cmz.starter.format.FormatProcessor;

public class FormatTemplate {

	private FormatProcessor formatProcessor;
	
	public FormatTemplate(FormatProcessor formatProcessor) {
		this.formatProcessor = formatProcessor;
	}
	
	public <T> String doFormat(T t) {
		StringBuilder sb = new StringBuilder();
		sb.append("Execute format:").append("\n");
		sb.append("format result:").append(formatProcessor.format(t)).append("\n");
		return sb.toString();
	}
	
}
