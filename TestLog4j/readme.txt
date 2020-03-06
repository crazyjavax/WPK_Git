
使用commons-logging + log4j作为日志框架，集成步骤如下：

1、将log4j.properties放到工程的src目录下
2、将如下包放到WEB-INF/lib目录下：
	commons-logging-api-1.1.jar		---- apache提供的，定义JCL接口。
	commons-logging-1.2.jar      	---- apache集成了JCL接口，以及一些实现。
	log4j-1.2.8.jar					---- log4j的核心类。

	
%m：输出代码中指定的消息，如log(message)中的message 
%c：输出所属的类目，通常就是所在类的全名。  
%t：输出产生该日志线程的线程名。  
%n：输出一个回车换行符。Windows平台为“\r\n”，UNIX为“\n”。  
%d：输出日志时间点的日期或时间，默认格式为ISO8601，推荐使用“%d{ABSOLUTE}”，这个输出格式形如：“2007-05-07 18:23:23,500”，符合中国人习惯。  
%l：输出日志事件发生的位置，包括类名、线程名，以及所在代码的行数。  
%f：输出日志信息所属的类的类名 
%p：输出优先级，即DEBUG，INFO，WARN，ERROR，FATAL。如果是调用debug()输出的，则为DEBUG，依此类推  
%r：输出自应用启动到输出该日志信息所耗费的毫秒数

其他参考：

commons-logging与commons-logging-api的区别

* commons-logging.jar
The commons-logging.jar file includes the JCL API, the default LogFactory implementation and thin-wrapper Log implementations for Log4J, Avalon LogKit, the Avalon Framework's logging infrastructure, JDK 1.4, as well as an implementation of JDK 1.4 logging APIs (JSR-47) for pre-1.4 systems.

In most cases, including commons-logging.jar and your preferred logging implementation in the classpath should be all that is required to use JCL.

* commons-logging-api.jar
The commons-logging-api.jar file includes the JCL API and the default LogFactory implementation as well as the built-in Log implementations SimpleLog and NoOpLog. However it does not include the wrapper Log implementations that require additional libraries such as Log4j, Avalon and Lumberjack.

This jar is intended for use by projects that recompile the commons-logging source using alternate java environments, and cannot compile against all of the optional libraries that the Apache release of commons-logging supports. Because of the reduced dependencies of this jarfile, such projects should be able to create an equivalent of this library with fewer difficulties.

This jar is also useful for build environments that automatically track dependencies, and thus have difficulty with the concept that the main commons-logging.jar has "optional" dependencies on various logging implementations that can safely go unsatisfied at runtime.




