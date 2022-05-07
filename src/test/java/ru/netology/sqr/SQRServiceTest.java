package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                "positive demo case, 200, 300, 3",
                "no numbers in range, 1, 50, 0",
                "boundary value testing, 100, 121, 2"
            }
    )
    void numberOfSquares(String testName, int leftBorder, int rightBorder, int expected) {
        SQRService service = new SQRService();
        int actual = service.numberOfSquares(leftBorder, rightBorder);
        assertEquals(expected, actual);
    }
}