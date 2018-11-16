package com.cos.aop;


import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice {
	
	@Before("execution(* com.cos.service.*.*(..))")
	public void startLog(JoinPoint jp) {
		System.out.println("하하하하하하하하하하");
		//System.out.println(Arrays.toString(jp.getArgs()));
	}
}
