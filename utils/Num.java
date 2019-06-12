package com.itheima.ssm.utils;


//逢指定数字过
public class Num {
    public static void main(String[] args) {
       for (int i = 0; i <=300; i++) {
           if((i+"").contains("9") || i%9==0){
               System.out.println(i);
           }
        }
    }
}
