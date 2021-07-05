package by.milavitsky.homework.task2.entity;

import by.milavitsky.homework.task2.color.Color;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {
    Basket basket;

    @Before
    public void setUp() throws Exception {
        basket = new Basket();
        basket.addInBasket(3, Color.White);
        basket.addInBasket(2, Color.Black);
    }

    @After
    public void tearDown() throws Exception {
        basket.removeAllFromBasket();
        basket = null;
    }

    @Test
    public void testRemoveFromBasketByIndexPositive() {
        basket.removeFromBasketByIndex(1);
        int actual = basket.receiveCountOfBalls();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void testRemoveFromBasketByIndexNegative() {
        basket.removeFromBasketByIndex(1);
        int actual = basket.receiveCountOfBalls();
        int expected = 2;
        assertNotEquals(expected, actual);
    }


    @Test
    public void testRemoveFromBasketByColorPositive() {
        basket.removeFromBasketByColor(Color.White);
        int actual = basket.receiveCountOfBalls();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFromBasketByColorNegative() {
        basket.removeFromBasketByColor(Color.White);
        int actual = basket.receiveCountOfBalls();
        int expected = 2;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testRemoveFromBasketByWeightPositive() {
        basket.removeFromBasketByWeight(3);
        int actual = basket.receiveCountOfBalls();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFromBasketByWeightNegative() {
        basket.removeFromBasketByWeight(3);
        int actual = basket.receiveCountOfBalls();
        int expected = 2;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testReceiveWeightOfAllBallsPositive() {
        double actual = basket.receiveWeightOfAllBalls();
        double expected = 5.0;
        double delta = 0.0001;
        assertEquals(expected, actual, delta);

    }

    @Test
    public void testReceiveWeightOfAllBallsNegative() {
        double actual = basket.receiveWeightOfAllBalls();
        double expected = 4.0;
        double delta = 0.0001;
        assertNotEquals(expected, actual, delta);

    }

    @Test
    public void testReceiveNumberBallsColorPositive() {
        int actual = basket.receiveNumberBallsColor(Color.White);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void testReceiveNumberBallsColorNegative() {
        int actual = basket.receiveNumberBallsColor(Color.White);
        int expected = 2;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testRemoveAllFromBasketPositive() {
        basket.removeAllFromBasket();
        int actual = basket.receiveCountOfBalls();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveAllFromBasketNegative() {
        basket.removeAllFromBasket();
        int actual = basket.receiveCountOfBalls();
        int expected = 1;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testIsBasketEmptyPositive() {
        boolean condition = new Basket().isBasketEmpty();
        assertTrue(condition);
    }
    @Test
    public void testIsBasketEmptyNegative() {
        boolean condition = basket.isBasketEmpty();
        assertFalse(condition);
    }

    @Test
    public void testReceiveCountOfBallsPositive() {
        int actual = basket.receiveCountOfBalls();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testReceiveCountOfBallsNegative() {
        int actual = basket.receiveCountOfBalls();
        int expected = 3;
        assertNotEquals(expected, actual);
    }
}