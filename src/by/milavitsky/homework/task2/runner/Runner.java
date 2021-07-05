package by.milavitsky.homework.task2.runner;

import by.milavitsky.homework.task2.entity.Ball;
import by.milavitsky.homework.task2.entity.Basket;
import by.milavitsky.homework.task2.color.Color;
import by.milavitsky.homework.task2.exception.IncorrectValueException;


public class Runner {
    public static void main(String[] args) throws IncorrectValueException {
        Basket basket = new Basket();
        basket.addInBasket(new Ball(Color.Black, 5));
        basket.addInBasket(new Ball(Color.Red, 7));
        basket.addInBasket(new Ball(Color.White));
        basket.addInBasket(new Ball(Color.Red, 9));
        basket.removeFromBasketByWeight(5);// по всем цветам, со всеми такими массами
        basket.removeFromBasketByIndex(2);
        basket.removeFromBasketByColor(Color.Red);
        System.out.println(basket.getAllBall());
        System.out.println(basket.receiveWeightOfAllBalls());
        basket.addInBasket(new Ball(Color.Red));
        System.out.println(basket.receiveNumberBallsColor(Color.Red));

    }
}
