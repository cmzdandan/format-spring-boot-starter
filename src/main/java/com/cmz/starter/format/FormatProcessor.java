package com.cmz.starter.format;

/**
 * @author chen.mz
 * @email 1034667543@qq.com
 * @create 2019年7月13日 下午4:08:18
 * @description 格式转换处理器
 */
public interface FormatProcessor {

	/**
	 * 定义一个格式化的方法
	 * 
	 * @param t
	 *            待转换的对象
	 * @return 返回转换成String类型的结果
	 */
	<T> String format(T t);

}
