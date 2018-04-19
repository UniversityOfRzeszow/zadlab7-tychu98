/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

import java.util.Random;

/**
 *
 * @author tychu
 */
public class Punkt2D {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    

    Random generator = new Random();

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    public double Random(){
        double p = (generator.nextDouble() - 0.5) * 20;
        p*=1000;
        p=Math.round(p);
        p/=1000;
        System.out.println(p);
        return p;
    }

    @Override
    public String toString() {
        return "X: " + getX() + " Y: " + getY();
    }

}
