package com.company;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    static Logger logq;

    public static void main(String[] args) {
        Calculator calc = new Calculator("True", "False");


        logq = Logger.getLogger(Main.class.getName());
        logq.info("Work");

        calc.conj();

       /* try {
            logq.info("Начало main, создаем лист с типизацией Integers");
            List<Integer> ints = new ArrayList<Integer>();
            logq.info("присваиваем лист Integers листу без типипзации");
            List empty = ints;
            logq.info("присваиваем лист без типипзации листу строк");
            List<String> string = empty;
            logq.info("добавляем строку \"бла бла\" в наш переприсвоенный лист, возможна ошибка");
            string.add(calc.conj());
            logq.info("добавляем строку \"бла 23\" в наш переприсвоенный лист, возможна ошибка");
            string.add(calc.disj());
            logq.info("добавляем строку \"бла 34\" в наш переприсвоенный лист, возможна ошибка");
            string.add(calc.mod());


            logq.info("выводим все элементы листа с типизацией Integers в консоль");
            for (Object anInt : ints) {
                System.out.println(anInt);
            }

            logq.info("Размер равен " + ints.size());
            logq.info("Получим первый элемент");
            Integer integer = ints.get(0);
            logq.info("выведем его в консоль");
            System.out.println(integer);

        }catch (Exception e){
            LOGGER.log(Level.WARNING,"что-то пошло не так" , e);
        }*/
    }
}