package com.collections;

@FunctionalInterface
public interface Selector {
    void select(IntegerArray someArray, String method);
}