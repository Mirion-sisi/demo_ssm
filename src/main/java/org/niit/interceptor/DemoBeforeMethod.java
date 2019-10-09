package org.niit.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

public class DemoBeforeMethod implements MethodBeforeAdvice,
		MethodInterceptor{
   
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("This is Method Before");
	}
  
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		try {
			System.out.println("This is invoke before");
			Object result = invocation.proceed();
			System.out.println("This is invoke after");
			return result;
		}catch(Exception e) {
			throw e;
		}
	}
}
