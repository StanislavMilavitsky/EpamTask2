package by.milavitsky.homework.task2.entity;

import by.milavitsky.homework.task2.color.Color;
import by.milavitsky.homework.task2.exception.IncorrectValueException;

import java.io.Serializable;
import java.util.ArrayList;

public class Basket implements Serializable {
    private final ArrayList<Ball> arrayBasket = new ArrayList<Ball>();
    private Ball ball;

    public Basket() {

    }


    public void addInBasket(int weight) {
        ball = new Ball();
        arrayBasket.add(ball);
        ball.setWeight(weight);

    }

    public void addInBasket(Ball ball) {
        arrayBasket.add(ball);
    }

    public void addInBasket(Color color) {
        ball = new Ball();
        arrayBasket.add(ball);
        ball.setColor(color);
    }

    public void addInBasket(int weight, Color color) {
        ball = new Ball();
        arrayBasket.add(ball);
        ball.setWeight(weight);
        ball.setColor(color);
    }

    public double getWeightOfBall(int index) throws IncorrectValueException {
        if (index < arrayBasket.size()) {
            ball = arrayBasket.get(index);
            return ball.getWeight();
        } else {
            throw new IncorrectValueException("Wrong index of ball, must be up to " + (arrayBasket.size() - 1));
        }
    }

    public Color getColorOfBall(int index) throws IncorrectValueException {
        if (index < arrayBasket.size()) {
            ball = arrayBasket.get(index);
            return ball.getColor();
        } else {
            throw new IncorrectValueException("Wrong index of ball, must be up to " + (arrayBasket.size() - 1));

        }

    }

    public Ball getBall(int index) throws IncorrectValueException {
        if (index < arrayBasket.size()) {
            return ball = arrayBasket.get(index);
        } else {
            throw new IncorrectValueException("Wrong index of ball, must be up to " + (arrayBasket.size() - 1));
        }
    }

    public ArrayList<Ball> getAllBall() {
        return new ArrayList<Ball>(arrayBasket);
    }


    public void removeFromBasketByIndex(int index) {
        arrayBasket.remove(index);
    }

    public void removeFromBasketByColor(Color color) {
        for (int i = 0; i < arrayBasket.size(); i++) {
            ball = arrayBasket.get(i);
            if (color == ball.getColor()) {
                arrayBasket.remove(i);

            }
        }
    }


    public void removeFromBasketByWeight(double weight) {
        for (int i = 0; i < arrayBasket.size(); i++) {
            ball = arrayBasket.get(i);
            if (weight == ball.getWeight()) {
                arrayBasket.remove(i);
            }
        }
    }

    public double receiveWeightOfAllBalls() {
        double weight = 0;
        for (Ball ball : arrayBasket) {
            weight = weight + ball.getWeight();
        }
        return weight;
    }

    public int receiveCountOfBalls() {
        return arrayBasket.size();
    }

    public int receiveNumberBallsColor(Color color) {
        int flag = 0;
        for (Ball ball : arrayBasket) {
            if (color == ball.getColor()) {
                flag++;
            }
        }
        return flag;
    }

    public void removeAllFromBasket() {
        arrayBasket.removeAll(arrayBasket);
    }


    public boolean isBasketEmpty() {
        return arrayBasket.isEmpty();
    }


}
