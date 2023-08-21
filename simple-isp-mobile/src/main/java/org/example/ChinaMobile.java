package org.example;

/**
 * {@code @author}  JSY
 * {@code @date} 2023/8/21
 * {@code @description} china mobile
 */
public class ChinaMobile implements InternetService{
    @Override
    public void connectInternet() {
        System.out.println("connect internet by [china mobile]");
    }
}
