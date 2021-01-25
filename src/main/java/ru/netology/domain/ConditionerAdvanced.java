package ru.netology.domain;

public class ConditionerAdvanced {
    String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() { // getter - метод, который возвращает значение приветного поля
        return name;
    }

    public void setName(String name) { //setter - метод, который устанавливает новое значение приватного поля
        this.name = name;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return; // Early Exit - подход, при котором мы проверяем условие и, если результат проверки на не устраивает, выходим из функции
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }
}
