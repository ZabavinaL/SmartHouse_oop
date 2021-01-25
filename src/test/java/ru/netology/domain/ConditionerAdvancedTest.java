package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerAdvancedTest {

    @Test
    public void checkGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        String expected = "Smart";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test // этот тест упадет из-за переменных без значений. по умолчанию, они все 0, а мы хотим получчить при сравнении 20
    public void setCurrentTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }
}
