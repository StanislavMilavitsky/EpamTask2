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
        System.out.println(basket.getAllBall());
        System.out.println(basket.sizeAllOfBasket());
        System.out.println(basket.getColorOfBall(2));
        System.out.println(basket.isBasketEmpty());
        System.out.println(basket.getWeightOfBall(2));
        System.out.println(basket.getBall(2));
        basket.removeFromBasketByWeight(5);// по всем цветам, со всеми такими массами
        basket.removeFromBasketByIndex(2);
        basket.removeFromBasketByColor(Color.Red);
        System.out.println(basket.getAllBall());
        System.out.println(basket.getWeightOfAllBalls());
        basket.addInBasket(new Ball(Color.Red));
        System.out.println(basket.getNumberBallsColor(Color.Red));

    }
}
