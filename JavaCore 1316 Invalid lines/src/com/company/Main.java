package com.company;

/*

1316 Некорректные строки
http://wikijava.it-cache.net/index.php@title=Glava_9_Thinking_in_Java_4th_edition.html
Level 13 Lection 11. Некорректные строки

Удали все некорректные строки в интерфейсе Button.
Требования:
1. Интерфейс SimpleObject должен быть объявлен внутри класса Solution.
2. Интерфейс Button должен быть объявлен внутри класса Solution.
3. Метод main менять нельзя.
4. В интерфейсе Button должно остаться объявление константы NAME.
5. В интерфейсе Button должно остаться корректное объявление метода onPress.



 */

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        String onPress(Object o);

    }
}






