package com.ddddvia.daily.staticpoint;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class StaticPoint {

    private int i=1;

    private static int j=1;

    /**
     * 静态方法不能引用非静态资源，能引用静态资源
     * @param args 参数
     */
    public static void main(String[] args){
//        i=1;  报错，静态方法不能引用非静态资源
        j=1; //静态方法能引用静态资源

    }

    /**
     * 非静态方法能引用静态资源
     */
    private void testUnStatic(){
        i=1;
        j=1;
        testStatic();
    }

    /**
     * 静态方法
     */
    public static void testStatic(){
        j=1;
    }
}
