package ru.netology.Rush61;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldRestMounth(int income, int expenses, int threshold, int expected) {
        RestService service = new RestService();
        int actual = service.restCalc(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }

}
