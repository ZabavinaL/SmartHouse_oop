package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void createConditioner() {
        Conditioner conditioner = new Conditioner();// создали объект
        assertEquals(0, conditioner.minTemperature);// проверяем значение полей
        assertEquals(0, conditioner.maxTemperature);
        assertEquals(0, conditioner.currentTemperature);
        assertNull(conditioner.name);
        assertFalse(conditioner.on);
    }

    @Test
    @Disabled
    public void shouldThrowNPE(){
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.name.length()); // проверяем длину String
    }

    @Test
    public void shouldChaneFields() {
        Conditioner conditioner = new Conditioner();// создали объект
        assertEquals(0, conditioner.minTemperature);// проверяем значение полей
        conditioner.minTemperature  =-100;
        assertEquals(-100, conditioner.minTemperature);
    }

}