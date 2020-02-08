package com.atguigu.gmall0826.mock.util;

import java.util.Random;

/**
 * @ClassNameRandomNum
 * @Author Jayce· Luo
 * @Date2020/2/8 9:29
 */
public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }

}
