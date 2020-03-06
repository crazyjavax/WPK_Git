package net.netca.log.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 说明：
 * 采用基于commons-logging方式调用并打印日志输出。【最佳实践】
 * 
 * @author 	cgq, 2016-5-9
 */
public class Test01_CommonsloggingForLog4j {
	
	private static Log log = LogFactory.getLog(Test01_CommonsloggingForLog4j.class);
	
	public static void main(String[] args) {
		//测试log4j的各个级别输出打印
		log.debug("testing debug...");
		log.info("testing info...");			// 生产环境一般采用info级别
		log.warn("testing warn...");
		log.error("testing error...");

		//打印异常信息要采用log.error(e.getMessage, e);
		try {
			int i = 1 / 0;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

	}
	
}
