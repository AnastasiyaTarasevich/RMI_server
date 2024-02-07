package org.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

    public  class Main {
        public static void main(String[] args) {
            try {
                // Создание экземпляра реализации MyMathImpl
                MyMath mathService = new MyMathImpl();

                // Создание удаленного объекта
                MyMath stub = (MyMath) UnicastRemoteObject.exportObject(mathService, 0);
                // Создание реестра RMI на порту 1099
                Registry registry = LocateRegistry.createRegistry(1099);

                // Регистрация удаленного объекта в реестре под именем "MyMathService"
                registry.rebind("MyMathService", stub);

                System.out.println("RMI сервер запущен");
            } catch (Exception e) {
                System.err.println("Ошибка при запуске RMI сервера: " + e.getMessage());
            }
        }
    }
