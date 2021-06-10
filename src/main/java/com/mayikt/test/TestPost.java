package com.mayikt.test;

import lombok.var;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021/3/30
 * @time 10:09
 */
@SuppressWarnings("all")
public class TestPost {

//    1. @SuppressWarnings("unchecked")  [抑制单类型的警告]
//    2. @SuppressWarnings("unchecked","rawtypes")  [抑制多类型的警告]
//    3. @SuppressWarnings("all")  [ 抑制所有类型的警告]
    private static Object object;
    private static Object object1;

    @Test
    public static void main(String[] args) {

        System.out.println("我能有多骄傲，不堪一击好不好");
        System.out.println("大哥改的代码");
        System.out.println("主分支修改");
        //for 循环 for fori forr
        List<String> list=new ArrayList<>();
        for (String s : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //判空(非空) .null .notnull .nn
        Object o= new Object();

        if (o == null) {
            System.out.println("kong");
        }
        if (o != null) {
            System.out.println("feikong:"+o);
        }
        if (o != null) {

        }

        //boolean 取反 flag.if flag.not.if
        boolean flag=false;
        if (flag) {
            System.out.println("正确");
        }
        if (!flag) {
            System.out.println("错误");
        }

        //定义变量 .new .var .val .field
        Object o1 = new Object();
        final var o2 = new Object();
        object = new Object();
        object1 = new Object();//先new 在Object() 在.field

        //格式化字符串 .format
        String.format("hello %s", "world");
        System.out.println(String.format("hello %s", "world"));

        //同步锁 .synchronized
        Object lock=new Object();
        synchronized (lock) {
            System.out.println("cccccccccccc");
        }

        //异常捕获 .try
//        try {
//            shitMayhappen();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //输出 .sout .souf .soutv .serr
        String a="测试";
        System.out.println(a);//a.sout
//        System.out.printf("a2", a);//a.souf
        System.out.println("a = " + a);//a.soutv
//        System.err.println(a);

        //抛出异常 与 返回 .throw .return
//        return a;
//        throw new RuntimeException();

    }

    public static void shitMayhappen() throws Exception{
        throw new   RuntimeException("with error");
    }
}
