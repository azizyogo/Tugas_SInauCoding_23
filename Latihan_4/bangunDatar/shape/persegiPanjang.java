package bangunDatar.shape;

import java.util.HashMap;

import bangunDatar.bangunDatar;

public class persegiPanjang extends bangunDatar {

    @Override
    public double keliling(HashMap<String, Double> hash) {
        // TODO Auto-generated method stub
        return 2*(hash.get("p") + hash.get("l"));
    }

    @Override
    public double luas(HashMap<String, Double> hash) {
        // TODO Auto-generated method stub
        return hash.get("p") * hash.get("l");
    }

    @Override
    public void show(String shape, Double luas, Double keliling) {
        // TODO Auto-generated method stub
        System.out.println("Luas "+shape+" adalah "+luas);
        System.out.println("Keliling "+shape+" adalah "+keliling);
    }
    
}
