package com.advanced.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynaProxyHander implements InvocationHandler{
    private Object target;
    public Object newProxyInstance(Object target){
        this.target=target;
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    @Override
    
    // 动态代理类，目标对象必须实现接口
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        try {
            System.out.println("预处理");
            result=method.invoke(target, args);
            System.out.println("后处理");
        } catch (Exception e) {
            throw e;
        }
        return result;
    }
}
