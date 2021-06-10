//package com.mayikt.aop;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Enumeration;
//
///**
// * 定义一个切面 拦截包
// */
//@Aspect
//@Component
//@Slf4j
//public class WebLogAspect {
//
//	//private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
//
//	/**
//	 * 切入点 *com.mayikt.service 包下所有的类
//	 * 第一个 * 表示该类中所有方法
//	 * 第二个 .*(..) 所有的方法参数
//	 */
//	@Pointcut("execution(public * com.mayikt.service.*.*(..))")
//	public void webLog() {
//	}
//
//	/**
//	 * 前置通知 请求方法之前做拦截
//	 * @param joinPoint
//	 * @throws Throwable
//	 */
//	@Before("webLog()")
//	public void doBefore(JoinPoint joinPoint) throws Throwable {
//		// 接收到请求，记录请求内容
//		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//		HttpServletRequest request = attributes.getRequest();
//		// 记录下请求内容
//		log.info("URL : " + request.getRequestURL().toString());
//		log.info("HTTP_METHOD : " + request.getMethod());
//		log.info("IP : " + request.getRemoteAddr());
//		Enumeration<String> enu = request.getParameterNames();
//		while (enu.hasMoreElements()) {
//			String name = (String) enu.nextElement();
//			log.info("name:{},value:{}", name, request.getParameter(name));
//		}
//	}
//
//	/**
//	 * 目标方法请求之后 打印(响应)信息
//	 * @param ret
//	 * @throws Throwable
//	 */
//	@AfterReturning(returning = "ret", pointcut = "webLog()")
//	public void doAfterReturning(Object ret) throws Throwable {
//		// 处理完请求，返回内容
//		log.info("RESPONSE : " + ret);
//	}
//}