package service;

import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {

        int actual = service.remain(200);
        int expected = 800;
        assertEquals(actual,expected);
    }

    @Test
    public void testRemainAmountLessBoundary() {

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual,expected);
    }

    @Test
    public void testRemainAmountMoreBoundary() {

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual,expected);
    }

    @Test
    public void testRemainAmountBoundary() {

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}