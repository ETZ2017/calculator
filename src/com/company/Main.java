package com.company;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    static Logger LOGGER;
    static Logger log;
    static {
        try(FileInputStream ins = new FileInputStream("C:\\logs.txt")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
            log = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator("True", "False");

        try {
            log.info("Начало main, создаем лист с типизацией Integers");
            List<Integer> ints = new ArrayList<Integer>();
            log.info("присваиваем лист Integers листу без типипзации");
            List empty = ints;
            log.info("присваиваем лист без типипзации листу строк");
            List<String> string = empty;
            log.info("добавляем строку \"бла бла\" в наш переприсвоенный лист, возможна ошибка");
            string.add(calc.conj());
            log.info("добавляем строку \"бла 23\" в наш переприсвоенный лист, возможна ошибка");
            string.add(calc.disj());
            log.info("добавляем строку \"бла 34\" в наш переприсвоенный лист, возможна ошибка");
            string.add(calc.mod());


            log.info("выводим все элементы листа с типизацией Integers в консоль");
            for (Object anInt : ints) {
                System.out.println(anInt);
            }

            log.info("Размер равен " + ints.size());
            log.info("Получим первый элемент");
            Integer integer = ints.get(0);
            log.info("выведем его в консоль");
            System.out.println(integer);

        }catch (Exception e){
            LOGGER.log(Level.WARNING,"что-то пошло не так" , e);
        }
    }
}