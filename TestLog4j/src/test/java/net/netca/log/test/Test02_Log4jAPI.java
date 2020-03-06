package net.netca.log.test;

import org.apache.log4j.Logger;

/**
 * 说明：
 * 基于log4j的运行方式，使用log4j原生的API进行打印日志。
 * 
 * @author 	cgq, 2016-5-9
 */
public class Test02_Log4jAPI {
	
	private static Logger logger = Logger.getLogger(Test02_Log4jAPI.class);
	
	public static void main(String[] args) {
		
		//测试log4j的各个级别输出打印
		logger.debug("testing debug...");
		logger.info("testing info...");
		logger.warn("testing warn...");
		logger.fatal("testing fatal...");
		
	}
	
}
