package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void testCount(int expected, int bottomBound, int upperBound) {

        SQRService service = new SQRService();

        int actual = service.count(bottomBound, upperBound);
        Assertions.assertEquals(expected, actual);
    }
}
