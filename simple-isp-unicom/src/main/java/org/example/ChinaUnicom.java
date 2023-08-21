package org.example;

/**
 * {@code @author}  JSY
 * {@code @date} 2023/8/21
 * {@code @description} china unicom
 */
public class ChinaUnicom implements InternetService{
    @Override
    public void connectInternet() {
        System.out.println("connect internet by [China Unicom]");
    }
}
