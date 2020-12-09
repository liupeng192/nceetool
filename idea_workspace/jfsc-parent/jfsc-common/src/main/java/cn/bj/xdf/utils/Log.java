package cn.bj.xdf.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Log {
	static final Logger logger = LoggerFactory.getLogger(Log.class);
	
    public static StackTraceElement findCaller() {
        // 获取堆栈信息
        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        if(null == callStack) return null;

        // 最原始被调用的堆栈信息
        StackTraceElement caller = null;
        // 日志类名称
        String logClassName = Log.class.getName();
        // 循环遍历到日志类标识
        boolean isEachLogClass = false;

        // 遍历堆栈信息，获取出最原始被调用的方法信息
        for (StackTraceElement s : callStack) {
            // 遍历到日志类
            if(logClassName.equals(s.getClassName())) {
                isEachLogClass = true;
            }
            // 下一个非日志类的堆栈，就是最原始被调用的方法
            if(isEachLogClass) {
                if(!logClassName.equals(s.getClassName())) {
                    isEachLogClass = false;
                    caller = s;
                    break;
                }
            }
        }

        return caller;
    }
    
    private static Logger logger() {
        // 最原始被调用的堆栈对象
        StackTraceElement caller = findCaller();
        if(null == caller) return LoggerFactory.getLogger(Log.class);

        Logger log = LoggerFactory.getLogger(caller.getClassName() + "." + caller.getMethodName() + "() Line: " + caller.getLineNumber());

        return log;
    }
    
    public static void trace(String msg) {
        logger().trace(msg);
    }
    
    public static void trace(String msg, Throwable e) {
        logger().trace(msg, e);
    }
    
    public static void trace(String format, Object... arguments) {
        logger().trace(format, arguments);
    }
    
    
    public static void debug(String msg) {
    	logger().debug(msg);
    }
    
    public static void debug(String msg, Throwable e) {
        logger().debug(msg, e); 
    }
    
    public static void debug(String format, Object... arguments) {
        logger().debug(format, arguments); 
    }
    
    
    public static void info(String msg) {
    	logger().info(msg);
    }
    
    public static void info(String msg, Throwable e) {
        logger().info(msg, e);
    }
    
    public static void info(String format, Object... arguments) {
        logger().info(format, arguments);
    }
    
    
    public static void warn(String msg) {
    	logger().warn(msg);
    }
    
    public static void warn(String msg, Throwable e) {
        logger().warn(msg, e);
    }
    
    public static void warn(String format, Object... arguments) {
        logger().warn(format, arguments);
    }
    
    public static void error(String msg) {
    	logger().error(msg);
    }
    
    public static void error(String msg, Throwable e) {
        logger().error(msg, e);
    }
    
    public static void error(String format, Object... arguments) {
        logger().error(format, arguments);
    }
    
    public static boolean isDebugEnabled(){
    	return logger.isDebugEnabled();
    }
    
    public static void debug2JsonString(Object obj) {
    	String msg = JSON.toJSONString(obj,SerializerFeature.DisableCircularReferenceDetect);
    	logger().debug(msg);
    }
    
    public static void info2JsonString(Object obj) {
    	String msg = JSON.toJSONString(obj,SerializerFeature.DisableCircularReferenceDetect);
    	logger().info(msg);
    }
}