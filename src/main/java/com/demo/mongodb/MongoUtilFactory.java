package com.demo.mongodb;

/**
 * MongoDB工具工厂类(支持多数据源,单例模式,工厂模式)
 *
 * @author jerome
 */
public class MongoUtilFactory {

	/**
	 * MongoDB数据源1
	 * 
	 * @author：jerome
	 * @return
	 */
	public static MongoUtilI mongoUtil1() {
		return MongoUtil1.getInstance();
	}

	/**
	 * MongoDB数据源2
	 * 
	 * @author：jerome
	 * @return
	 */
	public static MongoUtilI mongoUtil2() {
		return MongoUtil2.getInstance();
	}
}
