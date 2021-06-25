package by.milavitsky.homework.task2.entity;

import by.milavitsky.homework.task2.color.Color;

import java.io.Serializable;
import java.util.Objects;

public class Ball implements Serializable {

    private double weight = 1; // сделаем по умолчанию веса мяча 1
    private Color color;

    public Ball() {
        this.color = Color.White; // по умолчанию

    }

    public Ball(Color color) {
        Objects.requireNonNull(color, "Requiret not null");
        this.color = color;

    }


    public Ball(double weight) {
        if (weight > 0 || weight < 10) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Incorrect weight. Weight must be from 1 to 9");
        }

    }

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        if (weight != ball.weight) {
            return false;
        }
        if (color == null) {
            return (color == ball.color);
        } else {
            return color.equals(ball.color);
        }
    }

    @Override
    public int hashCode() {
        return (int) (31 * weight + ((color == null) ? 0 : color.hashCode()));
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                " color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    double getWeight() {
        return this.weight;
    }

    Color getColor() {
        return this.color;
    }
}
