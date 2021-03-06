package com.abners.nettyrpc.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类RpcReference.java的实现描述：RPC消费者数据
 *
 * @author baoxing.peng 2021年02月26日 10:14:37
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RpcReference {

}
