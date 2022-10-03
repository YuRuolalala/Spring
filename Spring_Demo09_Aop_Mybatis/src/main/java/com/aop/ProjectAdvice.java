package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    //匹配业务层的所有接口
    @Pointcut("execution(* com.service.*Service.*(..))")
    private void Servicept(){}

    @Around("Servicept()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String classname = signature.getDeclaringTypeName();
        String methodname = signature.getName();

        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++) {
            Object ret = pjp.proceed();
        }
        long end = System.currentTimeMillis();

        System.out.println(classname+"."+methodname+"方法执行一万次用了---->"+(end-start)+"ms");
    }

}
