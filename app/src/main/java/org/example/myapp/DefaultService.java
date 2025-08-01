package org.example.myapp;

import org.springframework.stereotype.Service;

@Service
public class DefaultService {

    public String getGreeting(String name) {
        try {
            // 비즈니스 로직 처리 시간을 시뮬레이션하기 위해 1초 대기
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Hello, " + name + "!";
    }
}
