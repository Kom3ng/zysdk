package org.abstruck.zysdk.util;

@FunctionalInterface
public interface ThrowableFunction<T,R> {
    R apply(T t) throws Exception;
}
