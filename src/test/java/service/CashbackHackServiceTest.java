package service;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {

        int actual = service.remain(300);
        int expected = 700;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainAmountLessBoundary() {

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainAmountMoreBoundary() {

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

//    @Test
//    public void testRemainAmountBoundary() {
//
//        int actual = service.remain(1000);
//        int expected = 0;
//        assertEquals(expected, actual);
//    }
}