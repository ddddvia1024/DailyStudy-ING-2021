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
     * ��̬�����������÷Ǿ�̬��Դ�������þ�̬��Դ
     * @param args ����
     */
    public static void main(String[] args){
//        i=1;  ������̬�����������÷Ǿ�̬��Դ
        j=1; //��̬���������þ�̬��Դ

    }

    /**
     * �Ǿ�̬���������þ�̬��Դ
     */
    private void testUnStatic(){
        i=1;
        j=1;
        testStatic();
    }

    /**
     * ��̬����
     */
    public static void testStatic(){
        j=1;
    }
}
