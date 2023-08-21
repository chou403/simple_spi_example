package org.example;

import java.util.ServiceLoader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ServiceLoader<InternetService> loader = ServiceLoader.load(InternetService.class);
        for (InternetService internetService : loader) {
            internetService.connectInternet();
        }
    }
}
