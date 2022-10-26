package bangunDatar.shape;

import java.util.HashMap;

import bangunDatar.bangunDatar;

public class lingkaran extends bangunDatar {

    final Double pi = 3.14;

    @Override
    public double keliling(HashMap<String, Double> hash) {
        // TODO Auto-generated method stub
        return pi*(hash.get("r")*2);
    }

    @Override
    public double luas(HashMap<String, Double> hash) {
        // TODO Auto-generated method stub
        return pi*hash.get("r")*hash.get("r");
    }

    @Override
    public void show(String shape, Double luas, Double keliling) {
        // TODO Auto-generated method stub
        System.out.println("Luas "+shape+" adalah "+luas);
        System.out.println("Keliling "+shape+" adalah "+keliling);
    } 
}