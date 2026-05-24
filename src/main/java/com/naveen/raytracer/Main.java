package com.naveen.raytracer;

import com.naveen.raytracer.math.Vector3;

public class Main {
    public static void main(String[] args) {
        Vector3 vec1 = new Vector3(1, 2,3 );
        Vector3 vec2 = new Vector3(3, 4, 5);
        Vector3 vec3 = vec1.add(vec2);
        System.out.println(vec3.getX()+" " +vec3.getY()+" " +vec3.getZ());
    }
}
