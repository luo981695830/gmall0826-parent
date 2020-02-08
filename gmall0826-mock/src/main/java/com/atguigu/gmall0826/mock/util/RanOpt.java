package com.atguigu.gmall0826.mock.util;

/**
 * @ClassNameRandomOpt
 * @Author Jayce· Luo
 * @Date2020/2/8 9:30
 */
public class RanOpt<T> {
    T value ;
    int weight;

    public RanOpt(T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

}
