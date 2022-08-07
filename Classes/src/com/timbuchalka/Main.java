package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car holden = new Car();
//        System.out.println("Model is "+porsche.getModel()); // OUT WILL BE "Model is null"
        porsche.setModel("911");  // Carrera PRIVATE WE CANNOT ACCESS THE CLASS
        System.out.println("Model is "+porsche.getModel());

    }
}
