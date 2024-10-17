package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exit = "";

        while (!exit.equals("exit")){
            int a = sc.nextInt();
            System.out.println("첫 번째 숫자: " + a);
            char operator = sc.next().charAt(0);
            System.out.println("사칙 연산기호: " + operator);
            int b = sc.nextInt();
            System.out.println("두 번째 숫자: " + b);

            double result = 0.0;



            if(operator == '+'){
                result = a + b;
            } else if(operator == '-'){
                result = a - b;
            } else if(operator == '*'){
                result = a * b;
            } else if(operator == '/') {
                if (b == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                } else {
                    result = (double) a / b;
                }
            } else {
                System.out.println("잘못된 기호를 입력했습니다.");
            }
            System.out.println(result);
            System.out.println("종료를 원하면 exit");
           exit = sc.nextLine();
        }

    }
}
