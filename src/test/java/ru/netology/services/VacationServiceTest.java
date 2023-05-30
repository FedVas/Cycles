package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Vacation.csv")
    public void salary10_000(int exepted, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        //     int exepted = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(exepted, actual);

    }
}





