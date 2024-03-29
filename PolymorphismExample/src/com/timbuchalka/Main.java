package com.timbuchalka;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine() ";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate() ";
    }
    public String brake() {
        return getClass().getSimpleName() + " -> brake() ";
    }

    class Mitsubishi extends Car {
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " -> startEngine() ";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + " -> accelerate() ";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + " -> brake() ";
        }
    }

    class Holden extends Car{
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " -> startEngine() ";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + " -> accelerate() ";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + " -> brake() ";
        }
    }

    class Ford extends Car {
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " -> startEngine() ";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + " -> accelerate() ";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + " -> brake() ";
        }
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}
