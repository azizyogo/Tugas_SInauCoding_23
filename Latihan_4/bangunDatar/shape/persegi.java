package bangunDatar.shape;

import java.util.HashMap;

import bangunDatar.bangunDatar;

public class persegi extends bangunDatar {

    @Override
    public double keliling(HashMap<String, Double> hash) {
        // TODO Auto-generated method stub
        return 4*hash.get("sisi");
    }

    @Override
    public double luas(HashMap<String, Double> hash) {
        // TODO Auto-generated method stub
        return hash.get("sisi")*hash.get("sisi");
    }

    @Override
    public void show(String shape, Double luas, Double keliling) {
        // TODO Auto-generated method stub
        System.out.println("Luas "+shape+" adalah "+luas);
        System.out.println("Keliling "+shape+" adalah "+keliling);
    }   
}
