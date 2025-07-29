package org.example.myapp;

import org.example.utils.Utils;

import com.google.common.base.Joiner;

/**
 * App 클래스는 "Hello" 메시지를 콘솔에 출력하는 간단한 자바 애플리케이션입니다.
 * <p>
 * 이 클래스는 프로그램의 진입점인 {@code main} 메서드를 포함하고 있습니다.
 *
 * @author KimJiHun
 * @version 1.0
 * @since 2025-07-29
 */
public class App {

    /**
     * 프로그램의 실행이 시작되는 메인 메서드입니다.
     * <p>
     * "Hello"를 표준 출력으로 인쇄합니다.
     *
     * @param args 명령줄 인수로, 이 애플리케이션에서는 사용되지 않습니다.
     */
    public static void main(String[] args) { // entry point
        Utils.printMessage("Hello!");
        String message = Joiner.on(", ").join("Hello", "world!");
        System.out.println(message);
    }
}