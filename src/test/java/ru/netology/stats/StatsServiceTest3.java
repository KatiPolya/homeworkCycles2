package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest3 {

    @Test
    void shouldCalculateMinimalSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinimalSale(sales);
        assertEquals(expected, actual);
    }
}