package task;

public class calc {
    
    public static void sum(int num1, int num2){
        int res = num1+num2;
        System.out.println("hasil dari "+num1+"+"+num2+" = "+res);
    }

    public static void subtract(int num1, int num2){
        int res = num1-num2;
        System.out.println("hasil dari "+num1+"-"+num2+" = "+res);
    }

    public static void divide(int num1, int num2){
        double res = num1/num2;
        System.out.println("hasil dari "+num1+"/"+num2+" = "+res);
    }

    public static void multiple(int num1, int num2){
        int res = num1*num2;
        System.out.println("hasil dari "+num1+"x"+num2+" = "+res);
    }
}
