/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author tychu
 */
public class Punkt3D extends Punkt2D {

    private double z;

    public Punkt3D() {
        z=0;
    }

    public Punkt3D(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public String toString(){
        
        return "X: " + getX() + " Y: " + getY() + " Z: "+getZ()+"\n";
    }
    
    
    
    
    
    
}
