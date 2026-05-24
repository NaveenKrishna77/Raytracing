package com.naveen.raytracer.math;

public class Vector3 {

    private double x;
    private double y;
    private double z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public Vector3 add(Vector3 v) {
        Vector3 result = new Vector3(this.x, this.y, this.z);
        result.setX(this.x + v.getX());
        result.setY(this.y + v.getY());
        result.setZ(this.z + v.getZ());

        return result;
    }

    public Vector3 subtract(Vector3 v) {
        return new Vector3(this.x - v.getX(), this.y - v.getY(), this.z - v.getZ());
    }
    
    public Vector3 multiply(double scalar) {
        return new Vector3(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public double dot(Vector3 v) {
        return (this.x * v.getX() + this.y * v.getY() + this.z * v.getZ());
    }


}
