package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    public void salary10_000() {
        VacationService service = new VacationService();
        int exepted = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(exepted, actual);

    }

    @Test
    public void salary100_000() {
        VacationService service = new VacationService();
        int exepted = 2;
        int actual = service.calculate(100_000, 60000, 150_000);

        Assertions.assertEquals(exepted, actual);

    }

}




